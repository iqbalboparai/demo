package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayImplStack {

	int capacity;
	int n;
	String[] stack;

	public ArrayImplStack(int i) {
		i = capacity;
		stack = new String[capacity];
		n = 0;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {

		ArrayImplStack stack = new ArrayImplStack(10);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the first value to Stack:");
		String value = in.readLine();
		int option;
		stack.push(value);
		
		do{
			System.out.println("1: Push \n2: POP \n3: Print\n0: Exit");
			option = in.read();
			
			
		}while(option != 0);

		// TODO Auto-generated method stub

	}

	private boolean pop() {
		// TODO Auto-generated method stub
		return false;
	}

	private void push(String readLine) {
		stack[n++] = readLine;
		//n++;
	}

}
