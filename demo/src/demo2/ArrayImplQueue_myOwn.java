package demo2;

import java.util.*;

public class ArrayImplQueue_myOwn {
	int size;
	int start, end;
	int queue[];

	public ArrayImplQueue_myOwn(int size) {
		this.size = size;
		start = 0;
		end = 0;
		queue = new int[size];
		for( int i = 0 ; i < size ; i++){
			queue[i] = -1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//ArrayImplQueue_myOwn obj = new ArrayImplQueue_myOwn();

		System.out.print("Enter the size of Queue:");
		int size = scan.nextInt();

		ArrayImplQueue_myOwn obj = new ArrayImplQueue_myOwn(size);
		
		int input = 0;
		do{
			System.out.println("\n1 - EnQueue\n2 - DeQueue\n3 - Print\n0 - Exit");
			input = scan.nextInt();
			switch(input){
			case 1: System.out.print("Enter elemet: ");
					obj.enQueue(scan.nextInt());
					break;
			case 2: obj.deQueue();
					break;
			case 3: System.out.println(obj);
					break;
			case 0 : break;
			default:
					System.out.println("Wrong Choice");
					break;
					
				//obj.enqueue(i);
			}
		}while (input != 0);
	}

	private int deQueue() {
		int result = 0;
		if(start == end){
			result = queue[start];
			queue[start] = 0;
			start = 0;
			end = 0;
		}else if(start < end){
			result = queue[start];
			queue[start] = 0;
			start++;
		}
		
		return result;
	}

	private void enQueue(int i) {
		if(start == 0 && end == 0)
			{queue[start] = i;
					end++;
			}
		else if(start < end && end < size){
			queue[end] = i;
			end ++;
		}
		else if(start == end){
			start = 0;
			end = 0;
			enQueue(i);
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
