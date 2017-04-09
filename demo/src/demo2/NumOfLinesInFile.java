package demo2;


import java.io.*;
import java.util.Scanner;

public class NumOfLinesInFile {

	public static void main(String[] args) {
		Scanner in = null;
		//FileInputStream fs = null;
		try{
		FileInputStream fs= new FileInputStream("src/FileBali.txt");
		in= new Scanner(fs);
		//checkNumLines(in);
		checkNumLines2(in);
		
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		finally{
			in.close();
		}

	}

	private static void checkNumLines2(Scanner in) {
		int flag = 0;
		StringBuilder sb = new StringBuilder("");
		while(in.hasNext())		
			sb.append(in.nextLine());
			sb.append(' ');
			
			
		
		String[] str = sb.toString().split(". ");
		flag = str.length;
		System.out.println("Total lines:" + flag);
	}

	private static void checkNumLines(Scanner in) {
		
		int flag = 0;
		while(in.hasNext()){
			if(in.nextLine()!=null){
				flag++;
			}
		}
		
		System.out.println("Total lines:" + flag);
		
	}

}
