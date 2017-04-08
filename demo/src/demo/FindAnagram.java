package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter first String: ");
		String st1 = scan.nextLine();
		System.out.print("\nEnter second String: ");
		String st2 = scan.nextLine();

		Map<Character, Integer> map1 = getMaps(st1);
		Map<Character, Integer> map2 = getMaps(st2);

		findAnagram(map1, map2);

		scan.close();
	}

	private static void findAnagram(Map<Character, Integer> map1, Map<Character, Integer> map2) {
		boolean flag = false;
		Set<Map.Entry<Character, Integer>> set1 = map1.entrySet();
		// Set<Map.Entry<Character, Integer>> set2 = map2.entrySet();
		if (map1.size() == map2.size()) {
			for (Map.Entry<Character, Integer> m : set1) {
				if (map2.containsKey(m.getKey())) {
					if (m.getValue() != map2.get(m.getKey())) {
						System.out.println("They are not anagram");
						flag = false;
						break;
					} else {
						flag = true;
					}
				} else {
					System.out.println("They are not anagram");
					flag = false;
					break;
				}
			}
		} else {
			System.out.println("They are not anagram");
			flag = false;
		}
		if (flag == true) {
			System.out.println("Yes! They are Anagram.");
		}
	}

	private static Map<Character, Integer> getMaps(String st1) {
		char[] chArr = st1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : chArr) {
			if (ch != ' ') {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		return map;
	}
}
