package com.myjlc.dp;

//DP - Memoization 
//Top-Down Approach
public class Lab2 {
	
	static int memo[] = { -1, -1, -1, -1, -1, -1 };

	public static int fib(int n) {
		if(memo[n]==-1) {
			if (n == 0 || n == 1)
				memo[n]=n;
			else
				memo[n]= fib(n - 1) + fib(n - 2);
		}
		return memo[n];
	
	}

	public static void main(String[] args) {
		System.out.println(fib(5));
	}
}

//Time - O(n)