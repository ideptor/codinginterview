package p4_x;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinimumBST {

	@Test
	public void p4_3_Make_Mininum_Height_BST() {
		// given 
		int[] a = {1,2,3,4,5,6,7};
		
		// when
		int[] bst = BSTUtil.makeMinimumBSTFromSortedNoDuplicatedArray(a, a.length*2);
		
		//then
		assertEquals("[3, 1, 5, 0, 2, 4, 6, 0, 0, 0, 0, 0, 0, 0]", BSTUtil.print(bst));
	}
	
	@Test
	public void p4_4_make_linked_list_from_BST() {
		
		// given 
		int[] bst = {3, 1, 5, 0, 2, 4, 6};
		
		// when
		LinkedListHolder linkedListHolder = LinkedListHolderFactory.createLinkedListHolder(bst);
		
		// then
		assertEquals("[3][1, 5][0, 2, 4, 6]", linkedListHolder.toString());
	}
	
	@Test
	public void p4_5_check_BST() {
		
		// given
		
		int[] bst = 	{3, 1, 5, 0, 2, 4, 6};
		int[] non_bst =	{3, 5, 1, 0, 2, 4, 6};
		
		// then
		assertEquals(true, BSTUtil.checkBST(bst,0,null,null));
		assertEquals(false, BSTUtil.checkBST(non_bst,0,null,null));
	}
	
	@Test
	public void p4_5_check_BST_advanced() {
		
		// given
		int[] non_bst = {1, 12, 123, 114, 115, 216, 317};
		
		// then
		assertEquals(false, BSTUtil.checkBST(non_bst,0,null,null));
	}

	@Test
	public void p4_6_findNextOrder() {
		
		// given
		Integer[] bt1 = {1, 1,1, null,null,1,null, null,null,null,null,null,1};  // given:0, next:5
		Integer[] bt2 = {1, 1,null, 1};											 // given:1, next:0
		Integer[] bt3 = {1, 1,null, null,1,null,null, null,null,1};				 // given:4, next:0
		Integer[] bt4 = {1, null,1, null,null,null,1, null,null,null,null,null,null,1}; // given:6, next:null
	
		// then
		assertEquals(new Integer(5), InOrderTraversal.findNextOrder(bt1,0));
		assertEquals(new Integer(0), InOrderTraversal.findNextOrder(bt2,1));
		assertEquals(new Integer(0), InOrderTraversal.findNextOrder(bt3,4));
		assertEquals(null, InOrderTraversal.findNextOrder(bt4,6));
		
		
	}
}
