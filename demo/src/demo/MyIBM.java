package demo;

import java.util.*;
import java.util.Scanner;

public class MyIBM {

	public static void main(String[] args) {
		String check = new Scanner(System.in).nextLine();

		doIBM(check);
	}

	static void doIBM(String check) {
		String[] values = check.split(",");
		String emp1 = values[values.length - 2];
		String emp2 = values[values.length - 1];
		Map<String, List<String>> map = createDict(values);
		String[] path1 = getToPath(map, emp1);
		String[] path2 = getToPath(map, emp2);

		int len = path1.length > path2.length ? path1.length : path2.length;
		String resolver = "";
		for (int i = 0; i < len; i++) {
			if (!path1[path1.length - 1 - i].equals(path2[path2.length - 1 - i])) {
				break;
			}
			resolver = path1[path1.length - 1 - i];
		}
		System.out.println(resolver);

	}

	static String[] getToPath(Map<String, List<String>> map, String emp) {
		StringBuffer buf = new StringBuffer();
		while (map.containsKey(emp)) {
			buf.append(emp).append("\t");
			emp = map.get(emp);
		}

		return buf.toString().split("\t");
	}

	static Map<String, List<String>> createDict(String[] values) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < values.length - 2; i++) {
			String[] pair = values[i].split("->");
			List<String> ls = new ArrayList<String>();
			ls.add(pair[0]);
			if (map.containsKey(pair[1])) {
				if (map.get(pair[1]).size() > 15) {
					System.exit(0);
				} else {
					map.get(pair[1]).add(pair[0]);
				}
			} else {
				map.put(pair[1], ls);
			}
		}

		return map;
	}

}
