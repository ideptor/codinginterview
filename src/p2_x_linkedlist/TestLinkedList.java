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

}
