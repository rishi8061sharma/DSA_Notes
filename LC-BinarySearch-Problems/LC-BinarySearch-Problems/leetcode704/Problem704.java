package com.jlcindia.leetcode704;

// 704. Binary Search

 class Solution {

	public int search(int arr[],int element) {
		
		int low=0;
		int high=arr.length-1;
	
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(element == arr[mid])
				return mid;
			else if(element > arr[mid]) 
				low = mid+1;
				else  if(element < arr[mid]) 
					high = mid-1;
		}

	return -1;
	}

}

public class Problem704 {
		public static void main(String[] args) {
			int arr[] = {10,20,30,40,50,60,70};
			int element = 25;
			
			Solution mysolution = new Solution();
			
			int result = mysolution.search(arr,element);
			System.out.println(result);
			
	}
}
