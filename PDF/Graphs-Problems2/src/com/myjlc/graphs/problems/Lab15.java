package com.myjlc.graphs.problems;

//Implement Weighted Directed Graph 

public class Lab15 {


	public static void main(String[] args) {

		MyDirectedGraph mygraph = new MyDirectedGraph(6);

		mygraph.addEdge(0, 1,2);
		mygraph.addEdge(0, 4,1);

		mygraph.addEdge(1, 2,3);
		mygraph.addEdge(4,2,2);

		mygraph.addEdge(2, 3,6);
		mygraph.addEdge(4, 5,4);
		mygraph.addEdge(5, 3,1);

		mygraph.printGraph();
		
	}
}
