package com.myjlc.disjointset.lab3;

public class MyDisjointSet {

	int parent[];
	int rank[];

	MyDisjointSet(int n) {
		parent = new int[n];
		rank = new int[n];

		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	// Path Compression
	int find(int x) {
		if (parent[x] == x)
			return x;

		parent[x] = find(parent[x]);
		return parent[x];
	}

	// Union by Rank
	// Time - O(Alfa(n)) ( with Path Compression)
	//Alfa(n) <=4
	void union(int x, int y) {
		int x_rep = find(x);
		int y_rep = find(y);
		if (x_rep == y_rep)
			return;

		if (rank[x_rep] < rank[y_rep]) {
			parent[x_rep] = y_rep;
		} else if (rank[y_rep] < rank[x_rep]) {
			parent[y_rep] = x_rep;
		} else {
			parent[y_rep] = x_rep;
			rank[x_rep]++;
		}

	}
}
