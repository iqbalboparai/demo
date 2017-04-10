package myCollections;

import java.util.*;

public class QueueOnStudent {
	Student[] queue;
	int size;
	int start;
	int end;
	int n;

	public QueueOnStudent(int size) {
		this.size = size;
		start = 0;
		end = 0;
		n = 0;
		queue = new Student[size];
	}

	public boolean enQueue(Student student) {
		if(end < size){
			queue[++end] = student;
			n++;
			return true;
		}
		else
		return false;
	}

	public Student deQueue() {
		return null;
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return n == 0;
	}
	
	public String toString(){
		if(queue!=null){
		StringBuffer sb = new StringBuffer("");
		for(Student st : queue){
			if(st!=null)
			sb.append(st.toString());
		}
		return sb.toString();
		}
		return "Null";
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Queue");
		QueueOnStudent queue = new QueueOnStudent(scan.nextInt());

		int code = 0;

		do {
			System.out.println("\n1 - EnQueue\n2 - DeQueue\n3 - Print\n0 - Exit");
			code = scan.nextInt();
			switch (code) {
			case 1:
				System.out.print("Enter student id: ");
				queue.enQueue(new Student(scan.nextInt(), "Bali"));
				break;
			case 2:
				System.out.println("Deleted: "+queue.deQueue());
				break;
			case 3:
				System.out.println(queue.toString());
				break;
			case 0:
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		} while (code != 0);
	}

}
