package practice_one_day_before;

public class QueueImplArray {
	String queue[];
	int last;
	int first;
	int  n;
	
	public QueueImplArray(int i) {
		queue = new String[i];
		last = 0;
		first = 0;
		n = 0;
	}

	public static void main(String[] args) {
		QueueImplArray queue = new QueueImplArray(5);
		
		queue.enqueue("Mini");
		queue.enqueue("is");
		queue.enqueue("so");
		queue.enqueue("stupid");
		queue.enqueue("!!");
		
		queue.enqueue("Mini");
		queue.enqueue("is");
		queue.enqueue("so");
		queue.enqueue("stupid");
		queue.enqueue("!!");
		
		System.out.println(queue.toString());
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		
		System.out.println(queue.toString());
		queue.enqueue("stupid");
		queue.enqueue("!!");
		
		System.out.println(queue.toString());
	}

	private void dequeue() {
		if(first == queue.length)
			first = 0;
		queue[first++] = null;
		n--;
	}

	private void enqueue(String string) {
		
		if(n==queue.length) 
			resize();
		
		if(last == queue.length) 
			last = 0;
		
		queue[last++] = string;
		n++;
		
	}
	private void resize() {
		int new_n = n*2;
		String[] temp = new String[new_n];
		for (int i =0 ; i<n; i++){
			
			if(queue[i]!=null)
				temp[i] = queue[i];
		}
		queue = temp;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		for( String value: queue){
			sb.append(value);
			sb.append(" ");
		}
		return sb.toString();
	}

}
