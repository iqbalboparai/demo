package demo2;

import java.util.Scanner;

public class NumOfChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = scan.nextLine();
		System.out.println("Enter the character to check count:");
		String check = scan.next();
		if (check.length() == 1) {
			char checkk = check.charAt(0);
			char[] strchr = str.toCharArray();
			int flag = 0;
			for (Character ch : strchr) {
				if (ch == checkk) {
					flag++;
				}
			}
			System.out.println("No. of occurances: " + flag);
		}

		else {
			System.out.println("ENter more than one characetr");
		}

	}
}
