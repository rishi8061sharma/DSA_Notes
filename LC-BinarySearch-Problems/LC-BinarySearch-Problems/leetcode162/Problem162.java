package com.jlcindia.leetcode162;

// 162. Find Peak Element

class Solution {
    public int findPeakElement(int[] arr) {
    	
    	int low =0;
    	int high=arr.length-1;
    	
    	while(low<high) {
    		int mid= (low+high)/2;
    		if(arr[mid]>arr[mid+1]) {
    			high=mid;
    		}else {
    			low = mid+1;
    		}
    	}
        return low;
    }
}

public class Problem162 {
		public static void main(String[] args) {
			int arr[] = {50,30,20,15,7,};
			
			Solution mysolution = new Solution();
			int result = mysolution.findPeakElement(arr);
			System.out.println(result);
			
	}
}
