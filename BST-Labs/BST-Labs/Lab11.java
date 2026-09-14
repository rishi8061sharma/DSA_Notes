package com.jlcindia.binarysearchtrees;

// Insert Operation in BST -  Recursive

public class Lab11 {

	public static void inorder(Node myroot) {
		if (myroot != null) {
			inorder(myroot.left);
			System.out.println(myroot.key + "\t");
			inorder(myroot.right);
		}
	}

	public static Node insert(Node root, int element) {
		
		if (root == null) {
			return new Node(element);
		}
		
		if(element<root.key) {
			root.left = insert(root.left,element);
		}else if(element>root.key) {
			root.right = insert(root.right,element);
		}
		
		return root;
	}

	public static void main(String[] args) {

		Node root = null;
		root = insert(root, 50);
		root = insert(root,25);
		root = insert(root,75);
		root = insert(root,30);
		root = insert(root,20);
		root = insert(root,60);
		root = insert(root,90);
		inorder(root);

		/*
		inorder(root);
		System.out.println("--------------");
		root = insert(root,25);
		inorder(root);
		System.out.println("--------------");
		root = insert(root,75);
		inorder(root);
		System.out.println("--------------");
		root = insert(root,30);
		inorder(root);
		System.out.println("--------------");
		root = insert(root,20);
		inorder(root);
		System.out.println("--------------");
		root = insert(root,60);
		inorder(root);
		System.out.println("--------------");
		root = insert(root,90);
		inorder(root);
		*/
		
	}
}
