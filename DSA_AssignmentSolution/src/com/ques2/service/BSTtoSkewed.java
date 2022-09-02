package com.ques2.service;

import com.ques2.main.Driver;
import com.ques2.main.Driver.Node;

public class BSTtoSkewed {
	public Node node;
	public static Node prevNode = null;
	public static Node headNode = null;

	public Node flattenBTToSkewed(Node root, int order) {

		if(root == null) {
			return null;
		}

		if(order > 0) {
			flattenBTToSkewed(root.right, order);
		} else {
			flattenBTToSkewed(root.left, order);
		}
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);
		}
		return headNode;
	}

	public void traverseRightSkewed(Node root) { 
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}
}