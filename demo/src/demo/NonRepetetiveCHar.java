package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NonRepetetiveCHar {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		String in = new Scanner(System.in).nextLine();
		checkForFirst(in);

	}

	private static void checkForFirst(String in) {
		char[] charr = in.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : charr) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

		for (Map.Entry<Character, Integer> m : entrySet) {
			if (m.getValue() == 1) {
				System.out.println("The first unique Character is:" + m.getKey());
				break;
			}
		}
	}

}
