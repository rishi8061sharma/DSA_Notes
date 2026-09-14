package com.jlcindia.binarytrees;

// Pre Order Traversal
// Root => Left => Right

public class Lab2 {

	public static void preorder(Node myroot) {
		if (myroot != null) {
			System.out.println(myroot.key + "\t");
			preorder(myroot.left);
			preorder(myroot.right);
		}
	}

	public static void main(String[] args) {

		Node myroot = new Node(10);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		 myroot.left.left = new Node(40); 
		 myroot.left.right = new Node(50);
		 
		 myroot.right.left = new Node(60); 
		 myroot.right.right = new Node(70);

		 preorder(myroot);
	}
}
