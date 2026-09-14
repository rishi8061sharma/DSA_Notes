package com.jlcindia.sorting;

import java.util.Arrays;

// Merge function required for merge sort

public class Lab16 {

	public static void merge(int arr[],int low,int mid,int high) {
		
		int m = mid-low+1;
		int n =high-mid;
		
		int left[] = new int[m];
		for(int i=0;i<m;i++) {
			left[i] = arr[i+low]; //IMP
		}
		
		int right[] = new int[n];
		for(int j=0;j<n;j++) {
			right[j] = arr[mid+1+j]; //IMP
		}
		
	
		int i=0;
		int j=0;
		int k=0;
		while(i<m && j<n) {
			if(left[i]<=right[j]) {
				arr[k++] = left[i];
				i++;
			}else {
				arr[k++] = right[j];
				j++;
			}
		}
		
		while(i<m) {
			arr[k++] = left[i];
			i++;
		}
		
		while(j<n) {
			arr[k++] = right[j];
			j++;
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {99,20,50,5,15,50,99};
		int low = 1;
		int high = 5;
		int mid =2;
		
		System.out.println(Arrays.toString(arr));
		merge(arr,low,mid,high);
		System.out.println(Arrays.toString(arr));

	}
}