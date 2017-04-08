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
		int flag = 0;
		while(in.hasNext()){
			if(in.nextLine()!=null){
				flag++;
			}
		}
		
		System.out.println("Total lines:" + flag);
		
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		finally{
			//fs.close();
			in.close();
		}

	}

}
