package datastructure.graph;

public class GraphAdjacencyMatric<TYPE> {
	
	public boolean[][] matrix;
	public TYPE[] data;
	
	@SuppressWarnings("unchecked")
	public GraphAdjacencyMatric(int num) {
		this.matrix = new boolean [num][num];
		this.data = (TYPE[])new Object[num];
	}
	
	public GraphAdjacencyMatric(TYPE[] data) {
		int size = data.length;
		this.matrix = new boolean [size][size];
		this.data = data;
	}
	
	public void addEdge(int src, int dest) {
		this.matrix[src][dest] = true;
	}
	
	public void removeEdge(int src, int dest) {
		this.matrix[src][dest] = false;
	}
	
	public String toString() {
		String txt = "";
		int size = this.data.length;
		for(int i = 0; i < size; i++) {
			if(this.data[i] != null) {
				txt += "Adjacency table for vertice " + this.data[i].toString() + ":";
				for(int j = 0; j < size; j++) {
					if(this.matrix[i][j] == true) {
						txt += " " + this.data[j].toString();
					}
				}
			}
			txt += "\n";
		}
		return txt;
	}
}
