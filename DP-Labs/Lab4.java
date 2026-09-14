package com.myjlc.dp;

//Longest Common Subsequence(LCS) of given strings
//Recursion
public class Lab4 {

	public static int lcs(String str1,String str2,int m,int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		if(str1.charAt(m-1)==str2.charAt(n-1)) {
			return 1+ lcs(str1,str2,m-1,n-1);
		}else {
			return Math.max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
		}
	}

	public static void main(String[] args) {
		
		String str1= "AXYZ";
		String str2="BAZ";
		int m= str1.length();
		int n= str2.length();
		
		int x = lcs(str1,str2,m,n);
		System.out.println(x);
		
	}
}

//Time - O(n)