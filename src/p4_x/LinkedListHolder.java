package p4_x;

import java.util.ArrayList;

public class LinkedListHolder {

	private ArrayList<ArrayList<Integer>> linkedListlist;
	
	public LinkedListHolder() {
		super();
		this.linkedListlist = new ArrayList<ArrayList<Integer>>();
	}

	public void add(int depth, int node) {
		ArrayList<Integer> linkedList=null;
		
		if(linkedListlist.size()>depth) {
			linkedList = linkedListlist.get(depth);
		} else {
			linkedList = new ArrayList<Integer>();
			linkedListlist.add(linkedList);
		}
		linkedList.add(node);
		
	}
	
	public String toString() {
		String msg="";
		for(ArrayList<Integer> list:linkedListlist) {
			msg += "[";
			for(int node:list) {
				msg+=node+", ";
			}
			msg=msg.substring(0, msg.length()-2);
			msg+="]";

		}
		return msg;
	}

}
