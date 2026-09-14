package com.myjlc.graphs.problems;

import java.util.LinkedList;
import java.util.Queue;

//Shortest Path in Un-Weighted Graph
// Given Undirected Graphand Source Vertex
// Find Shortest Paths from given Vertex to all other Vertices
//BFS based Solution

public class Lab9 {

	public static void printShortestPaths(UndirectedGraph mygraph, int source) {

		int dist[] = new int[mygraph.vertexCount];
		Queue<Integer> myque = new LinkedList<Integer>();
		boolean visited[] = new boolean[mygraph.vertexCount];
		
		dist[source] = 0;
		visited[source] = true;
		myque.add(source);
		
		while(!myque.isEmpty()) {
			int currVertex =myque.poll(); 
			
			for(int vertex:mygraph.adjList.get(currVertex)) {
				if(visited[vertex]==false) {
					dist[vertex] = dist[currVertex] +1;
					visited[vertex] = true;
					myque.add(vertex);
				}
			}
	
		}
		
		for (int i = 0; i < dist.length; i++) {
			System.out.print(dist[i]+"\t");
		}
		
	}

	public static void main(String[] args) {

		UndirectedGraph mygraph = new UndirectedGraph(5);

		mygraph.addEdge(0, 1);
		mygraph.addEdge(0, 2);

		mygraph.addEdge(1, 2);
		mygraph.addEdge(1, 3);

		mygraph.addEdge(2, 3);
		mygraph.addEdge(2, 4);

		mygraph.addEdge(3, 4);

		printShortestPaths(mygraph,0);
		System.out.println("\n--------------");
		printShortestPaths(mygraph,1);
		System.out.println("\n--------------");
		printShortestPaths(mygraph,2);
	}
}
