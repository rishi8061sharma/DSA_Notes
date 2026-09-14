package com.jlcindia.leetcode69;

// 69.sqrt(num)

 class Solution {

		public int mySqrt(int num) {

			if(num<2) {
				return num;
			}
				
			int low=2;
			int high=num/2;
			long result=0;
			while(low<=high) {
				int mid = low + (high-low)/2;
				result = (long) mid * mid;
				
				if(result==num) {
					return mid;
				}else if(result>num) {
					high=mid-1;
				}else if(result<num) {
					low = mid+1;
				}
				
			}
			return high;
		}
}

public class Problem69 {
		public static void main(String[] args) {

			Solution mysolution = new Solution();
			int result = mysolution.mySqrt(6);
			System.out.println(result);
			
	}
}
