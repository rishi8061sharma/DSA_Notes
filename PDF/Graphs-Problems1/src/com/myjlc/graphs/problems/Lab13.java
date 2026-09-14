package com.myjlc.graphs.problems;

//Given Directed Graph
//Check whether Graph has a Cycle or Not
//DFS based Solution 

public class Lab13 {

	public static boolean isCyclePresent(DirectedGraph mygraph) {

		boolean visited[] = new boolean[mygraph.vertexCount];
		boolean callStack[] = new boolean[mygraph.vertexCount];
		
		for (int i = 0; i < mygraph.vertexCount; i++) {
			if (!visited[i]) {
				if(dfs(mygraph, i, visited,callStack))
					return true;
			}
		}
	

		return false;
	}

	public static boolean dfs(DirectedGraph mygraph,int currVertex,boolean visited[], boolean callStack[]) {
		
		visited[currVertex] = true;
		callStack[currVertex] = true;
		
		for(int vertex: mygraph.adjList.get(currVertex)) {
			if(!visited[vertex]) {
				if(dfs(mygraph, vertex, visited,callStack))
					return true;
			}else  if(callStack[vertex]==true){
				return true;
			}
		}
		callStack[currVertex] = false;
		return false;
	}

	public static void main(String[] args) {

		DirectedGraph mygraph = new DirectedGraph(6);

		mygraph.addEdge(0, 1);
		mygraph.addEdge(2, 1);
		mygraph.addEdge(2, 3);
		mygraph.addEdge(3, 4);
		mygraph.addEdge(4, 5);
		//mygraph.addEdge(5, 3);

		boolean flag = isCyclePresent(mygraph);
		System.out.println(flag);

	}
}
