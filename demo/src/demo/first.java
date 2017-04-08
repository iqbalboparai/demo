package demo;

import java.util.Scanner;

public class first {

	public static void main(String[] args) throws Exception {

		first ff = new first();
		Scanner reader = new Scanner(System.in);
		String s = new String(reader.nextLine());
		// TODO Auto-generated method stub
		if (s.isEmpty()) {
			System.out.print("Hey!! Its Empty");
		} else {
			ff.checkForDuplicate(s);
		}
		reader.close();

	}

	private void checkForDuplicate(String s) {
		// TODO Auto-generated method stub
		// String check;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					System.out.println(s.charAt(i));
					flag = true;
					break;
				}
			}
		}
		if(flag==false)
			System.out.println("No Duplicates");
	}

}
