package com.myjlc.heap.lab1;

public class MyBinaryHeap {

	int arr[];
	int size;
	int capacity;

	public MyBinaryHeap(int arr[]) {
		this.arr = arr;
		this.size=arr.length;
		this.capacity=arr.length;
	}
	
	public MyBinaryHeap(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	public int left(int i) {
		return (2 * i + 1);
	}

	public int right(int i) {
		return (2 * i + 2);
	}

	public int parent(int i) {
		return (i - 1) / 2;
	}

	public void printHeap() {
		for (int i = 0; i < size; i++) {
			System.out.print( arr[i]+"\t");
		}
		System.out.println("");
	}

}
