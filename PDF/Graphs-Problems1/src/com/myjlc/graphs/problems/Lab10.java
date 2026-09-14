package com.myjlc.graphs.problems;

import java.util.LinkedList;
import java.util.Queue;

//Given Directed Acyclic Graph(DAG)
// Find Topological Ordering/Sorting of Given DAG
//BFS based Solution (Kahn's Algorithm)

public class Lab10 {

	public static void topologicalOrder(DirectedGraph mygraph) {

		int indegrees[] = new int[mygraph.vertexCount];
		
		for(int i=0;i<indegrees.length;i++) {
			for(int vertex:mygraph.adjList.get(i)) {
				indegrees[vertex]++;
			}
		}
		
		Queue<Integer> myque = new LinkedList<Integer>();

		for(int i=0;i<indegrees.length;i++) {
			if(indegrees[i]==0)
				myque.add(i);
		}

		while(!myque.isEmpty()) {
			int currVertex =myque.poll(); 
			System.out.println(currVertex);
			
			for(int vertex:mygraph.adjList.get(currVertex)) {
				indegrees[vertex]--;
				if(indegrees[vertex]==0)
					myque.add(vertex);
				}
			
			}
			
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
