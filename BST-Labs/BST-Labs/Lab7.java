package com.jlcindia.binarysearchtrees;

// Find Max in BST - Recursive Way

public class Lab7 {
	
	public static int findMax(Node myroot) {
		
		if(myroot==null)
			return -1;
				
		if(myroot.right==null)
			return myroot.key;
		else 
			return findMax(myroot.right);
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
