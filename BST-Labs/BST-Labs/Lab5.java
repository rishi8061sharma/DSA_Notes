package com.jlcindia.binarysearchtrees;

// Find Min in BST - Recursive Way

public class Lab5 {
	
	public static int findMin(Node myroot) {
		
		if(myroot==null)
			return -1;
				
		if(myroot.left==null)
			return myroot.key;
		else 
			return findMin(myroot.left);
	}
	

	public static void main(String[] args) {

		
		Node myroot = new Node(25);

		myroot.left = new Node(20);
		myroot.right = new Node(30);

		 myroot.left.left = new Node(10); 
		 myroot.left.right = new Node(23);
		 
		 myroot.right.left = new Node(27); 
		 myroot.right.right = new Node(35);
		
		 myroot.left.left.left = new Node(6); 
		 
			int min = findMin(myroot);
			System.out.println(min);
			
			
	}
}
