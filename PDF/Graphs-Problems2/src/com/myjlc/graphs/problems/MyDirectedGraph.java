package com.myjlc.graphs.problems;

import java.util.ArrayList;
import java.util.LinkedList;

//Implement DirectedGraph using Adjacency List 

class MyDirectedGraph {

	int vertexCount;
	ArrayList<LinkedList<AdjacentNode>> adjList;

	public MyDirectedGraph(int vertexCount) {

		this.vertexCount = vertexCount;
		this.adjList = new ArrayList<LinkedList<AdjacentNode>>(vertexCount);

		for (int i = 0; i < vertexCount; i++) {
			this.adjList.add(new LinkedList<AdjacentNode>());
		}
	}

	public void addEdge(int vertex1, int vertex2,int weight) {
		AdjacentNode mynode = new AdjacentNode(vertex2,weight);
		adjList.get(vertex1).add(mynode);
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

