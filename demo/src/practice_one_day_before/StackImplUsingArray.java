package practice_one_day_before;

public class StackImplUsingArray {
	int n;
	int capacity;
	String[] stack ;
	StackImplUsingArray(int capacity){
		this.capacity =  capacity;
		stack = new String[capacity];
		n=0;
	}
	String pop(){
		
		return stack[--n];
	}
	boolean push(String x){
		stack[n++] = x;
		return true;
	}
	boolean isEmpty(){
		return false;
	}
	String peek(){
		return null;
	}
	int size(){
		return n;
	}
	public String toString(){
		return null;
	}
	
	public static void main(String args[]){
		String run = "1 + 2 - 3 + 4 + 5";
		String[] tokens = run.split(" ");
		StackImplUsingArray stack = new StackImplUsingArray(tokens.length);
		for(String token : tokens){
			stack.push(token);
		}
		String result = stack.evaluate();
		System.out.println(result);
	}
	private String evaluate() {
		while(stack != null){
			if(n>1){
				int l = Integer.parseInt(pop());
				String o = pop();
				int r = Integer.parseInt(pop());
				switch(o){
				case "+" : push(String.valueOf(l+r)); break;
				case "-" : push(String.valueOf(l-r)); break;
				}
			}else{
				return pop();
			}
		}
		return null;
	}

}
