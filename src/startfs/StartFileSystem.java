package startfs;

import FileSystem.RegularFile;
import FileSystem.Directory;
import FileSystem.CountFileVisitor;
import FileSystem.SearchVisitor;


public class StartFileSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String filepath = "E:/eclipse/work1/proj1/bin/startfs/a.txt";
		final String dirpath = "E:/eclipse/work1/proj1/bin/startfs/Yt";
		
		final String filepathj = "E:/eclipse/work1/proj1/src/FileSystem/RegularFile.java";
		final String dirpathj = "E:/eclipse/work1/proj1/src/FileSystem";
		
		/*
		 * Prints file name and size
		 * */
		RegularFile fl = new RegularFile(filepath);
		System.out.println(fl.getName());
		System.out.println(fl.getFileSize());
			//output:
			//	E:\eclipse\work1\proj1\bin\startfs\a.txt
			//	63
		 
		/*
		 * Prints files count in directory
		 * */
		Directory dl = new Directory(dirpath);
		CountFileVisitor cf = new CountFileVisitor();
		cf.visit(dl);
		System.out.println(cf.getFileCount());
			//output:
			//	5
		
		/*
		 * Lists files in directory
		 * */
		SearchVisitor sv = new SearchVisitor();
		sv.visit(dl);
		System.out.println(sv.findAll());
			//output:
			//	E:\eclipse\work1\proj1\1.txt
			//	E:\eclipse\work1\proj1\Copy (2) of 1.txt
			//	E:\eclipse\work1\proj1\Copy of 1.txt
			//	E:\eclipse\work1\proj1\New Folder
			//	E:\eclipse\work1\proj1\New Text Document.tx1
		
		/*
		 * Lists files in directory with extension .txt
		 * */
		sv.visit(dl);
		System.out.println(sv.findAll("txt"));
			//output:
			//	E:\eclipse\work1\proj1\1.txt
			//	E:\eclipse\work1\proj1\Copy (2) of 1.txt
			//	E:\eclipse\work1\proj1\Copy of 1.txt
		
		/*
		 * Total size of files in directory
		 */
		System.out.println(dl.SummarizeFileSizes());
			//output:
			//	39
		
		/*
		 * Files count in directory with .txt extension
		 * */
		cf.visit(dl);
		System.out.println(cf.getFileCount("txt"));
			//output:
			//	3
		
		/*
		 * files count in current directory
		 * */
		Directory dlj = new Directory(dirpathj);
		cf.visit(dl);
		System.out.println(cf.getFileCount());
			//output:
			//	5
		
		/* EXTRA
		 * java files count in directory
		 * */
		cf.visit(dlj);
		System.out.println(cf.getFileCount("java"));
			//output:
			//	7
	}

}
