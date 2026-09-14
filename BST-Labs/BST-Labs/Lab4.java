package com.jlcindia.binarysearchtrees;

//Search in BST - Iterative  Way

public class Lab4 {

	public static boolean search(Node myroot, int element) {

		while (myroot != null) {
			if (element == myroot.key)
				return true;
			else if (element < myroot.key)
				myroot = myroot.left;
			else if (element > myroot.key)
				myroot = myroot.right;
		}

		return false;
	}

	public static void main(String[] args) {

		Node myroot1 = null;

		boolean flag = search(myroot1, 25);
		System.out.println(flag);

		Node myroot2 = new Node(25);

		flag = search(myroot2, 25);
		System.out.println(flag);

		Node myroot = new Node(25);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		myroot.left.left = new Node(10);
		myroot.left.right = new Node(23);

		myroot.right.left = new Node(27);
		myroot.right.right = new Node(35);

		flag = search(myroot, 27);
		System.out.println(flag);
		
		flag = search(myroot, 28);
		System.out.println(flag);

	}
}
