import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



/*
 * This class is used to generate log while playing.
 * 	The log may be generated for history purposes for
 * 	geting automatically userstories, for geting automatically
 * 	object diagrams. 
 * **/
public class MancalaLog {

	final private String LogDirectory = "log/";
	
	/*
	 * Writes a string to file
	 *  used by log writing functionality
	 * */
	private void Write(String s){
		try{
			FileWriter fw = new FileWriter(LogFileName,true);
			fw.write(s);
			fw.close();
		}catch(IOException e){}
	}
	
	// string that identifies seeds in each pit and store
		
	/*
	 * log file specific information
	 * */
	
	// denotes log file name
	private String LogFileName;
	
	// Constructor
	// assigns log file name and creates new empty log file
	//  if that doesn't already exist
	//  if del is true, deletes existing log file and creates new
	public MancalaLog(String logfilename, boolean del){
		
		File f = new File(LogDirectory);
		
		if(!f.exists()){
			try{
				f.mkdir();
			}catch(SecurityException e){}
		}
		
		LogFileName = LogDirectory+logfilename;
		f = new File(LogFileName);

		// creates new empty file, if that doesn't already exist
		try{
			if(del)f.delete();
			f.createNewFile();
		}catch(IOException e){}
	}
	
	// get's the log file name that's the class is assoctiated with
	public String GetLogFile(){return LogFileName;}

	private String getSeedsName(int seeds){
		switch(seeds){
		case 1: return "seed";
		default: return "seeds";
		}
	}
	
	// seeds in pits and store string
	private String getPitsAndStore(int player, int pits[], int store){
		final String s_pit = "PIT";
		final String s_store = "STORE";
		String s = "";
		for(int i=0; i<6; i++)s+=(s_pit+(i+1)+"="+pits[i]+", ");
		s+=s_store+"="+store;
		return s;
	}
	
	/*writes condition string
	 * used for writing pre and post condition strings
	 * */
	private String getStateString(
			int player1_pits[], int player1_store,
			int player2_pits[], int player2_store, int whos_turn){
		
		
		String s = "\tPlayer 1 seeds :\r\n\t\t";
		s+= getPitsAndStore(-1,player1_pits, player1_store)+".\r\n";
		s+= "\tPlayer 2 seeds :\r\n\t\t";
		s+= getPitsAndStore(-1,player2_pits, player2_store)+".\r\n";
		
		// writes whose turn, if not winning condition
		boolean player1_pits_allnull = true;
		boolean player2_pits_allnull = true;
		
		for(int i=0; i<6; i++)
			if(player1_pits[i]!=0){
				player1_pits_allnull = false;
				break;
			}
		for(int i=0; i<6; i++)
			if(player2_pits[i]!=0){
				player2_pits_allnull = false;
				break;
			}
		
		if(!player1_pits_allnull&&!player2_pits_allnull)
			s+= "\r\n\tIt's Player " + whos_turn + " turn.\r\n";
		return s;
	}
	
	/*header for each userstory*/
	public void WriteUserStoryHeader(int userstorynum){
		Write("\r\n\r\n\r\nUSERSTORY " + userstorynum + "\r\n\r\n");
	}
	
	/*Writes precondition as userstory*/
	public void WritePreCondition(
			int player1_pits[], 
			int player1_store, 
			int player2_pits[], int player2_store, int whos_turn){
		
		String s = "#Pre:";
		
		s+=getStateString(
				player1_pits,player1_store,
				player2_pits,player2_store,whos_turn);
		
		Write(s+"\r\n");
	}

	/*Writes precondition as userstory*/
	public void WritePostCondition(
			int player1_pits[], 
			int player1_store, 
			int player2_pits[], int player2_store, int whos_turn){
		
		String s = "#Post:";
		s+=getStateString(
				player1_pits,player1_store,
				player2_pits,player2_store,whos_turn);
		
		Write(s+"\r\n");
	}

	// calculates pits, if turnaround has occured
	private int adjPit(int pit){
		if(pit>6)pit-=14;
		else if(pit<1)pit+=14;
		return pit;
	}
	
	public void WriteAction(
			int whos_turn, 
			int pit_num, 
			int seeds,
			int condition_code, int number_of_captured){
		String s = "#Action:";
		s+= "\tPlayer " + whos_turn + " sows " + seeds + " "+
			getSeedsName(seeds)+" from pit ";
		s+= pit_num + ".\r\n";
		if(condition_code==1){
			s+="\t\tAs the last seed landed in store, player " + whos_turn +
			 " gets additional move.\r\n";
		}else if(condition_code==2&&number_of_captured>0){
			s+="\t\tAs the last seed landed to empty pit "+adjPit(pit_num+seeds)+
			",\r\n\t\tplayer " + whos_turn +
			 " can capture " + number_of_captured + " "+
			 	getSeedsName(number_of_captured)+" from other "+
			 "player's pit " + adjPit(7-(pit_num+seeds))+".\r\n";
		}
		Write(s+"\r\n");
	}

	public void WriteWinningCondition(
			int player_won, int player1_seeds, int player2_seeds ){
		
		switch(player_won){
		case 0: Write("\tGame ended with draw (both players got 24 seeds).\r\n");
				return;
		case 1: Write("\tPlayer 1 won the game. ("+
					player1_seeds+"seeds against "+
					player2_seeds +")\r\n");
				return;
		case 2:
				Write("\tPlayer 2 won the game. ("+
						player2_seeds+"seeds against "+
						player1_seeds +")\r\n");
				return;
		}
	}
	
}
