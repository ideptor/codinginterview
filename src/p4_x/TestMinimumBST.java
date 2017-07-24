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

}
