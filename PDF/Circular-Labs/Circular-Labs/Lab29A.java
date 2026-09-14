package com.jlcindia.circular.singly.linkedlist;

// Delete the First Node in Circular Singly LinkedList 

public class Lab29A {

	static Node deleteFirst(Node headNode) {
		
		//1. Empty List
		if(headNode==null) {
			return null;
		}
		//2. One Node List
		if(headNode.next==headNode) {
			return null;
		}
		
		Node currentNode = headNode;
		while(currentNode.next!=headNode) {
			currentNode=currentNode.next;
		}
		
		currentNode.next = headNode.next;
		headNode.next=null;
		
		headNode = currentNode.next;
		
		return headNode;
	}
	
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

		if(headNode==null) {
			return;
		}
		
		Node currentNode = headNode;

		do {
			System.out.print(currentNode.data + "\t");
			currentNode = currentNode.next;
		} while (currentNode != headNode);

		System.out.println("\n");
	}

	public static void main(String[] args) {

		
		Node head=null;
		head = insertLast(head,10);
		head = insertLast(head,20);
		head = insertLast(head,30);
		head = insertLast(head,40);
		head = insertLast(head,50);
		displayList(head);
		System.out.println("---------------");
		deleteFirst(head);
		displayList(head);
		System.out.println("---------------");
		deleteFirst(head);
		displayList(head);
	}

}
// Time - O(n) 
// Space - O(1)
