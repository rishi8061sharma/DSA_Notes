package com.jlcindia.leetcode33;

//33. Search in Rotated Sorted Array

 class Solution {
	public int search(int arr[],int element) {
		
		int low=0;
		int high=arr.length-1;
	
		while(low<=high) {
			int mid = (low+high)/2;
			
			//When Match Found
			if(element == arr[mid])
				return mid;
			
			//A. First Part Sorted
			else if(arr[low] <= arr[mid]) {
				
				if(element >= arr[low] && element <arr[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
			} 
			//B. Second Part Sorted
			else if(element>arr[mid] && element<=arr[high]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
				
		}

	return -1;
	}

}

public class Problem33 {
		public static void main(String[] args) {
			int arr[] = {30,40,50,60,10,20};
			int element = 30;
			
			Solution mysolution = new Solution();
			
			int result = mysolution.search(arr,element);
			System.out.println(result);
			
	}
}
