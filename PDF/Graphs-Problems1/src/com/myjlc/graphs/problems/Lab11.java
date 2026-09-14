package com.myjlc.graphs.problems;

import java.util.Stack;

//Given Directed Acyclic Graph(DAG)
// Find Topological Ordering/Sorting of Given DAG
//DFS based Solution 

public class Lab11 {

	public static void topologicalOrder(DirectedGraph mygraph) {

		boolean visited[] = new boolean[mygraph.vertexCount];
		Stack<Integer> mystack = new Stack<Integer>();

		for (int i = 0; i < mygraph.vertexCount; i++) {
			if (!visited[i]) {
				dfs(mygraph, mystack, visited, i);
			}
		}

		while(!mystack.isEmpty()) {
			System.out.println(mystack.pop());
		}
	}

	public static void dfs(DirectedGraph mygraph, Stack<Integer> mystack, boolean visited[], int currVertex) {
		
		visited[currVertex] = true;
		
		for(int vertex: mygraph.adjList.get(currVertex)) {
			if(!visited[vertex])
				dfs(mygraph, mystack, visited,vertex);
		}
		mystack.push(currVertex);
	}

	public static void main(String[] args) {

		DirectedGraph mygraph = new DirectedGraph(5);

		mygraph.addEdge(0, 2);
		mygraph.addEdge(0, 3);

		mygraph.addEdge(1, 3);
		mygraph.addEdge(1, 4);

		mygraph.addEdge(2, 3);

		topologicalOrder(mygraph);

	}
}
