package p2_x_linkedlist;

public class LinkedListAddtion {

	public static LinkedListNode add(LinkedListNode list1, LinkedListNode list2) {
		
		LinkedListNode resultNode=null;
		LinkedListNode node=null;
		LinkedListNode node1=list1;
		LinkedListNode node2=list2;
		
		int carry=0;
		while(node1 != null || node2!=null || carry!=0) {
			int ord1=(node1!=null)?node1.value:0;
			int ord2=(node2!=null)?node2.value:0;
			
			if(node == null) {
				resultNode = node = new LinkedListNode();
			} else {
				node.next = new LinkedListNode();
				node = node.next;
			}
			
			int sum = ord1+ord2+carry;
			carry=0;
			if(sum>10) {
				sum -= 10;
				carry++;
			}
			node.value = sum;
			
			if(node1!=null) node1 = node1.next;
			if(node2!=null) node2 = node2.next;
		}
		
		return resultNode;
	}

}
