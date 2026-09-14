package com.jlcindia.leetcode34;

// 34. Find the First and Last Position of Element in Sorted Array

 class Solution {

		private int firstOccurence(int arr[], int element) {

			int low = 0;
			int high = arr.length - 1;

			while (low <= high) {
				int mid = (low + high) / 2;

				if (element > arr[mid])
					low = mid + 1;
				else if (element < arr[mid])
					high = mid - 1;
				else if (element == arr[mid]) {
					if (mid == 0 || arr[mid - 1] != arr[mid])
						return mid;
					else {
						high = mid - 1;
					}
				}
			}

			return -1;
		}

		private  int lastOccurence(int arr[], int element) {

			int low = 0;
			int high = arr.length - 1;

			while (low <= high) {
				int mid = (low + high) / 2;

				if (element > arr[mid])
					low = mid + 1;
				else if (element < arr[mid])
					high = mid - 1;
				else if (element == arr[mid]) {
					if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
						return mid;
					else {
						low = mid + 1;
					}
				}
			}

			return -1;
		}

		public  int[] searchRange(int arr[], int element) {
			
			int first = firstOccurence(arr, element);
			
			if (first == -1)
				return new int[] {-1,-1};

			int last = lastOccurence(arr, element);
			return new int[] {first,last};
		}

}

public class Problem34 {
		public static void main(String[] args) {

			int arr[] = { 10, 20, 20, 20,30, 30, 30, 50 };
			int element = 10;

			Solution mysolution = new Solution();
			int range[] = mysolution.searchRange(arr,element);
			System.out.println(range[0]+"\t"+range[1]);
			
	}
}
