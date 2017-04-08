package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate("aaaaaaaa");
		findDuplicate("Computer");
		findDuplicate("combination");

	}

	private static void findDuplicate(String word) {

		char[] chArr = word.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : chArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.println("Duplicates for \""+word +"\":");
		for(Map.Entry<Character, Integer> entry: entrySet){
			if(entry.getValue()>0){
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
	}

}
