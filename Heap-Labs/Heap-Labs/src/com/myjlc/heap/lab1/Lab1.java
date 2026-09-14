package com.myjlc.heap.lab1;

public class Lab1 {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		System.out.println(myheap.left(1));
		System.out.println(myheap.right(1));
		System.out.println(myheap.parent(1));
		System.out.println(myheap.parent(5));
		
	}
}
