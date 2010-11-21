import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class TestClass {

	static ServerSocket gameServer = null;
	static Socket gameClient = null;
	static int port = 13128;
    static DataOutputStream os = null;
    static PrintStream ps = null;
    static DataInputStream is = null;
    static boolean server = false;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mancala mancalaGame = new Mancala();
				
		if(args.length == 0){
			System.out.println("Starting server and waiting client to connect...");
			server = true;
			try {
		       gameServer = new ServerSocket(port);
	        }
	        catch (IOException e) {
	           System.out.println("Cannot create server socket: " + e);
	           System.exit(-1);
	        }
	        try {
	            gameClient = gameServer.accept();
	            is = new DataInputStream(gameClient.getInputStream());
	            ps = new PrintStream(gameClient.getOutputStream());
             }
	         catch (IOException e) {
	            System.out.println("Cannot create client socket: " + e);
	            System.exit(-1);
	         }
		} else {
			System.out.println("Connecting with server, please wait...");
	        try {
	            gameClient = new Socket(args[0], port);
	            os = new DataOutputStream(gameClient.getOutputStream());
	            is = new DataInputStream(gameClient.getInputStream());
	        } catch (UnknownHostException e) {
	            System.err.println("Unknown host " + args[1]);
	        } catch (IOException e) {
	            System.err.println("Couldn't get I/O for the connection to: " + args[0]);
	        }
		}
		System.out.println("Starting the game!");
		
		gameLoopNetwork(mancalaGame);
		
		if(gameServer != null){
			try {
			       gameServer.close();
	        }
		    catch (IOException e) {
		       System.out.println("Error in closing server socket: " + e);
		    }
		}
		if(gameClient != null){
			try {
			       gameClient.close();
	        }
		    catch (IOException e) {
		       System.out.println("Error in closing client socket: " + e);
		    }
		}
	}
	
	public static int waitResponse(){
		int response = -1;
        String responseLine;
        try {
			System.out.println("waiting...");
        	if(server){
        		while(response == -1){
        			char recieve = (char) is.readByte();
        			if(recieve > 47 && recieve < 54){
	        			response = Integer.parseInt(String.valueOf(recieve));
	        			System.out.println("Client makes move from: " + (response + 1));
        			}
        		}
        	} else {
        		while(response == -1){
        			char recieve = (char) is.readByte();
        			if(recieve > 47 && recieve < 54){
	        			response = Integer.parseInt(String.valueOf(recieve));
	        			System.out.println("Server makes move from: " + (response + 1));
        			}
        		}
        	}
		} catch (IOException e) {
			System.out.println("Some unexpected error occured: " + e);
			System.exit(-1);
		}
		return response;
	}
	
	public static void gameLoopNetwork(Mancala mancala){
		// change position, so server will start and client will be second
		Player player; Player network_player;
		if(server){
			player = mancala.getPlayer(0);
			network_player = mancala.getPlayer(1);
		} else {
			player = mancala.getPlayer(1);
			network_player = mancala.getPlayer(0);	
		}
		while(mancala.checkWin() == null){
			showGame(mancala);
			if(network_player.getTurn()){
				System.out.println("Network player is thinking of a move...");
				mancala.getPlayerWithTurn().playPit(waitResponse());
			} else {
				boolean loop = true;
				while(loop){
					try {
					    System.out.print("Player '" + player.getName() + "' turn (select pit number 1-6): ");
					    Scanner in = new Scanner(System.in);
					    int pit = Integer.parseInt(in.nextLine());
						if(pit < 1 || pit > 6){
							System.err.println("Number must be between 1 to 6");
						} else {
							loop = false;
							Boolean validity = mancala.getPlayerWithTurn().playPit(pit - 1);
							if(server){
			                    ps.println(String.valueOf(pit - 1));
							} else {
								os.writeBytes(String.valueOf(pit - 1)); 
							}
							if(validity == false){
								System.err.println("Can't make that move, this move is not valid!");
							}
						}
					} catch(Exception e){
						System.err.println("Not a valid number!");
					}
				}
			}
		}
		showGame(mancala);
		System.out.println("Player '" + mancala.checkWin().getName() + "' wins! Congratulations!");
	}
	
	public static void gameLoop(Mancala mancala){
		while(mancala.checkWin() == null){
			showGame(mancala);
			Player currentPlayer = mancala.getPlayerWithTurn();
			boolean loop = true;
			while(loop){
				try {
				    System.out.print("Player '" + currentPlayer.getName() + "' turn (select pit number 1-6): ");
				    Scanner in = new Scanner(System.in);
				    int pit = Integer.parseInt(in.nextLine());
					if(pit < 1 || pit > 6){
						System.err.println("Number must be between 1 to 6");
					} else {
						loop = false;
						Boolean validity = mancala.getPlayerWithTurn().playPit(pit - 1);
						if(validity == false){
							System.err.println("Can't make that move, this move is not valid!");
						}
					}
				} catch(Exception e){
					System.err.println("Not a valid number!");
				}
			}
		}
		showGame(mancala);
		System.out.println("Player '" + mancala.checkWin().getName() + "' wins! Congratulations!");
	}
	
	public static void automaticTest(Mancala mancalaGame){
		Player player1 = mancalaGame.getPlayer(0);
		System.out.println(player1.getName());
		System.out.println(player1.getTurn());
		System.out.println(player1.countSeeds());
		System.out.println(player1.checkGameEnd());
		System.out.println(player1.playPit(5));
		showGame(mancalaGame);
		System.out.println(player1.countSeeds());
		System.out.println(player1.getSeedsFromStore());
		System.out.println(player1.getTurn());
		
		Player player2 = mancalaGame.getPlayer(1);
		System.out.println(player2.getName());
		System.out.println(player2.getTurn());
		System.out.println(player2.countSeeds());
		System.out.println(player2.checkGameEnd());
		System.out.println(player2.playPit(1));
		showGame(mancalaGame);
		System.out.println(player1.playPit(2));		
		showGame(mancalaGame);
	}
	
	public static void showGame(Mancala mancala){
		Player player1; Player player2;
		// changes the view, so the local player is facing always his pits on bottom of the screen
		if(server){
			player1 = mancala.getPlayer(0);
			player2 = mancala.getPlayer(1);			
		} else {
			player1 = mancala.getPlayer(1);
			player2 = mancala.getPlayer(0);
		}
		
		System.out.println(player2.getName());
		System.out.println("\t[6]\t[5]\t[4]\t[3]\t[2]\t[1]");
		System.out.println("\t-\t-\t-\t-\t-\t-");
		for(int i = 5; i >= 0; i--){
			System.out.print("\t" + player2.getSeedsFromPit(i));
		}
		System.out.println("");
		System.out.println(player2.getSeedsFromStore() + "\t\t\t\t\t\t\t" + player1.getSeedsFromStore());

		for(int i = 0; i < 6; i++){
			System.out.print("\t" + player1.getSeedsFromPit(i));
		}
		System.out.println("");
		System.out.println("\t-\t-\t-\t-\t-\t-");
		System.out.println("\t[1]\t[2]\t[3]\t[4]\t[5]\t[6]");
		System.out.println("\t\t\t\t\t\t" + player1.getName());
		System.out.println("---------------------------------------------------------");
		
	}

}
