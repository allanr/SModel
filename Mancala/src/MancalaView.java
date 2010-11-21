
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MancalaView extends JFrame {

	private static Mancala mancalaGame;	// model of the game
    private BufferedImage[] images;
    int activePit = -1;
    private static Player player;
    private static int playerInt;
    private static int BACKGROUND = 0;
    private static int HOST = 1;
    private static int HOST_ACTIVE = 2;
    private static int EXIT = 3;
    private static int EXIT_ACTIVE = 4;
    private static int HISTORY = 5;
    private static int HISTORY_ACTIVE = 6;
    private static int HOTSEAT = 7;
    private static int HOTSEAT_ACTIVE = 8;
    private static int JOIN = 9;
    private static int JOIN_ACTIVE = 10;
    private static int MENU = 11;
    private static int PIT = 12;
    private static int SEED = 13;
    private static int STORE = 14;
    private static int PIT_ACTIVE = 15;
    private static Views currentView;
    
    // different possibile views
    public enum Views {
    	MENU, HOTSEAT, NETWORK, VICTORY, WAITING
    }
    
    /**
     * Constructor for creating View for game and setting up JFrame to show content
     * 
     * @param mancalaGame - takes game model
     * @param files - takes fullpath picture file list in String[]
     */
    MancalaView(Mancala mancalaGame, String[] files){
    	this.mancalaGame = mancalaGame;
    	// load images into memory
    	images = new BufferedImage[files.length];
    	for(int i = 0; i < files.length; i++){
    		try {
    			images[i] = ImageIO.read(new File(files[i]));
    		} catch (IOException e1) {
    			System.err.println("Can't read pictures file '" + files[i] + "'");
    			showMessage("Can't read picture file '" + files[i] + "'");
    			System.exit(-1);
    		}
    	}
    	
    	this.setDefaultLookAndFeelDecorated(true);  
        this.setTitle("Mancala game - Systems Modeling Fall 2010");
        this.setSize(800, 410);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        // create double buffer strategy to avoid flickering in view state
    	this.createBufferStrategy(2);
    	
    	this.player = mancalaGame.getPlayer(0);
    }
    
    /**
     * Functionality for network game to change local player position in table
     * 
     * @param int - player number, allowed numbers 0 and 1
     */
    void setHomePlayer(int player){
    	this.player = mancalaGame.getPlayer(player);
    	this.playerInt = player;
    }
    
    /**
     * Changes current view with another view
     * 
     * @param view - new view to be set
     */
    void setView(Views view){
    	this.currentView = view;
    }
    
    /**
     * Gets current view
     * 
     * @return view - returns current view
     */
    Views getView(){
    	return currentView;
    }
    
    
    /**
     * Gets local player number
     * 
     * @return int - returns local player number
     */
    int getHomePlayerInt(){
    	return playerInt;
    }
    
    /**
     * Gets local player
     * 
     * @return Player - returns local player
     */
    Player getHomePlayer(){
    	return player;
    }
    
    /**
     * Sets hovered pit in view
     * 
     * @param pit - pit number 0-5.
     */
    void setActivePit(int pit){
    	activePit = pit;
    }
    
    /**
     * Show custom made message with JSwing
     * 
     * @param message - message to be shown in dialog box
     */
    void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
	
    /**
     * Main function for drawing content into JFrame
     * 
     * @param g - Graphics
     */
	public void paint(Graphics g) {

		// configure double buffer for drawing to avoid flickering
        BufferStrategy mybufferstrategy = this.getBufferStrategy();
        // exit function, if buffers are not ready yet
        if(mybufferstrategy.getDrawGraphics() == null){
        	return;
        }
        g = mybufferstrategy.getDrawGraphics();

        if(currentView == Views.HOTSEAT || currentView == Views.NETWORK || currentView == Views.VICTORY){
        	drawGame(g);
        } else if(currentView == Views.MENU){
        	drawMenu(g);
        } else if(currentView == Views.WAITING){
        	drawWaiting(g);
        }
                     
        mybufferstrategy.show();
	}
	
	/**
	 * Draws menu
	 * 
	 * @param g - Graphics
	 */
	public void drawMenu(Graphics g){
        g.drawImage(images[BACKGROUND], 0, 12, null);	

    	g.drawImage(images[MENU], 280, 80, null);
    	
    	int[] menus = {HOTSEAT, HOST, JOIN, HISTORY, EXIT};
    	int[] menusActive = {HOTSEAT_ACTIVE, HOST_ACTIVE, JOIN_ACTIVE, HISTORY_ACTIVE, EXIT_ACTIVE};
    	for(int i = 0; i < menus.length; i++){
    		if(activePit != -1 && i == activePit){
        		g.drawImage(images[menusActive[i]], 406 - images[menus[i]].getWidth() / 2, 100 + i * 45, null);    			
    		} else {
    			g.drawImage(images[menus[i]], 406 - images[menus[i]].getWidth() / 2, 100 + i * 45, null);
    		}
    	}
		
	}
	
	/**
	 * Draws waiting screen when hosting game
	 * 
	 * @param g - Graphics
	 */
	public void drawWaiting(Graphics g){
        g.drawImage(images[BACKGROUND], 0, 12, null);	

    	g.drawImage(images[MENU], 280, 80, null);
    	

        g.setColor(new Color(225,225,25));
        g.setFont(new Font("Verdana", 0, 24));
        drawCenter("Waiting player", 404, 180, g);   
        drawCenter("to connect...", 404, 210, g);   	
    		
	}	
	
	/**
	 * Draws game
	 * 
	 * @param g - Graphics
	 */
	public void drawGame(Graphics g){
		g.setFont(new Font("Verdana", Font.BOLD, 24));
        
        g.drawImage(images[BACKGROUND], 0, 12, null);	
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 6; j++){
            	drawPit(j,i,g);
            }
            drawStore(i, g);
        }
        g.setColor(new Color(225,225,25));
        
        g.setFont(new Font("Verdana", 0, 16));
        g.drawString("Player: " + mancalaGame.getPlayer(1).getName() + " " + 
        		(mancalaGame.getPlayer(1).getTurn() ? "[TURN]" : "") + 
        		" Seeds: " + mancalaGame.getPlayer(1).countSeeds(), 25, 55);
        g.drawString("Player: " + mancalaGame.getPlayer(0).getName() + " " + 
        		(mancalaGame.getPlayer(0).getTurn() ? "[TURN]" : "") + 
        		" Seeds: " + mancalaGame.getPlayer(0).countSeeds(), 485, 385); 

        g.setFont(new Font("Verdana", 0, 24));
        // show in the center screen, whos turn it is
        if(currentView == Views.HOTSEAT){
        	drawCenter(mancalaGame.getPlayerWithTurn().getName() + " turn" , 404, 225, g);
        } else {
        	if(player.getTurn()){
            	drawCenter("It is your turn" , 404, 225, g);        		
        	} else {
            	drawCenter("Waiting for opponent ..." , 404, 225, g);          		
        	}
        	
        }
        drawCenter("Exit game", 404, 50, g);
        if(currentView == Views.VICTORY){
            g.setFont(new Font("Verdana", 0, 16));
        	g.drawImage(images[MENU], 280, 80, null);
            g.setColor(new Color(255,255,255));
            drawCenter("Player", 404, 120, g);
            drawCenter("wins the game", 404, 180, g);

            drawCenter("Click anywhere with", 404, 260, g);
            drawCenter("mouse to continue", 404, 280, g);

            g.setFont(new Font("Verdana", 0, 24));
            drawCenter(mancalaGame.checkWin().getName(), 404, 150, g);
        }
	}
	
	/**
	 * Draws text into x, y coordinates in JFrame and tries to locate it into center
	 * 
	 * @param text - String input text
	 * @param x - int x location
	 * @param y - int y location
	 * @param g - Graphics
	 */
	public void drawCenter(String text, int x, int y, Graphics g){
		char[] c = new char[text.length()];
		for(int i = 0; i < text.length(); i++){
			c[i] = text.charAt(i);
		}
		g.drawString(text, x - g.getFontMetrics().charsWidth(c, 0, text.length()) / 2, y);
	}
	
	/**
	 * Draws pit into JFrame
	 * 
	 * @param pitNumber - which pit to draw
	 * @param player - which player pit it is
	 * @param g - Graphics
	 */
	public void drawPit(int pitNumber, int player, Graphics g){
		if(player == 0){
			if(activePit != -1 && activePit == pitNumber && mancalaGame.getPlayer(0).getTurn()){
				g.drawImage(images[PIT_ACTIVE], 140 + pitNumber * 90, 270, null);				
			} else {
				g.drawImage(images[PIT], 140 + pitNumber * 90, 270, null);
			}
			int seeds = mancalaGame.getPlayer(0).getSeedsFromPit(pitNumber);
			drawSeed(172 + pitNumber * 90, 302, seeds, 20, g);
			g.drawString(String.valueOf(seeds), 170 + pitNumber * 90, 317);
		} else {
			if(activePit != -1 && activePit == pitNumber && mancalaGame.getPlayer(1).getTurn()){
				g.drawImage(images[PIT_ACTIVE], 590 - pitNumber * 90, 100, null);
			} else {
				g.drawImage(images[PIT], 590 - pitNumber * 90, 100, null);
			}
			int seeds = mancalaGame.getPlayer(1).getSeedsFromPit(pitNumber);
			drawSeed(621 - pitNumber * 90, 132, seeds, 20, g);
			g.drawString(String.valueOf(seeds), 619 - pitNumber * 90, 147);
		}
	}
	
	/**
	 * Draws store into JFrame
	 * 
	 * @param player - which player store
	 * @param g - Graphics
	 */
	public void drawStore(int player, Graphics g){
		if(player == 0){
			g.drawImage(images[STORE], 645, 155, null);
			drawSeed(707, 217, mancalaGame.getPlayer(0).getSeedsFromStore(), 55, g);
			g.drawString(String.valueOf(mancalaGame.getPlayer(0).getSeedsFromStore()), 705, 229);
		} else {
			g.drawImage(images[STORE], 20, 155, null);
			drawSeed(81, 217, mancalaGame.getPlayer(1).getSeedsFromStore(), 55, g);
			g.drawString(String.valueOf(mancalaGame.getPlayer(1).getSeedsFromStore()), 78, 229);
		}
	}
	
	/**
	 * Draws seeds into current location in circle with given diameter
	 * 
	 * @param x - center position x
	 * @param y - center position y
	 * @param seeds - seeds count
	 * @param diameter - maximum diameter
	 * @param g - Graphics
	 */
	public void drawSeed(int x, int y, int seeds, int diameter, Graphics g){
		int curDiameter = diameter;
		float seedsDraw = (float) seeds / 2;
		if(seeds > 20){
			seedsDraw = (float) seeds / 4;
		}
		for(int i = 0; i < seeds; i++){
			if(seeds > 20 && i > seeds / 2){
				curDiameter = diameter - 15;
			}
			g.drawImage(images[SEED], (int) (x + Math.cos(i*Math.PI/seedsDraw) * curDiameter), (int) (y + Math.sin(i*Math.PI/seedsDraw) * curDiameter), null);
		}
	}
	
	/**
	 * Adds mouse listener to JFrame, logic is made in MancalaController
	 * 
	 * @param action - MouseListener
	 */
	public void addListener(MouseListener action){
		this.addMouseListener(action);
	}
	

	/**
	 * Adds mouse motion listener to JFrame, logic is made in MancalaController
	 * 
	 * @param action - MouseMotionListener
	 */
	public void addListener(MouseMotionListener action){
		this.addMouseMotionListener(action);
	}

	/**
	 * Changes current model with new model, eg. game is restarted
	 * 
	 * @param mancalaGame - game model
	 */
	public void setMancalaGame(Mancala mancalaGame) {
		this.mancalaGame = mancalaGame;
	}
}
