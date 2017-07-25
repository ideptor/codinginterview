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

	public static boolean checkBST(int[] bst, int[] val, int curNode, Integer max, Integer min) {
		
		if(curNode>=bst.length || curNode==-1 || bst[curNode]==-1) return true;
		
		if(max != null && val[bst[curNode]]>max.intValue()) return false;
		if(min != null && val[bst[curNode]]<min.intValue()) return false;
		
		int leftChildIdx = (curNode*2+1)<bst.length? curNode*2+1 : -1;
		int rightChildIdx = (curNode*2+2)<bst.length? curNode*2+2 : -1;
		
		
		if(checkBST(bst, val, leftChildIdx, val[bst[curNode]], min)==false) return false;
		if(checkBST(bst, val, rightChildIdx,max,val[bst[curNode]])==false) return false;
		
		if(leftChildIdx!=-1 && val[bst[leftChildIdx]]>val[bst[curNode]]) return false;
		if(rightChildIdx!=-1 && val[bst[rightChildIdx]]<val[bst[curNode]]) return false;
		
		return true;
	}

}
