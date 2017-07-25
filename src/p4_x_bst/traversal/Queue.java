package p4_x_bst.traversal;

import java.util.ArrayList;

public class Queue {
	ArrayList<Integer> queue=new ArrayList<Integer>();
	
	int front=0;
	int end=0;
	
	int size() {
		return end-front; 
	}
	
	void enqueue(Integer value) {
System.out.println("enqueue: "+value+" , size="+size()+", "+queue);		
		queue.add(value);
		end++;
	}
	
	Integer dequeue() {
System.out.println("denqueue: , size="+size()+", "+queue);			
		if(front>=end) return null;
		int value=queue.get(front);
		front++;
		return value;
	}
}