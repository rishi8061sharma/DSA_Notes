package com.jlcindia.sorting;

import java.util.Arrays;

//Selection Sort

public class Lab13 {

	public static void selectionSort(int arr[]) {

		int n = arr.length;

		for (int i = 0; i <= n - 2; i++) { // i<n-1
			int min_index = i;

			for (int j = i + 1; j <= n - 1; j++) { // j<n
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}

			if (i != min_index) {
				int temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}

		} // Outer For
	}

	public static void main(String[] args) {
		int arr[] = { 25, 9, 15, 8, 20, 7, 10 };

		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
//Time - O(n2)
//Aux Space - O(1)