package practice_one_day_before;

public class QueueImplLList {
	Node first;
	Node last;
	int n;

	public static void main(String[] args) {
		QueueImplLList queue = new QueueImplLList();

		queue.add("Mini");
		queue.add("is");
		queue.add("so");
		queue.add("stupid.");

		System.out.println(queue.toString());
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		
		
		System.out.println(queue.toString());
	}

	private void remove() {
		if(!isEmpty())
			{first = first.next;
			n--;
			}
		}
		
	

	private void add(String string) {
		Node oldLast = last;
		last = new Node(string,null,null);
		if(isEmpty()) first = last;
		else	oldLast.next = last;
		
		n++;
		
		}
	private boolean isEmpty() {
		
		return n ==0;
	}
	

	public String toString() {
		if(first != null)
		return first.toString();
		else
			return "!!Queue is Empty!!";
	}

	class Node {
		 String item;
		 Node previous;
		 Node next;

		public Node(String item, Node previous, Node next) {
			this.item = item;
			this.previous = previous;
			this.next = next;

		}


		public String toString() {
			if (next != null)
				return item + " " + next.toString();
			else
				return item;
		}

	}
}
