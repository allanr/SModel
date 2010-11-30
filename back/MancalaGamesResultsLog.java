import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.CharBuffer;

public class MancalaGamesResultsLog {

	private static final String GamesResultsDirectory = "results\\";
	private static final String GamesResultsFile = "results.txt";
	private static final int MaxCountHistoryRead = 30;
	private static final int RowCount = 6;
	
	/*
	 * creates new directory and file for holding results,
	 *  if the file and directory doesn't already exist.
	 *  returns handle to the file (to already existing file or just created)
	 * */
	private static File getFile(){
		
		// first generate directory
		
		File f = new File(GamesResultsDirectory);
		
		if(!f.exists()){
			try{
				f.mkdir();
			}catch(SecurityException e){}
		}
		
		// then generate file
		
		f = new File(GamesResultsDirectory + GamesResultsFile);
		try{
			f.createNewFile();
		}catch(IOException e){}
		
		return f;
		
	}// getFile
	
	/*CharBuffer array, that contains the results file contents,
	 * has been read, now it is going to be parsed to
	 * appropriate String[][]
	 * */
	private static final String no_history[][]= 
		{{"no history data", " ", " ", " ", " ", " "}};
	
	private static String[][] ResultsToString(
			char bf[], int count){
		
		if(count<=0) return no_history;
		int last_count = count;
		
		if(bf[--count]!=10)return no_history;
		
		
		String[][] result = new String[MaxCountHistoryRead][RowCount];
		
		int row = RowCount-1;
		int col = 0;
		
		for(int j=0; j<MaxCountHistoryRead; j++)
			for(int i=0; i<RowCount; i++)
				result[j][i] = " ";
		
		while(--count>=-1){
			
			if(count==-1||bf[count]==9||bf[count]==10){
				result[col][row--] = 
					String.copyValueOf(bf, count+1, last_count-count-1);
				last_count = count;
				if(row==0){
					col++;
					row = RowCount-1;
				}
			}
		}
		
		for(int j=0; j<col; j++) 
			result[j][0] = String.valueOf(col-j);
		
		return result;
	}
	
	
	private static String WhoWon(int who_won){
		if(who_won!=0)return "\tPlayer "+who_won+" won\n";
		return "\tdraw\n";
	}
	
	public static void Add( 
			int player_won, int player1_seeds, int player2_seeds){
		
		File f = getFile();
		//String log_record = game_id 
		try{
			FileWriter fw = new FileWriter(f, true);
			//java.io.
			fw.append(
				"Player 1\t"+player1_seeds+
				"\tPlayer 2\t"+player2_seeds+
				WhoWon(player_won)
				);
			fw.close();
		}catch(IOException e){}
	}
	
	public static String[][] ReadHistory(){
		File f = new File(GamesResultsDirectory + GamesResultsFile);
		
		try{
			FileReader fr = new FileReader(f);
			final int allocate_count = (int)f.length();
			char bf[] = new char[allocate_count];
			int r = fr.read(bf);
			fr.close();
			return ResultsToString(bf, allocate_count);
		}
		catch(FileNotFoundException e)
		{return no_history;}
		catch(IOException e)
		{return no_history;}

	}
}
