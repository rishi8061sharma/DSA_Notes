package com.jlcindia.binarysearchtrees;

// Find Max in BST - Iretartive Way

public class Lab8 {

	public static int findMax(Node myroot) {

		if (myroot == null)
			return -1;

		Node current = myroot;
		while (current.right != null) {
			current = current.right;
		}
		return current.key;
	}

	public static void main(String[] args) {

		Node myroot = new Node(25);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(10);
		myroot.left.right = new Node(23);

		myroot.right.left = new Node(27);
		myroot.right.right = new Node(35);

		myroot.right.right.right = new Node(66);

		int max = findMax(myroot);
		System.out.println(max);

	}
}
