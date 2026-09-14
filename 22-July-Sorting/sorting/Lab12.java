package com.jlcindia.sorting;

import java.util.Arrays;

//Optimized BubbleSort

public class Lab12 {

	public static void bubbleSort(int arr[]) {
		
		int n= arr.length; 
	
		
		for(int i=0;i<n;i++) { 
			boolean swaped=false;
			
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swaped=true;
				}
			}
			
			if(swaped==false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,9,15,-8,-20,7,10};
		
		System.out.println(Arrays.toString(arr)); 
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr)); 
		
	}
}
