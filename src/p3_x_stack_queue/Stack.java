package p3_x_stack_queue;

import java.util.ArrayList;

public class Stack <T extends Comparable<?>> {

	ArrayList<T> stack=new ArrayList<>();
	
	public void push(T elem) {
		stack.add(elem);
	}
	public boolean empty() {
		return (stack.size()<=0)?true:false;
	}
	public T pop() {
		if(empty()) return null;
		
		T elem = stack.remove(stack.size()-1);
		return elem;
	}
	public T peek() {
		if(empty()) return null;
		return stack.get(stack.size()-1);
	}

}
