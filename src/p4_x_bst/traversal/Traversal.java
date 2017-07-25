package p4_x_bst.traversal;

import java.util.ArrayList;

public class Traversal {

	public static String inorder(Integer[] tree, Integer node) {
		
		if(node == null) return "";
		if(tree[node]==null) return "";
		
		Integer leftChild = (node*2+1 < tree.length)? node*2+1 : null;
		Integer rightChild = (node*2+2 < tree.length)? node*2+2 : null;
	
		return inorder(tree, leftChild)+tree[node]+" "+inorder(tree, rightChild);
	}

	public static String preorder(Integer[] tree, Integer node)  {
		
		if(node == null) return "";
		if(tree[node]==null) return "";
		
		Integer leftChild = (node*2+1 < tree.length)? node*2+1 : null;
		Integer rightChild = (node*2+2 < tree.length)? node*2+2 : null;
	
		return tree[node]+" "+preorder(tree, leftChild)+preorder(tree, rightChild);
	}

	public static String postorder(Integer[] tree, Integer node)  {
		if(node == null) return "";
		if(tree[node]==null) return "";
		
		Integer leftChild = (node*2+1 < tree.length)? node*2+1 : null;
		Integer rightChild = (node*2+2 < tree.length)? node*2+2 : null;
	
		return postorder(tree, leftChild)+postorder(tree, rightChild)+tree[node]+" ";
	
	}

	public static String dfs(Integer[] tree, Integer node, boolean[] visited) {
		
		if(visited==null) visited=new boolean[tree.length];		
		if(node==null || tree[node] == null || visited[node]==true) return "";

		String trace=tree[node]+" ";
		visited[node]=true;
		
		Integer leftChild = (node*2+1 < tree.length)? node*2+1 : null;
		Integer rightChild = (node*2+2 < tree.length)? node*2+2 : null;
		
		return trace+dfs(tree,leftChild,visited)+dfs(tree,rightChild,visited);
	}

	public static String bfs(Integer[] tree, Integer node) {

		Queue queue = new Queue();
		queue.enqueue(node);
		
		String trace="";
		
		while(queue.size()>0) {
			int cur = queue.dequeue();
			trace += tree[cur] + " ";
			
			Integer leftChild = (cur*2+1 < tree.length)? cur*2+1 : null;
			if(leftChild != null && tree[leftChild] != null)
				queue.enqueue(leftChild);
			
			Integer rightChild = (cur*2+2 < tree.length)? cur*2+2 : null;
			if(rightChild != null && tree[rightChild] != null)
				queue.enqueue(rightChild);
			
		}
		
		return trace;
	}

}


