package myCollections;

import java.util.*;
import java.util.Map.*;

public class MyHashMap {
	Map<Integer, Student> map;

	public MyHashMap() {
		map = new HashMap<>();
	}

	public static void main(String[] args) {

		MyHashMap mapClass = new MyHashMap();
		mapClass.initMap();

		/*
		 * System.out.println(mapClass.map);
		 * 
		 * System.out.println(mapClass.addProduct(StudentFixtures.bali));
		 * 
		 * System.out.println(mapClass.addProduct(StudentFixtures.pinder));
		 * 
		 * System.out.println(mapClass.map);
		 * 
		 * System.out.println(mapClass.lookUp(4).toString());
		 * 
		 * System.out.println("Size of Map: "+ mapClass.map.size());
		 * 
		 * //mapClass.map.clear();
		 * 
		 * //System.out.println("Size of Map: "+ mapClass.map.size());
		 * 
		 * Set<Integer> ids = mapClass.getSetOfIds();
		 * 
		 * System.out.println(ids); System.out.println(mapClass.map);
		 * ids.remove(2);
		 * 
		 * System.out.println(ids); System.out.println(mapClass.map);
		 * 
		 * System.out.println(mapClass.addProduct(StudentFixtures.popo));
		 * System.out.println(mapClass.map);
		 * 
		 * Collection<Student> stuValues = mapClass.getValueCollections();
		 * System.out.println(stuValues);
		 */
		System.out.println(mapClass.map.hashCode());
		Set<Map.Entry<Integer, Student>> entires = mapClass.getEntrySet();
		System.out.println(entires);

		for (Map.Entry<Integer, Student> entry : entires) {

			if (entry.getKey() == 2) {
				entry.setValue(StudentFixtures.pinder); 
			}
		}
		System.out.println(entires);

	}

	private Set<Entry<Integer, Student>> getEntrySet() {
		return map.entrySet();
	}

	private Collection<Student> getValueCollections() {

		return map.values();
	}

	private Set<Integer> getSetOfIds() {
		return map.keySet();
	}

	private Student lookUp(int i) {
		if (map.containsKey(i)) {
			return map.get(i);
		}
		return null;
	}

	private boolean addProduct(final Student student) {
		if (map.containsKey(student.getId())) {
			return false;
		} else {
			map.put(student.getId(), student);
			return true;
		}

	}

	private void initMap() {
		map.put(StudentFixtures.bali.getId(), StudentFixtures.bali);
		map.put(StudentFixtures.mini.getId(), StudentFixtures.mini);
		map.put(StudentFixtures.popo.getId(), StudentFixtures.popo);

	}

}
