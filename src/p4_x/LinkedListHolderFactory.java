package p4_x;

public class LinkedListHolderFactory {

	public static LinkedListHolder createLinkedListHolder(int[] bst) {
		
		LinkedListHolder linkedListHoder = new LinkedListHolder();
		makeLinkedListFromBST(bst, 0, 0, linkedListHoder);
		
		return linkedListHoder;
	}

	private static void makeLinkedListFromBST(int[] bst, int curNode, int depth, LinkedListHolder linkedListHoder) {
		if(curNode >= bst.length || bst[curNode]==-1 ) return;
		linkedListHoder.add(depth, bst[curNode]);
		makeLinkedListFromBST(bst, curNode*2+1, depth+1, linkedListHoder);
		makeLinkedListFromBST(bst, curNode*2+2, depth+1, linkedListHoder);
	}

}
