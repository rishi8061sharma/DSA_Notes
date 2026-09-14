package com.jlcindia.binarytrees;

// Size of Binary Tree

public class Lab5 {

	public static int getSize(Node myroot) {
		if (myroot == null) {
			return 0;
		} else {
			int leftSize = getSize(myroot.left);
			int rightSize = getSize(myroot.right);
			return 1 + leftSize + rightSize;
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

		 myroot.right.right.left= new Node(80);
		 myroot.right.right.left.right= new Node(90);

		int height = getSize(myroot);
		System.out.println(height);

	}
}
