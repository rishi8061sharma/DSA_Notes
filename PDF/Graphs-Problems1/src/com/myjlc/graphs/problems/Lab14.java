package com.myjlc.graphs.problems;

import java.util.LinkedList;
import java.util.Queue;

//Given Directed Graph
//Check whether Graph has a Cycle or Not
//BFS based Solution (Kahn's Algorithm)

public class Lab14 {

	public static boolean isCyclePresent(DirectedGraph mygraph) {

		//Step1: Find Indegrees of All the Vertices
		int indegrees[] = new int[mygraph.vertexCount];
		
		for(int i=0;i<indegrees.length;i++) {
			for(int vertex:mygraph.adjList.get(i)) {
				indegrees[vertex]++;
			}
		}
		
		//Step2: Create the Queue
		Queue<Integer> myque = new LinkedList<Integer>();

		//Step3: Add  Zero Indegree Vertices to Queue
		for(int i=0;i<indegrees.length;i++) {
			if(indegrees[i]==0)
				myque.add(i);
		}
		
		//Step4: Take the Counter
		int count=0;
		
		//Step5 : As long as Queue is Not Empty
		while(!myque.isEmpty()) {
			//5.A. Get Vertex from Queue
			int currVertex =myque.poll(); 
			
			//5B. For Every Adjacent Vertex of currVertex
			for(int vertex:mygraph.adjList.get(currVertex)) {
				//a)Reduce the Indegree of Vertex by 1 
				indegrees[vertex]--;
				//b)If Indrgee of that vertex 
				//becomes zero then add to Queue
				if(indegrees[vertex]==0)
					myque.add(vertex);
				}
			
			//5C. Increase the Count
			count++;
			}
	
			return (mygraph.vertexCount!=count);
	}

	public static void main(String[] args) {

		DirectedGraph mygraph = new DirectedGraph(5);

		mygraph.addEdge(0, 2);
		mygraph.addEdge(0, 3);

		mygraph.addEdge(1, 3);
		mygraph.addEdge(1, 4);

		mygraph.addEdge(2, 3);

		boolean flag = isCyclePresent(mygraph);
		System.out.println(flag);
		
	}
}
