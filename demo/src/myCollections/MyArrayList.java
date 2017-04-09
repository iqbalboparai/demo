package myCollections;

import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
		
		Collection<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Bali"));
		students.add(new Student(2,"Singh"));
		students.add(new Student(3,"Iqbal"));
		students.add(new Student(4,"Mini"));
		students.add(new Student(5,"Popo"));
		
		System.out.println(students.toString());
		
		Iterator<Student> stuIterator = students.iterator();
		
		while(stuIterator.hasNext()){
			Student test = stuIterator.next();
			if(test.getId()>3)
				stuIterator.remove();
		}
		System.out.println(students.toString());
		
	}

}
