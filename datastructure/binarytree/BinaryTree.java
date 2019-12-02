package datastructure.binarytree;

public class BinaryTree<TYPE> {
	
	private Node head;
	
	private class Node{
		public TYPE data;
		public Node left;
		public Node right;
		
		Node(){
			this.data = null;
			this.left = null;
			this.right = null;
		}
		
		Node(TYPE data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public BinaryTree() {
		this.head = null;
	}
	
	public BinaryTree(TYPE data) {
		this.head = new Node(data);
	}
}
