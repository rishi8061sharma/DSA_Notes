package com.myjlc.graphs.problems;

//Given UnDirected Graph
//Check whether Graph has a Cycle or Not
//DFS based Solution 

public class Lab12 {

	public static boolean isCyclePresent(UndirectedGraph mygraph) {

		boolean visited[] = new boolean[mygraph.vertexCount];

		for (int i = 0; i < mygraph.vertexCount; i++) {
			if (!visited[i]) {
				if(dfs(mygraph, visited, i,-1)==true)
					return true;
			}
		}
		return false;
	}

	public static boolean dfs(UndirectedGraph mygraph,boolean visited[], int currVertex,int parent) {
		
		visited[currVertex] = true;
		
		for(int vertex: mygraph.adjList.get(currVertex)) {
			if(!visited[vertex]) {
				if(dfs(mygraph, visited,vertex,currVertex)==true)
					return true;
			}else  if(vertex!=parent){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		UndirectedGraph mygraph = new UndirectedGraph(5);

		mygraph.addEdge(0, 1);
		mygraph.addEdge(1, 2);
		mygraph.addEdge(1, 3);
		mygraph.addEdge(2, 3);
		mygraph.addEdge(2, 4);

		boolean flag = isCyclePresent(mygraph);
		System.out.println(flag);

	}
}
