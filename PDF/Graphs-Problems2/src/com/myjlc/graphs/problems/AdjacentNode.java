package com.myjlc.graphs.problems;

public class AdjacentNode {
	int vertex;
	int weight;

	public AdjacentNode() {
	}

	public AdjacentNode(int vertex, int weight) {
		super();
		this.vertex = vertex;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "[vertex=" + vertex + ", weight=" + weight + "]";
	}

}
