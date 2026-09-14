package com.jlcindia.circular.singly.linkedlist;

// Insert the Node at ending of Circular Singly LinkedList 

public class Lab27A {

	static Node insertLast(Node headNode,int data) {
		
		Node temp = new Node(data);
		
		//1.Empty List
		if(headNode==null) {
			headNode=temp;
			headNode.next=headNode;
			return headNode;
		}
		
		Node currentNode = headNode;
		while(currentNode.next!=headNode) {
			currentNode=currentNode.next;
		}
		
		temp.next=headNode;
		currentNode.next=temp;
		
		//Head Not Changed
		
		return headNode;
	}
	
	static void displayList(Node headNode) {

		Node currentNode = headNode;

		do {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		} while (currentNode != headNode);

		System.out.println("\n");
	}

	public static void main(String[] args) {

		//1.Empty List
		Node head= null;
		head = insertLast(head,10);
		displayList(head);

		System.out.println("---------------");
		//2. One Node List
		head = insertLast(head,20);
		displayList(head);
		
		System.out.println("---------------");
		//3. More Nodes
		head = insertLast(head,30);
		head = insertLast(head,40);
		head = insertLast(head,99);
		displayList(head);

	}

}
// Time - O(n) 
// Space - O(1)
