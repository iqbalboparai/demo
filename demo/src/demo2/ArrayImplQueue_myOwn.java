package demo2;

import java.util.*;

public class ArrayImplQueue_myOwn {
	int size;
	int start, end;
	int queue[];

	public ArrayImplQueue_myOwn(int size) {
		this.size = size;
		start = 0;
		end = size - 1;

		queue = new int[size];

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of Queue:");
		int size = scan.nextInt();

		ArrayImplQueue_myOwn obj = new ArrayImplQueue_myOwn(size);
		
		int input = 0;
		do{
			System.out.println("\n1 - EnQueue\n2 - DeQueue\n3 - Print\n0 - Exit");
			input = scan.nextInt();
			switch(input){
			case 1:
				//obj.enqueue(i);
			}
		}while (input != 0);
	}

	private void enqueue(int i) {
		if (queue != null) {
			if (end == start)
				{queue[start] = i;
				end++;}
			else if (end < size) {
				queue[end] = i;
				end++;
			}
			else
				System.out.println("Queue is Full !!");
		}

	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (queue != null) {
			for (int value : queue) {
				sb.append(value);
				sb.append(' ');
			}
			return sb.toString();
		} else {
			return null;
		}
	}

}
