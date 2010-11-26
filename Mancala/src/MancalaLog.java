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

	final private String LogDirectory = "log\\";
	
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

	public void WriteAction(
			int whos_turn, 
			int pit_num, 
			int seeds,
			int condition_code, int number_of_captured){
		String s = "#Action:";
		s+= "\tPlayer " + whos_turn + " sows " + seeds + " seeds from pit ";
		s+= pit_num + ".\r\n";
		if(condition_code==1){
			s+="\t\tAs the last seed landed in store, player " + whos_turn +
			 " gets additional move.\r\n";
		}else if(condition_code==2){
			s+="\t\tAs the last seed landed to empty pit "+(pit_num+seeds)+
			",\r\n\t\tplayer " + whos_turn +
			 " can capture " + number_of_captured + " seeds from other "+
			 "player's pit " + (7-(pit_num+seeds))+".\r\n";
		}
		Write(s+"\r\n");
	}
	
}
