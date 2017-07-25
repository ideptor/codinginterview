package p2_x_linkedlist;

public class LinkedListFactory {

	public static LinkedListNode createLinkedList(int[] array) {
		LinkedListNode firstNode = null;
		LinkedListNode node = null;
		
		for(int value:array) {
			LinkedListNode newNode = new LinkedListNode();
			newNode.value = value;
			if(firstNode == null) {
				firstNode = node = newNode;
			} else {
				node.next = newNode;
				node = newNode;
			}
			
		}
		return firstNode;
	}

}
