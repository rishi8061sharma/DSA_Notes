package com.jlcindia.binarysearchtrees;

// Find Ceil in BST - Iretartive Way
// Equal or Smallest in Larger Keys

public class Lab10 {

	public static Node findCeil(Node myroot, int element) {

		Node result = myroot;
		while (myroot != null) {
			if (element == myroot.key) {
				return myroot;
			} else if (element < myroot.key) {
				result = myroot;
				myroot = myroot.left;
			} else if (element > myroot.key) {
				myroot = myroot.right;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		Node myroot = new Node(25);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(10);
		myroot.left.right = new Node(23);

		myroot.right.left = new Node(27);
		myroot.right.right = new Node(35);

		myroot.right.left.left = new Node(26);
		myroot.right.left.right = new Node(28);

		//myroot.left.left.left = new Node(9);

		Node ceil = findCeil(myroot, 29);
		System.out.println(ceil.key);


	}
}
