package com.myjlc.dp;

//Coin Change Problem
//Recursion
public class Lab7 {

	public static int coinCount(int coins[],int n,int sum) {
		
		if(sum==0) {
			return 1;
		}
		
		if(sum<0 || n==0) {
			return 0;
		}
		
		int include = coinCount(coins,n,sum-coins[n-1]);
		int exclude = coinCount(coins,n-1,sum);
		return include+exclude;
	}

	public static void main(String[] args) {
		
	int coins[] = {1,2,3};
	int n=3;
	int sum = 6;
		
		int count = coinCount(coins,n,sum);
		System.out.println(count);
		
	}
}

//Time - O(n)