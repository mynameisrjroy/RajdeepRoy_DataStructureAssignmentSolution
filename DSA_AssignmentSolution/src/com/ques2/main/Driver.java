package com.ques2.main;

import com.ques2.service.BSTtoSkewed;

public class Driver {
	
	public static class Node {
		public Node left;
	    public Node right;
	    public int data;
	    
	};

	public static Node newNode(int nodeData)
	{
	    Node temp = new Node();
	 
	    temp.data = nodeData;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}
	
	public static void main(String[] args) {
		BSTtoSkewed bst = new BSTtoSkewed();
		
		Node tree = newNode(50);
		tree.left = newNode(30);
		tree.right = newNode(60);
		tree.left.left = newNode(10);
		tree.right.left = newNode(55);
		
		int order = 0;
		Node headNode =bst.flattenBTToSkewed(tree, order);
		bst.traverseRightSkewed(headNode);

	}

}
