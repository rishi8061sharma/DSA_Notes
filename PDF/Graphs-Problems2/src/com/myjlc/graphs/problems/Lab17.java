package com.myjlc.graphs.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Given Directed Acyclic Graph(DAG) and Weighted Graph
//Given Source Vertex
//Find the Shotest Path from Source Vertex to all other Vertices 

public class Lab17 {

	public static ArrayList<Integer> topologicalOrder(MyDirectedGraph mygraph) {

		ArrayList<Integer> topOrder = new ArrayList<Integer>(mygraph.vertexCount);

		// Step1: Find Indegrees of All Vertices
		int indegrees[] = new int[mygraph.vertexCount];

		for (int i = 0; i < indegrees.length; i++) {
			for (AdjacentNode mynode : mygraph.adjList.get(i)) {
				indegrees[mynode.vertex]++;
			}
		}

		// Step2: Create Queue
		Queue<Integer> myque = new LinkedList<Integer>();

		// Step3: Add Zero-Indegree Vertices to Queue
		for (int i = 0; i < indegrees.length; i++) {
			if (indegrees[i] == 0)
				myque.add(i);
		}

		// 4.When Queue is Not Empty
		while (!myque.isEmpty()) {

			// 4A. Get Vertex from Queue
			int currVertex = myque.poll();
			topOrder.add(currVertex);

			// 4B. For each Adjacent Vertex
			for (AdjacentNode mynode : mygraph.adjList.get(currVertex)) {
				// a)Reduce the Indegree of Vertex by 1
				indegrees[mynode.vertex]--;
				// b)If Indrgee of that vertex
				// becomes zero then add to Queue
				if (indegrees[mynode.vertex] == 0)
					myque.add(mynode.vertex);
			}

		}
		return topOrder;
	}

	public static int[] shortestPaths(MyDirectedGraph mygraph, int sourceVertex) {

		// Step1: Define Distance Array with Max
		int[] dist = new int[mygraph.vertexCount];

		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		// Step2: Initialize Source Dist to Zero
		dist[sourceVertex] = 0;

		// Step3: Find Topological Order of Graph
		ArrayList<Integer> topOrder = topologicalOrder(mygraph);
		System.out.println(topOrder);

		// Step4: For each Vertex in Topological Order
		for (int currVertex : topOrder) {

			// 4A. For each Adjacent Vertex
			for (AdjacentNode mynode : mygraph.adjList.get(currVertex)) {
				int adjVertex = mynode.vertex;
				int weight = mynode.weight;
				if (dist[adjVertex] > dist[currVertex] + weight) {
					dist[adjVertex] = dist[currVertex] + weight;
				}
			}

		}
		return dist;

	}

	public static void main(String[] args) {

		MyDirectedGraph mygraph = new MyDirectedGraph(6);

		mygraph.addEdge(0, 1, 2);
		mygraph.addEdge(0, 4, 1);

		mygraph.addEdge(1, 2, 3);
		mygraph.addEdge(4, 2, 2);

		mygraph.addEdge(2, 3, 6);
		mygraph.addEdge(4, 5, 4);
		mygraph.addEdge(5, 3, 1);

		mygraph.printGraph();
		int[] dist = shortestPaths(mygraph, 0);
		for (int i = 0; i < dist.length; i++)
			System.out.println(dist[i]);

	}
}
