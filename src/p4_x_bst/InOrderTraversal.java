package p4_x_bst;

public class InOrderTraversal {

	public static Integer findNextOrder(Integer[] bst, int curNode) {
		
		Integer nextOrder =  null;
		
		int rightChildIdx = curNode*2+2;
//		int parentIdx = (curNode-1)/2;
		
		if(rightChildIdx<bst.length && bst[rightChildIdx] != null)
			nextOrder = findMostLeft(bst,rightChildIdx);
		else 
			nextOrder = findParentAsLeftChild(bst, curNode);
		
		return nextOrder;
	}

	private static Integer findParentAsLeftChild(Integer[] bst, int curNode) {
		
		if(curNode == 0) return null;
		
		int parent = (curNode-1)/2;
		Integer nextOrder = null;
		
		if(parent*2+1 == curNode) { // left
			nextOrder = parent;
		} else {
			nextOrder = findParentAsLeftChild(bst, parent);
		}
		
		return nextOrder;
	}

	private static Integer findMostLeft(Integer[] bst, int curNode) {
//System.out.println(curNode+":"+bst[curNode]);		
		if(curNode >= bst.length || bst[curNode]==null) return null;
		
		int leftChildIdx = curNode * 2 + 1;
		Integer nextIndex = findMostLeft(bst, leftChildIdx);
		if(nextIndex == null) nextIndex = curNode;

		return nextIndex;
	}

}
