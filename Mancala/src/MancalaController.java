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
	static MancalaHistory mancalaHistory = null;

	// two different game logic, where in HOTSEAT mode both players pits can be played and in server
	// mode one player pit is accessed
	enum Game {
		HOTSEAT, SERVER
	}

	private MancalaLog m_log;
	private MancalaObjectDiagrams m_objectDiagrams;
	
	// TAAVETI FUNKTSIOONID, TA ON ISE VIST MIDAGI ÄRA TEINUD, NEED ON LIHTSALT TESTIKS
	void StartGame(int player_number){
		m_log = new MancalaLog("mancala.txt", true);
		m_objectDiagrams = new MancalaObjectDiagrams(true); 
		/*System.out.println("Player " + player_number + " starts the game");*/
	}

	void EndGame(int player_won, int player1_seeds, int player2_seeds ){
		
		MancalaGamesResultsLog.Add(player_won, player1_seeds, player2_seeds);
		//System.out.println("Player " + player_won + " wins game. P1 " + player1_seeds + " P2 " + player2_seeds);
	}

	private int userstoryCounter = 0;
	void BeforeAction(int[] player1_pits, int player1_store, int[] player2_pits, int player2_store, int whos_turn){
		userstoryCounter++;
		m_objectDiagrams.Write(
				userstoryCounter,
				false,
				"Precondition", 
				player1_pits, player1_store, player2_pits, player2_store, whos_turn);
		m_log.WriteUserStoryHeader(userstoryCounter);
		m_log.WritePreCondition(
				player1_pits, 
				player1_store, 
				player2_pits, 
				player2_store,
				whos_turn);
		/*
		System.out.print("Player 1 stats ");
		for(int i = 0; i < player1_pits.length; i++){
			System.out.print("pit " + (i + 1) + " has " + player1_pits[i] + " seeds, ");
		}
		System.out.println("store has " + player1_store + " seeds.");
		System.out.print("Player 2 stats ");
		for(int i = 0; i < player2_pits.length; i++){
			System.out.print("pit " + (i + 1) + " has " + player2_pits[i] + " seeds, ");
		}
		System.out.println("store has " + player2_store + " seeds.");
		System.out.println("It is player " + whos_turn + " turn");*/
	}

	void InAction(int whos_turn, int pit_num, int seeds, int condition_code, int number_of_captured){
		m_log.WriteAction(
				whos_turn, 
				pit_num, seeds,
				condition_code, number_of_captured);
		/*
		for(int i=0; i<6; i++)
			System.out.println(
					mancalaGame.getPlayer(whos_turn-1).getSeedsFromPit(i));
		*/
		/*System.out.println("Player " + whos_turn + " turn. Takes from pit " + pit_num + ". Condition code " + condition_code + 
				". Number of caputres from other side " + number_of_captured);*/
	}

	void AfterAction(int[] player1_pits, int player1_store, int[] player2_pits, int player2_store, int whos_turn){
		m_objectDiagrams.Write(
				userstoryCounter, 
				false,
				"Postcondition", 
				player1_pits, player1_store, player2_pits, player2_store, whos_turn);
		m_log.WritePostCondition(
				player1_pits, 
				player1_store, 
				player2_pits, 
				player2_store,
				whos_turn);
		/*
		System.out.print("Player 1 stats ");
		for(int i = 0; i < player1_pits.length; i++){
			System.out.print("pit " + (i + 1) + " has " + player1_pits[i] + " seeds, ");
		}
		System.out.println("store has " + player1_store + " seeds.");
		System.out.print("Player 2 stats ");
		for(int i = 0; i < player2_pits.length; i++){
			System.out.print("pit " + (i + 1) + " has " + player2_pits[i] + " seeds, ");
		}
		System.out.println("store has " + player2_store + " seeds.");
		System.out.println("It is player " + whos_turn + " turn");*/
	}

	private String[][] GetHistory(){
		/*
		String s[][] = {
			{"1", "Player 1", "32", "Player 2", "52", "Player 2 won"},
			{"1", "Player 1", "32", "Player 2", "32", "Draw"}
			};*/
		return MancalaGamesResultsLog.ReadHistory();
	}
	
	// TAAVETI FUNKTSIOONID LÕPP

	// MINU FUNKTSIOONID, ET ÜHTIKS TAAVETI ETTEANTUD KRITEERIUMITE JÄRGi
	void startGame(){
		if(mancalaGame.getPlayer(0).getTurn()){
			StartGame(1);			
		} else {
			StartGame(2);
		}
	}

	void endGame(){
		int player_won = (mancalaGame.getPlayer(0).countSeeds() > mancalaGame.getPlayer(1).countSeeds() ? 1 : 2);
		if(mancalaGame.getPlayer(0).countSeeds() == mancalaGame.getPlayer(1).countSeeds()){
			player_won = 0;
		}
		EndGame(player_won, mancalaGame.getPlayer(0).countSeeds(), 
				mancalaGame.getPlayer(1).countSeeds());		
	}

	void beforeAction(){
		int[] p1_pits = new int[6];
		int[] p2_pits = new int[6];
		int p1_seeds = mancalaGame.getPlayer(0).getSeedsFromStore();
		int p2_seeds = mancalaGame.getPlayer(1).getSeedsFromStore();
		for(int i = 0; i < 6; i++){
			p1_pits[i] = mancalaGame.getPlayer(0).getSeedsFromPit(i);
			p2_pits[i] = mancalaGame.getPlayer(1).getSeedsFromPit(i);
		}

		int player_turn = (mancalaGame.getPlayer(0).getTurn() ? 1 : 2);
		BeforeAction(p1_pits, mancalaGame.getPlayer(0).getSeedsFromStore(),
				p2_pits, mancalaGame.getPlayer(1).getSeedsFromStore(), player_turn);
	}

	void inAction(int pit){
		int player_turn = (mancalaGame.getPlayer(0).getTurn() ? 1 : 2);
		// check if last seed lands in store
		int condition = 0;
		int other_seeds = 0;
		int seeds = mancalaGame.getPlayerWithTurn().getSeedsFromPit(pit);
		if(seeds == 6 - pit){
			condition = 1;
		}
		// check if last seed lands in empty pit, take another players pit seeds
		if(seeds + pit < 6 && mancalaGame.getPlayerWithTurn().getSeedsFromPit(seeds + pit) == 0){
			condition = 2;
			other_seeds = mancalaGame.getPlayerWithTurn().getOtherPlayerPit(6 - seeds + pit).countSeeds();
		}
		InAction(player_turn, pit + 1, seeds, condition, other_seeds);
	}

	void afterAction(){
		int[] p1_pits = new int[6];
		int[] p2_pits = new int[6];
		for(int i = 0; i < 6; i++){
			p1_pits[i] = mancalaGame.getPlayer(0).getSeedsFromPit(i);
			p2_pits[i] = mancalaGame.getPlayer(1).getSeedsFromPit(i);
		}

		int player_turn = (mancalaGame.getPlayer(0).getTurn() ? 1 : 2);
		AfterAction(p1_pits, mancalaGame.getPlayer(0).getSeedsFromStore(),
				p2_pits, mancalaGame.getPlayer(1).getSeedsFromStore(), player_turn);
	}

	// MINU FUNKTSIOONID LÕPP

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
			mancalaView.showMessage("Waiting for player to connect!");
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
					startGame();	//taavetile
				} else if(selection == 1){
					mancalaGame = new Mancala();
					mancalaView.setMancalaGame(mancalaGame);
					gameType = Game.SERVER;
					mancalaView.setView(MancalaView.Views.NETWORK);
					createServer();
					mancalaView.setHomePlayer(0);
					startGame();	//taavetile
				} else if(selection == 2){
					mancalaGame = new Mancala();
					mancalaView.setMancalaGame(mancalaGame);
					gameType = Game.SERVER;
					mancalaView.setView(MancalaView.Views.NETWORK);
					connectWithServer();
					mancalaView.setHomePlayer(1);
					startGame();	//taavetile
				} else if(selection == 3){
					String[][] history = GetHistory();
					// check if we already have generated JFrame, if not create it
					if(mancalaHistory == null){
						mancalaHistory = new MancalaHistory(history);
					} else {
						// if we have already generated JFrame, just update its content
						//TODO: write setter function for this
						mancalaHistory = new MancalaHistory(history);
						mancalaHistory.setVisible(true);
					}
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
					endGame();
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
									// taavetile algus, mängu loogika jaoks pole vajalik
									int[] p1_pits = new int[6];
									int[] p2_pits = new int[6];
									int p1_seeds = mancalaGame.getPlayer(0).getSeedsFromStore();
									int p2_seeds = mancalaGame.getPlayer(1).getSeedsFromStore();
									for(int li = 0; li < 6; li++){
										p1_pits[li] = mancalaGame.getPlayer(0).getSeedsFromPit(li);
										p2_pits[li] = mancalaGame.getPlayer(1).getSeedsFromPit(li);
									}

									int player_turn = (mancalaGame.getPlayer(0).getTurn() ? 1 : 2);

									int condition = 0;
									int other_seeds = 0;
									int seeds = mancalaGame.getPlayerWithTurn().getSeedsFromPit(i);
									if(seeds == 6 - i){
										condition = 1;
									}
									// check if last seed lands in empty pit, take another players pit seeds
									if((seeds + i) % 14 < 6 && mancalaGame.getPlayerWithTurn().getSeedsFromPit(seeds + i) == 0){
										condition = 2;
										other_seeds = mancalaGame.getPlayerWithTurn().getOtherPlayerPit(5 - (seeds + i) % 14).countSeeds();
									}
									// taavetile lõpp
									if(!mancalaGame.getPlayerWithTurn().playPit(i)){
										mancalaView.showMessage("Not a valid move!");
									} else {
										// taavetile algus, mängu loogika jaoks pole vajalik
										BeforeAction(p1_pits, p1_seeds,
												p2_pits, p2_seeds, player_turn);
										InAction(player_turn, i + 1, seeds, condition, other_seeds);
										afterAction();
										// taavetile lõpp

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
									// taavetile algus, mängu loogika jaoks pole vajalik
									int[] p1_pits = new int[6];
									int[] p2_pits = new int[6];
									int p1_seeds = mancalaGame.getPlayer(0).getSeedsFromStore();
									int p2_seeds = mancalaGame.getPlayer(1).getSeedsFromStore();
									for(int li = 0; li < 6; li++){
										p1_pits[li] = mancalaGame.getPlayer(0).getSeedsFromPit(li);
										p2_pits[li] = mancalaGame.getPlayer(1).getSeedsFromPit(li);
									}

									int player_turn = (mancalaGame.getPlayer(0).getTurn() ? 1 : 2);

									int condition = 0;
									int other_seeds = 0;
									int seeds = mancalaGame.getPlayerWithTurn().getSeedsFromPit(i);
									if(seeds == 6 - i){
										condition = 1;
									}
									// check if last seed lands in empty pit, take another players pit seeds
									if((seeds + i) % 14 < 6 && mancalaGame.getPlayerWithTurn().getSeedsFromPit(seeds + i) == 0){
										condition = 2;
										other_seeds = mancalaGame.getPlayerWithTurn().getOtherPlayerPit(5 - (seeds + i) % 14).countSeeds();
									}
									// taavetile lõpp
									if(!mancalaGame.getPlayerWithTurn().playPit(i)){
										mancalaView.showMessage("Not a valid move!");
									} else {

										// taavetile algus, mängu loogika jaoks pole vajalik
										BeforeAction(p1_pits, p1_seeds,
												p2_pits, p2_seeds, player_turn);
										InAction(player_turn, i + 1, seeds,condition, other_seeds);
										afterAction();
										// taavetile lõpp

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
						}
						mancalaView.setActivePit(-1);
						mancalaView.repaint();
					}
				}

				if(mancalaGame.checkWin() != null){
					endGame();
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
