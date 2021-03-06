package p4_x_bst.traversal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTraversal {

	@Test
	public void test_inorder_preorder_postorer_Traversal() {
		// given
		Integer[] tree = {1,2,3,4,5,6,null};
		
		//then
		assertEquals("4 2 5 1 6 3", Traversal.inorder(tree, 0).trim());
		assertEquals("1 2 4 5 3 6", Traversal.preorder(tree, 0).trim());
		assertEquals("4 5 2 6 3 1", Traversal.postorder(tree, 0).trim());

	}


	@Test
	public void test_dfs_bfs_raversal() {
		// given
		Integer[] tree = {1,2,3,4,5,6,null};
		
		//then
		assertEquals("1 2 4 5 3 6", Traversal.dfs(tree, 0, null).trim());
		assertEquals("1 2 3 4 5 6", Traversal.bfs(tree, 0).trim());

	}
	

}
