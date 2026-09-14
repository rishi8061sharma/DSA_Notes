package com.myjlc.graphs.problems;

import java.util.ArrayList;
import java.util.LinkedList;

//Implement DirectedGraph using Adjacency List 

class DirectedGraph {

	int vertexCount;
	ArrayList<LinkedList<Integer>> adjList;

	public DirectedGraph(int vertexCount) {

		this.vertexCount = vertexCount;
		this.adjList = new ArrayList<LinkedList<Integer>>(vertexCount);

		for (int i = 0; i < vertexCount; i++) {
			this.adjList.add(new LinkedList<Integer>());
		}
	}

	public void addEdge(int vertex1, int vertex2) {
		adjList.get(vertex1).add(vertex2);
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

