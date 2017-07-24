package p4_x;

import org.junit.Ignore;

public class BSTUtil {

	public static int[] makeMinimumBSTFromSortedNoDuplicatedArray(int[] array, int size) {
		int[] bst = new int[size];
		insertNode(0,array.length-1,bst,0);
		return bst;
	}

	private static void insertNode(int start, int end, int[] bst, int curNode) {
		if(start>end) return;
		else if(start==end) bst[curNode] = start;
		else {
			int mid = (start+end)/2;
			bst[curNode] = mid;
			insertNode(start, mid-1, bst, curNode*2+1);
			insertNode(mid+1, end, bst, curNode*2+2);
		}
		
	}

	@Ignore
	public static int getMaxHeight(int[] bst) {
		return 0;
	}

	public static String print(int[] bst) {
		String msg = "[";
		for(int node:bst) {
			msg+=node+", ";
		}
		msg=msg.substring(0, msg.length()-2);
		msg+="]";
		return msg;
	}

}
