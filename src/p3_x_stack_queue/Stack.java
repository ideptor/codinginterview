package p3_x_stack_queue;

import java.util.ArrayList;

public class Stack <T> {

	ArrayList<T> stack=new ArrayList<>();
	int top=-1;
	
	public void push(T elem) {
		top++;
		stack.set(top, elem);
	}
	public boolean empty() {
		return (top>=0)?false:true;
	}
	public T pop() {
		if(empty()) return null;
		
		T elem = stack.remove(top);
		top--;
		return elem;
	}
	public T peek() {
		if(empty()) return null;
		return stack.get(top);
	}

}
