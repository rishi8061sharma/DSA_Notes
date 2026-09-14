package com.jlcindia.sorting;

import java.util.Arrays;

// Merge Two Sorted Arrays
// Merged Output should be Sorted

public class Lab15 {

	public static int[] mergeArrays(int a[],int b[]) {
		int m = a.length;
		int n = b.length;
		
		int temp[] = new int[m+n];
		
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				temp[k++] = a[i];
				i++;
			}else {
				temp[k++] = b[j];
				j++;
			}
		}
		
		while(i<m) {
			temp[k++] = a[i];
			i++;
		}
		
		while(j<n) {
			temp[k++] = b[j];
			j++;
		}
		
		return temp;
	}

	public static void main(String[] args) {
		int a[] = { 10,20,50};
		int b[] = { 5,15,50,60,70};
		int arr[] =mergeArrays(a,b);
		System.out.println(Arrays.toString(arr));

	}
}