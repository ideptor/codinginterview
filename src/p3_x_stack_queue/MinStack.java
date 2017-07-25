package p3_x_stack_queue;

public class MinStack<T extends Comparable<T>> extends Stack<T> {

	Stack<T> minStack = new Stack<>();
	
	public T min() {	
		return minStack.peek();
	}
	
	public void push(T elem) {
		if(minStack.empty() || elem.compareTo(minStack.peek()) <= 0) {
			minStack.push(elem);
		}
		super.push(elem);
	}

	public T pop() {
		T elem = super.pop();
		if(minStack.peek().equals(elem)) {
			minStack.pop();
		}
		return elem;
	}
}
