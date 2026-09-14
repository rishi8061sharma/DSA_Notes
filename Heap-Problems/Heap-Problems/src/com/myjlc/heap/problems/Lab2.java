package com.myjlc.heap.problems;

import java.util.Arrays;
import java.util.PriorityQueue;

//2. Print K Largest Elements in the Array

public class Lab2 {
	public static void kLargest(int arr[], int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}

		System.out.println(pq);

		while (!pq.isEmpty()) {
			System.out.print(pq.poll() + "\t");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 5, 15, 10, 20, 8, 25, 18,50,22,45 };
		int k = 3;
		System.out.println(Arrays.toString(arr));
		kLargest(arr, k);
	}
}
