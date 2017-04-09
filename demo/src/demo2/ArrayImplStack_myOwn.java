package demo2;

public class ArrayImplStack_myOwn {
	int[] stack;
	int n;
	int capacity;

	ArrayImplStack_myOwn() {
		capacity = 10;
		stack = new int[capacity]; 
	}

	ArrayImplStack_myOwn(int i) {
		capacity = i;
		stack = new int[capacity];
	}

	public static void main(String[] args) {
		ArrayImplStack_myOwn obj = new ArrayImplStack_myOwn();

		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		obj.push(10);
		obj.push(11);
		obj.push(12);
		obj.push(13);
		obj.push(14);

		System.out.println(obj.toString());
		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		
		
		System.out.println(obj.toString());
		
		

	}

	private boolean pop() {
		if(stack != null && n>=0){	
			
			System.out.println("Poped:" + stack[--n]);
			stack[n] = 0;
			return true;
		}
		return false;
	}

	private void push(int i) {

		if (stack != null && n < capacity) {
			stack[n] = i;
			n++;
		}else if(capacity == n){
			System.out.println("Stack is Full");
		}

	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (stack != null) {
			for (int value : stack) {
				sb.append(value);
				sb.append(' ');
			}
			return sb.toString();
		} else {
			return null;
		}
	}

}
