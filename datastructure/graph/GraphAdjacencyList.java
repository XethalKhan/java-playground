package datastructure.graph;

import datastructure.linkedlist.SinglyLinkedList;

public class GraphAdjacencyList<TYPE> {
	
	private class Vertice<DATA>{
		private DATA data;
		private SinglyLinkedList<DATA> adjList;
		
		public Vertice(DATA data) {
			this.data = data;
			this.adjList = new SinglyLinkedList<>();
		}
		
		public DATA getData() {
			return this.data;
		}
		
		public void addEdge(DATA v) {
			this.adjList.append(v);
		}
		
		public String toString() {
			String txt = "";
			txt += "Vertice " + this.data.toString() + ":\n";
			txt += this.adjList.toString();
			return txt;
		}
	}
	
	private Vertice<TYPE>[] v;
	
	@SuppressWarnings("unchecked")
	public GraphAdjacencyList(TYPE[] data) {
		int size = data.length;
		this.v = new Vertice[size];
		
		for(int i = 0; i < size; i++) {
			this.v[i] = new Vertice<TYPE>(data[i]);
		}
		
	}
	
	public void addEdge(int src, int dest) {
		this.v[src].addEdge(this.v[dest].getData());
	}
	
	public String toString() {
		int size = this.v.length;
		String txt = "";
		for(int i = 0; i < size; i++) {
			txt += this.v[i].toString() + "\n";
		}
		return txt;
	}
	
}
