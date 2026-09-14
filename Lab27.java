package com.jlcindia.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Bucket Sort

public class Lab27 {

	public static void bucketSort(int arr[], int k) {

		int n = arr.length;

		// 1.Find the Max
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		max++;

		// 2.Create the Buckets
		ArrayList<ArrayList<Integer>> mybuckets = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < k; i++) {
			mybuckets.add(new ArrayList<Integer>());
		}

		// 3.Fill the Buckets
		for (int i = 0; i < n; i++) {
			int mybucketIndex = (k * arr[i]) / max;
			mybuckets.get(mybucketIndex).add(arr[i]);
		}

		// 4. Sort the Buckets
		for (int i = 0; i < k; i++) {
			Collections.sort(mybuckets.get(i));
		}

		// 5. Join the Sorted Buckets

		int myindex = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < mybuckets.get(i).size(); j++) {
				arr[myindex++] = mybuckets.get(i).get(j);
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 30, 40, 10, 80, 5, 12, 70, 55, 45 };
		int k = 4; // No of Buckets

		System.out.println(Arrays.toString(arr));
		bucketSort(arr, k);
		System.out.println(Arrays.toString(arr));

	}
}
