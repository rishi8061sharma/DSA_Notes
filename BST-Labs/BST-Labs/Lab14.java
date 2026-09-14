package com.jlcindia.binarysearchtrees;

// Check whether Binary Tree is BST or Not

public class Lab14 {
	public static boolean isBST(Node root,int min,int max) {
		if(root==null)
			return true;
		
		return  (root.key>min &&
						  root.key<max &&
						 isBST(root.left, min, root.key) &&
						isBST(root.right, root.key, max));
		
	}

	public static void main(String[] args) {

		Node myroot = new Node(50);

		myroot.left = new Node(25);
		myroot.right = new Node(75);

		 myroot.left.left = new Node(20); 
		 myroot.left.right = new Node(30);
		 
		 myroot.right.left = new Node(60); 
		 myroot.right.right = new Node(90);
	
		 boolean flag =isBST(myroot,Integer.MIN_VALUE,Integer.MAX_VALUE);
		 System.out.println(flag);

	}
}
