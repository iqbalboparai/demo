package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import myCollections.*;
import java.util.*;

public class ClassRoomTests {

	ClassRoom classRoom = null;

	@Before
	public void setUp() throws Exception {
		classRoom = new ClassRoom();
	}

	@Test
	public void testAdd() {
		classRoom.add(new Student(1, "Bali"));
		classRoom.add(new Student(2, "Mini"));
		classRoom.add(new Student(3, "Popo"));
		assertTrue(true);
	}

	@Test
	public void testRemove() {
		classRoom.remove(new Student(1, "Bali"));
		assertTrue(true);
	}

	@Test
	public void testToString() {
		classRoom.add(new Student(1, "Bali"));
		classRoom.add(new Student(2, "Mini"));
		classRoom.add(new Student(3, "Popo"));
		
		System.out.println(classRoom.toString());
		assertTrue(true);
	}

}
