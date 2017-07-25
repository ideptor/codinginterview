package p2_x_linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void testSeperate() {
		
		// given
		int[] array = {5,6,8,9,1,4,7};
		LinkedListNode node = LinkedListFactory.createLinkedList(array);
		assertEquals("[5 6 8 9 1 4 7]", LinkedListUtil.print(node));
		
		// when
		node = LinkedListUtil.seperate(node, 6);
		
		// then
		assertEquals("[5 1 4 6 8 9 7]", LinkedListUtil.print(node));
		
	}
	
	@Test
	public void testSum() {
		// givern
		int[] ord1 = {7,1,6};
		int[] ord2 = {5,9,2};
		LinkedListNode list1 = LinkedListFactory.createLinkedList(ord1);
		LinkedListNode list2 = LinkedListFactory.createLinkedList(ord2);
		assertEquals("[7 1 6]", LinkedListUtil.print(list1));
		assertEquals("[5 9 2]", LinkedListUtil.print(list2));
		
		// when
		LinkedListNode node = LinkedListAddtion.add(list1, list2);
		
		//then : 617 + 295 = 912
		assertEquals("[2 1 9]", LinkedListUtil.print(node));
		
		
		assertEquals("[]", LinkedListUtil.print(LinkedListAddtion.add(null, null)));
		assertEquals("[2 1 1]", 
				LinkedListUtil.print(
						LinkedListAddtion.add(
								LinkedListFactory.createLinkedList(new int[]{1}), 
								LinkedListFactory.createLinkedList(new int[]{1,1,1})
								)));
		
		assertEquals("[2 1]", 
				LinkedListUtil.print(
						LinkedListAddtion.add(
								LinkedListFactory.createLinkedList(new int[]{9}), 
								LinkedListFactory.createLinkedList(new int[]{3})
								)));
		
	}

}
