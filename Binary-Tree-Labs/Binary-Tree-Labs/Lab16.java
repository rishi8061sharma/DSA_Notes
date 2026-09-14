package com.jlcindia.binarytrees;

// Checking for Balanced Binary Tree

public class Lab16 {
	
	public static int height(Node myroot) {
		if (myroot == null) {
			return 0;
		}else{
			int leftHight =  height(myroot.left);
			int rightHight =  height(myroot.right);
			int max= Math.max(leftHight, rightHight);
			return 1+ max;
		}
	}
	
	public static boolean isBalanced(Node mynode) {

		// 1. Null Tree
		if (mynode == null) {
			return true;
		}
		
		int leftHeight = height(mynode.left); 
		int rightHeight = height(mynode.right);
		int diff = Math.abs(leftHeight-rightHeight);
		
		return ( diff <= 1 && isBalanced(mynode.left) && isBalanced(mynode.right));
	}

	public static void main(String[] args) {

		Node myroot = new Node(10);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(40);
		myroot.left.right = new Node(50);

		myroot.right.left = new Node(60);
		myroot.right.left.left = new Node(70);
		myroot.right.left.left.left = new Node(80);
		
		boolean flag = isBalanced(myroot);
		System.out.println(flag);

	}
}
