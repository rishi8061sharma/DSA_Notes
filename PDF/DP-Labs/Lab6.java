package com.myjlc.dp;

//Longest Common Subsequence(LCS) of given strings
//Tabulation - DP
public class Lab6 {
	
	static int table[][];

	public static int lcs(String str1, String str2, int m, int n) {

			for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					table[i][j] =  1 + table[i-1][j-1];
				} else {
					table[i][j] =  Math.max(
												table[i-1][j],
												table[i][j-1]);
				}
			}
		}
			
		return table[m][n];
	}

	public static void main(String[] args) {

		String str1 = "AXYZ";
		String str2 = "BAZ";
		int m = str1.length();
		int n = str2.length();

		table = new int[m+1][n+1];
	
		int x = lcs(str1, str2, m, n);
		System.out.println(x);

	}
}

//Time - O(n)