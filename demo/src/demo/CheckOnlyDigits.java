package demo;

import java.util.Scanner;

public class CheckOnlyDigits {
	
	public static void main(String args[]){
		String str = new Scanner(System.in).nextLine();
		if(str.matches("[0-9]+")){
			System.out.print("TRUE!!");
			
		}
	}

}
