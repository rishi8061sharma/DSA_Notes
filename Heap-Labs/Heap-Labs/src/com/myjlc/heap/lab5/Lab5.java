package com.myjlc.heap.lab5;

public class Lab5 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,90,80,70,60};
		MyBinaryHeap myheap = new MyBinaryHeap(arr);
		myheap.printHeap();
		System.out.println("---------------------");
		myheap.decreaseKey(3, 5);
		myheap.printHeap();
	}
}
