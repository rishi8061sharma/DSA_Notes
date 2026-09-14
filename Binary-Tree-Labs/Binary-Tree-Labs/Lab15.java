package com.jlcindia.binarytrees;

// Checking for Full Binary Tree

public class Lab15 {

	public static boolean isFullBinaryTree(Node mynode) {

		// 1. Null Tree
		if (mynode == null) {
			return true;
		}

		// 2.When Single Root is there
		if (mynode.left == null && mynode.right == null) {
			return true;
		}
		
		// 3.When Childrens are there
		if (mynode.left != null && mynode.right != null) {
			boolean leftFlag = isFullBinaryTree(mynode.left);
			boolean rightFlag = isFullBinaryTree(mynode.right);
			return ( leftFlag && rightFlag);
		}
		
		return false;
	}

	public static void main(String[] args) {

		Node myroot = new Node(10);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(40);
		myroot.left.right = new Node(50);

		myroot.right.left = new Node(60);
		//myroot.right.right = new Node(70);

		boolean flag = isFullBinaryTree(myroot);
		System.out.println(flag);

	}
}
