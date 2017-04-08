package demo;

import java.util.*;

public class ReplaceCharToOther {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter string:");
		String input = sc.nextLine();
		
		System.out.println("Enter char to replace:");
		String charto = sc.nextLine();
	//	char ch1 = charto.charAt(0);
		
		System.out.println("Enter char to replace with:");
		String chatwith = sc.nextLine();
		//char ch2 = chatwith.charAt(0);
		
		input = input.replaceAll(charto, chatwith);
		System.out.println("Edited string:" + input);
		
	}

}
