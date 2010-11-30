/*
	Auto generation of object diagrams in dia format
*
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.CharBuffer;

public class MancalaObjectDiagrams {

	// directory for output file
	final private String DiagramsDirectory = "diagrams/";
	
	private String diaRead;
	private String procWrite;
	
	final private MancalaDiaImage m_diaimage = new MancalaDiaImage();
	
	public MancalaObjectDiagrams(boolean del){
		
		File f = new File(DiagramsDirectory);
		
		if(!f.exists()){
			try{
				f.mkdir();
			}catch(SecurityException e){}
		}
		else if(del){
			File files[] = f.listFiles();
			for(int i=0; i<files.length; i++){
				try{
					files[i].delete();
				}catch(SecurityException e){}
			}
		}
		
		//diaRead = LoadFile("temp1.dia");
		diaRead = m_diaimage.GetDiaTemplate();
	}
		
	private String LoadFile(String fname){
		try{
			FileReader fr = new FileReader(fname);
			CharBuffer bf = CharBuffer.allocate(132*1024);
			int r = fr.read(bf);
			fr.close();
			return new String(bf.array(),0,r);
		}
		catch(FileNotFoundException e){return "";}
		catch(IOException e){return "";}
	}
	
	private void procUserStory(int userstorynum, boolean hide){
		
		if(hide){
			procWrite = procWrite.replaceFirst(
					"USERSTORY \\$USERSTORYNUM", " ");
			return;
		}
						
		procWrite = procWrite.replaceFirst(
				"\\$USERSTORYNUM", String.valueOf(userstorynum));
	}
	
	private void procCondition(String condition){
		procWrite = procWrite.replaceFirst("\\$CONDITION", condition);
	}
	
	private void procSeeds(
			int player1_pits[], int player1_store, 
			int player2_pits[], int player2_store){		
		
		// player 1
		for(int pit=1; pit<7; pit++)
		{
			String replacable = "\\$SN_1_" + pit;
			procWrite = procWrite.replaceFirst(
					replacable, (player1_pits)[pit-1]+" seeds");
		}
		
		// player 2
		for(int pit=1; pit<7; pit++)
		{
			String replacable = "\\$SN_2_" + pit;
			procWrite = procWrite.replaceFirst(
					replacable, (player2_pits)[pit-1]+" seeds");
		}
		
		// stores for player 1 and player 2
		procWrite = procWrite.replaceFirst("\\$SN_1_S", player1_store+" seeds");
		procWrite = procWrite.replaceFirst("\\$SN_2_S", player2_store+" seeds");
	}
	
	private void procTurn(int whos_turn){
		if(whos_turn==1)return;
		
		final String s_end = "\\n";
		final String s_w6 = "      ";
		final String s_w8 = "        ";
				
		// 1. replace
		String r_from = s_w6+"<dia:attribute name=\\x22obj_pos\\x22>"+s_end+
					s_w8+"<dia:point val=\\x2224.5837,32.017\\x22/>"+s_end+
					s_w6+"</dia:attribute>";
		
		String r_to = s_w6+"<dia:attribute name=\"obj_pos\">"+"\n"+
						s_w8+"<dia:point val=\"34.5838,32\"/>"+"\n"+
						s_w6+"</dia:attribute>";
		
		procWrite = procWrite.replaceFirst(r_from, r_to);
		
		// 2. replace
		r_from = s_w6+"<dia:attribute name=\\x22obj_bb\\x22>"+s_end+
					s_w8+"<dia:rectangle val=\\x2224.5337,31.967;27.1118,37.8559\\x22/>"+s_end+
					s_w6+"</dia:attribute>";
		
		r_to = s_w6+"<dia:attribute name=\"obj_bb\">"+"\n"+
					s_w8+"<dia:rectangle val=\"31.8882,31.95;34.6338,37.8559\"/>"+"\n"+
					s_w6+"</dia:attribute>";

		procWrite = procWrite.replaceFirst(r_from, r_to);
		
		// 3. replace
		r_from = s_w6+"<dia:attribute name=\\x22orth_points\\x22>"+s_end+
					s_w8+"<dia:point val=\\x2224.5837,32.017\\x22/>"+s_end+
					s_w8+"<dia:point val=\\x2224.5837,37.525\\x22/>"+s_end+
					s_w8+"<dia:point val=\\x2227,37.525\\x22/>"+s_end+
					s_w6+"</dia:attribute>";
		
		r_to = s_w6+"<dia:attribute name=\"orth_points\">"+"\n"+
					s_w8+"<dia:point val=\"34.5838,32\"/>"+"\n"+
					s_w8+"<dia:point val=\"34.5838,37.525\"/>"+"\n"+
					s_w8+"<dia:point val=\"32,37.525\"/>"+"\n"+
					s_w6+"</dia:attribute>";
		
		procWrite = procWrite.replaceFirst(r_from, r_to);
		
		// 4. replace
		r_from = s_w6+"<dia:connections>"+s_end+
					s_w8+"<dia:connection handle=\\x220\\x22 to=\\x22O0\\x22 connection=\\x2213\\x22/>"+s_end+
        			s_w8+"<dia:connection handle=\\x221\\x22 to=\\x22O102\\x22 connection=\\x223\\x22/>"+s_end+
        			s_w6+"</dia:connections>";
		
		r_to = s_w6+"<dia:connections>"+"\n"+
					s_w8+"<dia:connection handle=\"0\" to=\"O47\" connection=\"13\"/>"+"\n"+
					s_w8+"<dia:connection handle=\"1\" to=\"O102\" connection=\"4\"/>"+"\n"+
					s_w6+"</dia:connections>";
		
		procWrite = procWrite.replaceFirst(r_from, r_to);
	}
	
	public void Write(
			int storynum,
			boolean hide,
			String condition,
			int player1_pits[], int player1_store, 
			int player2_pits[], int player2_store, int whos_turn){
		
		procWrite = diaRead;

		procUserStory(storynum,hide);
		procCondition(condition);
		procSeeds(player1_pits, player1_store, player2_pits, player2_store);
		procTurn(whos_turn);
	
		try {
			
			String num = String.valueOf(storynum);
			while(num.length()<3)num="0"+num;
			
			String z_cond = condition;
			
			if(condition.matches("(.*)(\\x70|\\x50)(\\x72|\\x52)(\\x65|\\x45)(.*)"))
				z_cond = "_pre";
			else 
			if(condition.matches("(.*)(\\x70|\\x50)(\\x6F|\\x4F)(\\x73|\\x53)(.*)"))
				z_cond = "post";
			
			FileWriter fw = new FileWriter(
					DiagramsDirectory+num+z_cond+".dia");
			fw.write(procWrite);
			fw.close();
		}
		catch(FileNotFoundException e){}
		catch(IOException e){}
	
	}
	
};
