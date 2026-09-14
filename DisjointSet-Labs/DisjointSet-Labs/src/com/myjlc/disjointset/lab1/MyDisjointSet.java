package com.myjlc.disjointset.lab1;

public class MyDisjointSet {

	int parent[];

	MyDisjointSet(int n) {
		parent = new int[n];

		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	//0(n)
	int find(int x) {
		if (parent[x] == x)
			return x;
		else
			return find(parent[x]);
	}

	//0(n)
	void union(int x,int y) {
		int xparent = find(x);
		int yparent = find(y);
		if(xparent==yparent)
			return ;
		
		parent[yparent] = xparent;
		
	}
}
