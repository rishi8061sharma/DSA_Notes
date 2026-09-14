package com.jlcindia.binarysearchtrees;

// Insert Operation in BST -  Iterative

public class Lab12 {

	public static void inorder(Node myroot) {
		if (myroot != null) {
			inorder(myroot.left);
			System.out.println(myroot.key + "\t");
			inorder(myroot.right);
		}
	}

	public static Node insert(Node root, int element) {

		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;

			if (element < current.key) {
				current = current.left;
			} else if (element > current.key) {
				current = current.right;
			} else if (element == current.key) {
				return root;
			}
		}
		
		Node temp = new Node(element);
		if(parent==null) {
			return temp;
		}
		
		if (element < parent.key)
			parent.left = temp;
		else if(element > parent.key)
			parent.right = temp;

		return root;
	}

	public static void main(String[] args) {

		Node root = null;
		root = insert(root, 50);
		
		root = insert(root, 25);
		root = insert(root, 75);
		root = insert(root, 30);
		root = insert(root, 20);
		root = insert(root, 60);
		root = insert(root, 90);
		inorder(root);
		System.out.println("------------");
		root = insert(root, 10);
		inorder(root);
		System.out.println("------------");
		root = insert(root, 22);
		inorder(root);
		System.out.println("------------");
	}
}
