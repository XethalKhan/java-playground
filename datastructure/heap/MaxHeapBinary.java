package datastructure.heap;

import java.util.ArrayList;

/**
 * 
 * Implement Comparable<> Interface to make generic type
 *
 */
public class MaxHeapBinary {
	
	private ArrayList<Integer> nodes;
	
	public MaxHeapBinary() {
		this.nodes = new ArrayList<Integer>();
	}
	
	public void insert(Integer data) {
		this.nodes.add(data);
		
		for(int pos = this.nodes.size() - 1; pos > 0; pos = (pos - 1)/2) {
			int check = (pos - 1) / 2;
			if(this.nodes.get(pos) > this.nodes.get(check)) {
				int temp = this.nodes.get(pos);
				this.nodes.set(pos, this.nodes.get(check));
				this.nodes.set(check, temp);
			}else {
				break;
			}
		}
	}
	
	public String printInorder() {
		if(this.nodes.size() > 0) {
			return this.stringInorder(0).trim();
		}
		return "Empty";
	}
	
	private String stringInorder(int pos) {
		
		return 
				((pos * 2) + 1 >= this.nodes.size() ? " " : this.stringInorder((pos * 2) + 1)) + 
				this.nodes.get(pos).toString() + 
				((pos * 2) + 2 >= this.nodes.size() ? " " : this.stringInorder((pos * 2) + 2));
	}
}
