package com.jlcindia.circular.singly.linkedlist;

// Count the Nodes in Circular Singly LinkedList 

public class Lab25{

	static int length(Node headNode) {
		
		int length=0;
		Node currentNode = headNode;

		do {
			length++;
			currentNode = currentNode.next;
		} while (currentNode != headNode);

		return length;
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5=new Node(50);
		
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next=head;

		int len=length(head);
		System.out.println(len);

	}

}
