package p2_x_linkedlist;

public class LinkedListUtil {

	public static Object print(LinkedListNode node) {
		
		if(node == null) return "[]";
		
		String msg="[";
		
		while(node!=null) {
			msg += node.value+" ";
			
			node = node.next;
		}
		
		return msg.trim()+"]";
	}

	public static LinkedListNode seperate(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		LinkedListNode middle = null;
		
		LinkedListNode cur = node;
		while(cur != null) {
			if(cur.value<x) {
				if(beforeStart == null) 
					beforeStart=beforeEnd=cur;
				else {
					beforeEnd.next = cur;
					beforeEnd = cur;
				}
					
			} else if(cur.value>x){
				if(afterStart == null) {
					afterStart=afterEnd=cur;
				} else {
					afterEnd.next = cur;
					afterEnd = cur;
				}
			} else {
				middle = cur;
			}
			cur = cur.next;
		}
		
		middle.next=afterStart;
		afterStart = middle;
		
		if(beforeStart==null) {
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
		
	}

}
