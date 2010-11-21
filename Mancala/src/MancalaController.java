import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
import javax.swing.Timer;




public class MancalaController {

	private static Mancala mancalaGame;	// model of the game
	private static MancalaView mancalaView;
	private static Game gameType;
	static ServerSocket gameServer = null;
	static Socket gameClient = null;
	static int port = 13128;
    static DataOutputStream os = null;
    static PrintStream ps = null;
    static DataInputStream is = null;
    static boolean server = false;
    static boolean client = false;
    static Timer timer;

    // two different game logic, where in HOTSEAT mode both players pits can be played and in server
    // mode one player pit is accessed
	enum Game {
		HOTSEAT, SERVER
	}

	/**
	 * Constructor class for creating Controller class in Mancala game
	 * 
	 * @param mancalaGame - game model
	 * @param mancalaView - game view
	 */
	MancalaController(Mancala mancalaGame, MancalaView mancalaView){
		this.mancalaGame = mancalaGame;
		this.mancalaView = mancalaView;

		mancalaView.addListener(new MotionListener());
		mancalaView.addListener(new SelectListener());

		// set default view to menu
		mancalaView.setView(MancalaView.Views.MENU);
	}
	
	/**
	 * Restart menu state, when something goes wrong and close network sockets, when they are opened
	 */
	public static void restartState(){
		mancalaView.setView(MancalaView.Views.MENU);
		mancalaView.repaint();
		if(server){
			server = false;
			// close server and client connection
			if(gameServer != null){
				try {
					gameServer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(gameClient != null){
				try {
					gameClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if(client){
			client = false;
			// close client connection
			if(gameClient != null){
				try {
					gameClient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Waits other player turn in network mode
	 * 
	 * @return returns int type value where network player has taken its seeds from, when -1, then player has not responded yet
	 */
	public static int waitResponse(){
		int response = -1;
        try {
        	if(server){
        		// if we have bytes in socket, then read, otherwise, don't block
        		if(is.available() > 0){
	    			char recieve = (char) is.readByte();
	    			if(recieve > 47 && recieve < 54){
	        			response = Integer.parseInt(String.valueOf(recieve));
	    			}
        		}
        	} else {
        		// if we have bytes in socket, then read, otherwise, don't block
        		if(is.available() > 0){
	    			char recieve = (char) is.readByte();
	    			if(recieve > 47 && recieve < 54){
	        			response = Integer.parseInt(String.valueOf(recieve));
	    			}
        		}
        	}
		} catch (IOException e) {
			System.out.println("Some unexpected error occured: " + e);
			mancalaView.showMessage("Some unexpected error occured: " + e);
			
			restartState();
		}
		return response;
	}	
	
	/**
	 * Creates server and waits for client to connect
	 */
	public void createServer(){
		System.out.println("Starting server and waiting client to connect...");
		server = true;
		try {
	       gameServer = new ServerSocket(port);
        }
        catch (IOException e) {
           System.out.println("Cannot create server socket: " + e);
           mancalaView.showMessage("Cannot create server socket: " + e);

   			restartState();
        }
        try {
        	mancalaView.setView(MancalaView.Views.WAITING);
        	mancalaView.repaint();
            gameClient = gameServer.accept();
            is = new DataInputStream(gameClient.getInputStream());
            ps = new PrintStream(gameClient.getOutputStream());
            mancalaView.setView(MancalaView.Views.NETWORK);
        	mancalaView.repaint();
         }
         catch (IOException e) {
            System.out.println("Cannot create client socket: " + e);
            mancalaView.showMessage("Cannot create client socket: " + e);

   			restartState();
         }
         if(server){
     		timer = new Timer(500, new ThreadListener());
     		timer.setInitialDelay(1000);
     		timer.start(); 
         }
	}
	
	/**
	 * Ask user to input host name and tries to connect with server
	 */
	public void connectWithServer(){
		String host = JOptionPane.showInputDialog(null, "Enter host name or IP: ", "Connect with server", 1);
		System.out.println("Connecting with server, please wait...");
		client = true;
        try {
            gameClient = new Socket(host, port);
            os = new DataOutputStream(gameClient.getOutputStream());
            is = new DataInputStream(gameClient.getInputStream());
        } catch (UnknownHostException e) {
            System.err.println("Unknown host " + host);
            mancalaView.showMessage("Unknown host " + host);    		

   			restartState();
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: " + host);
            mancalaView.showMessage("Couldn't get I/O for the connection to: " + host);	

   			restartState();
        }
        if(client){
    		timer = new Timer(500, new ThreadListener());
    		timer.setInitialDelay(1000);
    		timer.start(); 
        }
	}

	class MotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// do nothing
		}

		/**
		 * Show actions made by hovering the mouse in JFrame, highlighting buttons, pits etc.
		 */
		@Override
		public void mouseMoved(MouseEvent arg0) {
			// logic in menu
			mancalaView.setActivePit(-1);
			if(mancalaView.getView() == MancalaView.Views.MENU){
				for(int i = 0; i < 5; i++){
					if(arg0.getX() > 280 && arg0.getX() < 527 &&
							arg0.getY() > 94 + i * 45 && arg0.getY() < 129 + i * 45){
						mancalaView.setActivePit(i);
					}
				}
				mancalaView.repaint();
			} else if(mancalaView.getView() == MancalaView.Views.HOTSEAT ||
					mancalaView.getView() == MancalaView.Views.NETWORK){
				// if it is our move, highlight our pits
				if(mancalaGame.checkWin() == null){
					// check if we play in server mode, if yes, then only home player turns are allowd
					// in hotseat, both pits can be selected
					if((gameType == Game.SERVER && mancalaView.getHomePlayer().getTurn()) ||
							gameType == Game.HOTSEAT){
						// in hotseat mode, select player with correct turn, otherwise check
						// if homeplayer is first or second player
						if((gameType == Game.SERVER && mancalaView.getHomePlayerInt() == 0) ||
								(gameType == Game.HOTSEAT && mancalaGame.getPlayer(0).getTurn())){
							for (int i = 0; i < 6; i++) {
								if(arg0.getX() > 139 + 90 * i && arg0.getX() < 210 + 90 * i &&
										arg0.getY() > 273 && arg0.getY() < 341){
									mancalaView.setActivePit(i);
								}					
							}
						} else {
							for (int i = 0; i < 6; i++) {
								if(arg0.getX() > 591 - 90 * i && arg0.getX() < 660 - 90 * i &&
										arg0.getY() > 103 && arg0.getY() < 169){
									mancalaView.setActivePit(i);
								}					
							}					
						}
					}
					mancalaView.repaint();			
				}		
			}
		}
	}

	class ThreadListener implements ActionListener {

		@Override
		/**
		 * Refresh and checks, if there is any data sent to socket, if yes, return it 
		 * and make move in game. This Thread is made in purpose that socket would not
		 * block the JFrame and users can still see view state and exit game.
		 */
		public void actionPerformed(ActionEvent e) {
			if(server || client){
				int move = waitResponse();
				if(move > -1 && !mancalaView.getHomePlayer().getTurn()){
					mancalaGame.getPlayerWithTurn().playPit(move);
					// if other player recieves end game first
					if(mancalaGame.checkWin() != null){
						// game state is over, notify view about this
						mancalaView.setView(MancalaView.Views.VICTORY);
					}
					mancalaView.repaint();
				}
			}
		}
		
	}
	
	class SelectListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// do nothing
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// do nothing
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// do nothing
		}

		@Override
		/**
		 * All the logic related to clicks in JFrame, starting game, hosting game, joining game, exiting game, 
		 * selecting pit.
		 */
		public void mousePressed(MouseEvent arg0) {
			System.out.println(arg0.getX() + " " + arg0.getY());
			// menu clicking logic
			if(mancalaView.getView() == MancalaView.Views.MENU){
				int selection = -1;
				for(int i = 0; i < 5; i++){
					if(arg0.getX() > 280 && arg0.getX() < 527 &&
							arg0.getY() > 94 + i * 45 && arg0.getY() < 129 + i * 45){
						selection = i;
					}
				}
				// gets the information, which button user pressed
				if(selection == 0){
					mancalaGame = new Mancala();
					mancalaView.setMancalaGame(mancalaGame);
					gameType = Game.HOTSEAT;
					mancalaView.setView(MancalaView.Views.HOTSEAT);
					mancalaView.setHomePlayer(0);
				} else if(selection == 1){
					mancalaGame = new Mancala();
					mancalaView.setMancalaGame(mancalaGame);
					gameType = Game.SERVER;
					mancalaView.setView(MancalaView.Views.NETWORK);
					createServer();
					mancalaView.setHomePlayer(0);
				} else if(selection == 2){
					mancalaGame = new Mancala();
					mancalaView.setMancalaGame(mancalaGame);
					gameType = Game.SERVER;
					mancalaView.setView(MancalaView.Views.NETWORK);
					connectWithServer();
					mancalaView.setHomePlayer(1);
				} else if(selection == 4){
					System.exit(0);
				}
				mancalaView.setActivePit(-1);
				mancalaView.repaint();
			} else if(mancalaView.getView() == MancalaView.Views.HOTSEAT ||
					mancalaView.getView() == MancalaView.Views.NETWORK){
				// check if game is canceled
				if(arg0.getX() > 342 && arg0.getX() < 463 &&
						arg0.getY() > 30 && arg0.getY() < 51){
					restartState();
				}
				// check game state, if game is over or not
				if(mancalaGame.checkWin() == null){
					// check if we play in server mode, if yes, then only home player turns are allowd
					// in hotseat, both pits can be selected			
					if((gameType == Game.SERVER && mancalaView.getHomePlayer().getTurn()) ||
							gameType == Game.HOTSEAT){
						// in hotseat mode, select player with correct turn, otherwise check
						// if homeplayer is first or second player
						if((gameType == Game.SERVER && mancalaView.getHomePlayerInt() == 0) ||
								(gameType == Game.HOTSEAT && mancalaGame.getPlayer(0).getTurn())){
							for (int i = 0; i < 6; i++) {
								if(arg0.getX() > 139 + 90 * i && arg0.getX() < 210 + 90 * i &&
										arg0.getY() > 273 && arg0.getY() < 341){
									if(!mancalaGame.getPlayerWithTurn().playPit(i)){
										mancalaView.showMessage("Not a valid move!");
									} else {
										if(server){
						                    ps.println(String.valueOf(i));
										} else if(client) {
											try {
												os.writeBytes(String.valueOf(i));
											} catch (IOException e) {
												mancalaView.showMessage("Unexpected error occured when sendind client move to server: " + e);
											} 
										}
									}
								}					
							}
						} else {
							for (int i = 0; i < 6; i++) {
								if(arg0.getX() > 591 - 90 * i && arg0.getX() < 660 - 90 * i &&
										arg0.getY() > 103 && arg0.getY() < 169){
									if(!mancalaGame.getPlayerWithTurn().playPit(i)){
										mancalaView.showMessage("Not a valid move!");
									} else if(server){
					                    ps.println(String.valueOf(i));
									} else if(client) {
										try {
											os.writeBytes(String.valueOf(i));
										} catch (IOException e) {
											mancalaView.showMessage("Unexpected error occured when sendind client move to server: " + e);
										} 
									}
								}					
							}					
						}
						mancalaView.setActivePit(-1);
						mancalaView.repaint();
					}
				}
	
				if(mancalaGame.checkWin() != null){
					// game state is over, notify view about this
					mancalaView.setView(MancalaView.Views.VICTORY);
				}
			} else if(mancalaView.getView() == MancalaView.Views.VICTORY ){
				mancalaView.setView(MancalaView.Views.MENU);
				// stop timer for checking, if any packets are left, also disconnect from server
				if(timer != null){
					timer.stop();
				}
				restartState();
			}
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// do nothing
		}

	}
}
