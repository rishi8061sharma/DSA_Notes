package com.myjlc.graphs.problems;

import java.util.ArrayList;

//Implement UndirectedGraph  using Adjacency List 

class UndirectedGraph {

	int vertexCount;
	ArrayList<ArrayList<Integer>> adjList;

	public UndirectedGraph(int vertexCount) {

		this.vertexCount = vertexCount;
		this.adjList = new ArrayList<ArrayList<Integer>>(vertexCount);

		for (int i = 0; i < vertexCount; i++) {
			this.adjList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int vertex1, int vertex2) { 
		adjList.get(vertex1).add(vertex2);
		adjList.get(vertex2).add(vertex1);
	}

	public void printGraph() {
		for (int i = 0; i < vertexCount; i++) {
			System.out.print("Vertex : " + i + "=> \t");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				System.out.print(adjList.get(i).get(j) + "\t");
			}
			System.out.println("");
		}

	}
}


