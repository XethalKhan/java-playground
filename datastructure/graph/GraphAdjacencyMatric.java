package datastructure.graph;

public class GraphAdjacencyMatric<TYPE> {
	
	public boolean[][] matrix;
	public TYPE[] vertices;
	
	@SuppressWarnings("unchecked")
	public GraphAdjacencyMatric(int num) {
		this.matrix = new boolean [num][num];
		this.vertices = (TYPE[])new Object[num];
	}
	
	public GraphAdjacencyMatric(TYPE[] vertices) {
		int size = vertices.length;
		this.matrix = new boolean [size][size];
		this.vertices = vertices;
	}
	
	public void addEdge(int src, int dest) {
		this.matrix[src][dest] = true;
	}
	
	public void removeEdge(int src, int dest) {
		this.matrix[src][dest] = false;
	}
	
	public String toString() {
		String txt = "";
		int size = this.vertices.length;
		for(int i = 0; i < size; i++) {
			if(this.vertices[i] != null) {
				txt += "Adjacency table for vertice " + this.vertices[i].toString() + ":";
				for(int j = 0; j < size; j++) {
					if(this.matrix[i][j] == true) {
						txt += " " + this.vertices[j].toString();
					}
				}
			}
			txt += "\n";
		}
		return txt;
	}
}
