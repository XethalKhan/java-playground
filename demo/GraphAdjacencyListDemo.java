package demo;

import datastructure.graph.GraphAdjacencyList;

public class GraphAdjacencyListDemo {

	public static void main(String[] args) {
		Integer[] v = {0, 1, 2, 3, 4};
		GraphAdjacencyList<Integer> graph = new GraphAdjacencyList<Integer>(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		
		System.out.println(graph.toString());
	}

}
