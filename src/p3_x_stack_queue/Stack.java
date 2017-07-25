package p3_x_stack_queue;

import java.util.ArrayList;

public class Stack <T> {

	ArrayList<T> stack=new ArrayList<>();
	int top=-1;
	
	public void push(T elem) {
		stack.add(elem);
		top++;
	}
	public boolean empty() {
		return (top>=0)?false:true;
	}
	public T pop() {
		if(empty()) return null;
		
		T elem = stack.get(top);
		top--;
		return elem;
	}

}
