package p3_x_stack_queue;

import java.util.ArrayList;

public class Queue<T extends Integer> {
	ArrayList<T> queue=new ArrayList<T>();
	
	int front=0;
	int end=0;
	
	public int size() {
		return end-front; 
	}
	
	public void enqueue(T value) {
//System.out.println("enqueue: "+value+" , size="+size()+", "+queue);		
		queue.add(value);
		end++;
	}
	
	public T dequeue() {
//System.out.println("denqueue: , size="+size()+", "+queue);			
		if(front>=end) return null;
		T value=queue.get(front);
		front++;
		return value;
	}
}