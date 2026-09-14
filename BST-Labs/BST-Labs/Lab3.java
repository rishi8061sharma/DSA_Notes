package com.jlcindia.binarysearchtrees;

// Search in BST - Recursive Way

public class Lab3 {
	
	public static boolean search(Node myroot, int element) {
		
		if(myroot==null)
			return false;
				
		if(element==myroot.key)
			return true;
		else if(element<myroot.key)
			return search(myroot.left,element);
		else if(element>myroot.key)
			return search(myroot.right,element);
		
		return false;
	}
	

	public static void main(String[] args) {

		Node myroot1 = null;
		
		boolean flag = search(myroot1, 25);
		System.out.println(flag);
		
	   Node myroot2 =  new Node(25);
		
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
			
			
	}
}
