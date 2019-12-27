package datastructure.binarytree;

import java.util.ArrayList;

public class BinaryTreeArray<TYPE> {
	private ArrayList<TYPE> nodes;
	
	public BinaryTreeArray() {
		this.nodes = new ArrayList<TYPE>();
	}
	
	public BinaryTreeArray(TYPE[] arr) {
		this.nodes = new ArrayList<TYPE>();
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			this.nodes.add(arr[i]);
		}
	}
	
	public String printInorder() {
		if(this.nodes.size() > 0) {
			return this.stringInorder(0);
		}
		return "Empty";
	}
	
	public String printPreorder() {
		if(this.nodes.size() > 0) {
			return this.stringPreorder(0);
		}
		return "Empty";
	}
	
	public String printPostorder() {
		if(this.nodes.size() > 0) {
			return this.stringPostorder(0);
		}
		return "Empty";
	}
	
	private String stringInorder(int pos) {
		
		return 
				((pos * 2) + 1 >= this.nodes.size() ? "" : this.stringInorder((pos * 2) + 1)) + 
				this.nodes.get(pos).toString() + 
				((pos * 2) + 2 >= this.nodes.size() ? "" : this.stringInorder((pos * 2) + 2));
	}
	
	private String stringPreorder(int pos) {
		return 
				this.nodes.get(pos).toString() +
				((pos * 2) + 1 >= this.nodes.size() ? "" : this.stringPreorder((pos * 2) + 1)) + 
				((pos * 2) + 2 >= this.nodes.size() ? "" : this.stringPreorder((pos * 2) + 2));
	}
	
	private String stringPostorder(int pos) {
		return 
				((pos * 2) + 1 >= this.nodes.size() ? "" : this.stringPostorder((pos * 2) + 1)) + 
				((pos * 2) + 2 >= this.nodes.size() ? "" : this.stringPostorder((pos * 2) + 2)) +
				this.nodes.get(pos).toString();
	}
	
	public String toString() {
		return this.nodes.toString();
	}
}
