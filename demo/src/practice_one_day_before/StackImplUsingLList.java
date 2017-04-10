package practice_one_day_before;

public class StackImplUsingLList {
	int n;
	Node first;

	public static void main(String[] args) {
		StackImplUsingLList stack = new StackImplUsingLList();

		stack.push("Mini");
		stack.push("Loves");
		stack.push("Bali");

		System.out.println(stack.toString());
	
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
	}

	private String pop() {
		if (!isEmpty()) {
			String result = first.item;
			first = first.next;
			n--;
			return result;
		}
		return null;
	}

	private boolean isEmpty() {
		
		return n == 0;
	}
	
	private int size(){
		return n;
	}

	private void push(String string) {
		Node old_first = first;
		first = new Node(string, old_first);
		n++;
	}

	public String toString() {
		if(isEmpty())
			return "!!Stack is Empty!!";
		else
			return first.toString();
	}

}

 class Node {
	String item;
	Node next;

	public Node(String item, Node next) {
		this.item = item;
		this.next = next;
	}

	public String toString() {
		if (next != null)
			return item + " " + next.toString();
		else
			return item;
	}
}
