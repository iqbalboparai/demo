package myCollections;

import java.util.*;

public class ClassRoom implements Iterable<Student> {
	private List<Student> classRoom = null;

	public ClassRoom(){
		classRoom = new ArrayList<>();
	}
	
	public void add(Student stu) {
		classRoom.add(stu);
	}

	public boolean remove(Student stu) {

		return classRoom.remove(stu);
	}

	public String toString() {
		return classRoom.toString();
	}

	@Override
	public Iterator<Student> iterator() {
		return classRoom.iterator();
	}

}
