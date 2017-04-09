package myCollections;

public class Student {
	private final String name ;
	private final int id;
	private char grade;

	public Student(int id, String name){
		this.id= id;
		this.name = name;
	}
	
	public Student(int id, String name, char grade){
		this(id,name);
		this.setGrade(grade);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString(){
		return "ID: " + getId() +" Name: " + getName()+" Grade: " + getGrade();
	}
	
}
