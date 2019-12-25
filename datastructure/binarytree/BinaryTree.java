package datastructure.binarytree;

import datastructure.queue.*;

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
	
	public String stringInorder(Node n) {
		if(n == null) {
			return "";
		}
		return this.stringInorder(n.left) + " " + n.data.toString() + " " + this.stringInorder(n.right);
		
	}
	
	public String printInorder() {
		return this.stringInorder(head);
	}
	
	public String stringPreorder(Node n) {
		if(n == null) {
			return "";
		}
		return n.data.toString() + " " + this.stringPreorder(n.left) + this.stringPreorder(n.right);
		
	}
	
	public String printPostorder() {
		return this.stringPostorder(head);
	}
	
	public String stringPostorder(Node n) {
		if(n == null) {
			return "";
		}
		return this.stringPostorder(n.left) + this.stringPostorder(n.right) + " " + n.data.toString();
		
	}
	
	public String printPreorder() {
		return this.stringPreorder(head);
	}
	
	public void insert(TYPE data){
		QueueArray<Node> q = new QueueArray<>();
		q.enque(this.head);
		
		while(!q.isEmpty()) {
			Node temp = q.front();
			q.deque();
			
			if(temp.left == null) {
				temp.left = new Node(data);
				break;
			}else {
				q.enque(temp.left);
			}
			
			if(temp.right == null) {
				temp.right = new Node(data);
				break;
			}else {
				q.enque(temp.right);
			}
		}
	}
}
