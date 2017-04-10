package practice_one_day_before;

public class StackImplUsingArray {
	int n;
	int capacity;
	String[] stack;

	StackImplUsingArray(int capacity) {
		this.capacity = capacity;
		stack = new String[capacity];
		n = 0;
	}

	String pop() {
		String result = stack[n-1];
		stack[n-1] = null;
		n--;
		return result;
	}

	boolean push(String x) {
		if (n == capacity) {
			resize();
		}
		stack[n++] = x;
		return true;
	}

	private void resize() {
		int new_capacity = capacity * 2;
		String[] temp = new String[new_capacity];
		for (int i = 0; i < capacity; i++) {
			temp[i] = stack[i];
		}
		stack = temp;
		capacity = new_capacity;

	}

	boolean isEmpty() {
		return false;
	}

	String peek() {
		return null;
	}

	int size() {
		return n;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (String value : stack) {
			if (value != null) {
				sb.append(value);
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String args[]) {
		String run = "1 + 2 - 3 + 4 + 5";
		String[] tokens = run.split(" ");
		StackImplUsingArray stack = new StackImplUsingArray(tokens.length);

		for (String token : tokens) {
			stack.push(token);
		}
		System.out.println("B4 Evaluation 1: \n" + stack.toString());
		String result = stack.evaluate();
		System.out.println(result);
		System.out.println("After Evaluation 1: \n" + stack.toString());

		run = "1 + 2 - 3 + 4 + 5 + 1 + 2 - 3 + 4 + 5";
		tokens = run.split(" ");
		for (String token : tokens) {
			stack.push(token);
		}
		System.out.println("B4 Evaluation 2: \n" + stack.toString());
		result = stack.evaluate();
		System.out.println(result);
		System.out.println("After Evaluation 2: \n" + stack.toString());
	}

	private String evaluate() {
		while (stack != null) {
			if (n > 1) {
				int l = Integer.parseInt(pop());
				String o = pop();
				int r = Integer.parseInt(pop());
				switch (o) {
				case "+":
					push(String.valueOf(l + r));
					break;
				case "-":
					push(String.valueOf(l - r));
					break;
				}
			} else {
				return pop();
			}
		}
		return null;
	}

}
