package com.myjlc.heap.lab3;

public class Lab3 {
	public static void main(String[] args) {
		
		int arr[] = {40,20,30,25,35,45,55};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.heapify(0);
		myheap.printHeap();
	}
}
