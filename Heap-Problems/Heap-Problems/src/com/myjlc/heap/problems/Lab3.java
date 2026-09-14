package com.myjlc.heap.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

//3. Print K Closest Elements in the Array

class MyPair implements Comparable<MyPair>{
	int element;
	int diff;
	
	public MyPair(int element, int diff) {
		super();
		this.element = element;
		this.diff = diff;
	}

	@Override
	public int compareTo(MyPair mypair) {
		return this.diff-mypair.diff;
	}
		
}
public class Lab3 {
	public static void kClosest(int arr[], int k,int x) {//24
		//int arr[] = { 5, 15, 10, 20, 8, 25, 18,50,22,45 };

		PriorityQueue<MyPair> pq = new PriorityQueue<MyPair>(Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			MyPair mypair = new MyPair(arr[i],Math.abs(arr[i]-x));
			pq.add(mypair);
		}

		for (int i = k; i < arr.length; i++) {
			int currDiff = Math.abs(arr[i]-x);
			if (currDiff < pq.peek().diff) {
				pq.poll();
				pq.add(new MyPair(arr[i],currDiff));
			}
		}

		while (!pq.isEmpty()) {
			System.out.print(pq.poll().element + "\t");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5, 15, 10, 20, 8, 25, 18,50,22,45 };
		int k = 3;
		int x=24;
		System.out.println(Arrays.toString(arr));
		kClosest(arr, k,x);
	}
}
