package datastructure.binarytree;

import datastructure.queue.*;

public class BinaryTreeDynamic<TYPE> {
	
	private Node head;
	
	private class Node{
		public TYPE data;
		public Node left;
		public Node right;
		
		public boolean compare(TYPE data) {
			if(this.data != null && this.data == data) {
				return true;
			}
			return false;
		}
		
		public boolean isLeft(Node n) {
			if(this.left == n) {
				return true;
			}
			return false;
		}
		
		public boolean isRight(Node n) {
			if(this.right == n) {
				return true;
			}
			return false;
		}
		
		Node(TYPE data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		Node(Node n){
			this.data = n.data;
			this.left = null;
			this.right = null;
		}
		
		public String toString() {
			return this.data.toString();
		}
	}
	
	public BinaryTreeDynamic() {
		this.head = null;
	}
	
	public BinaryTreeDynamic(TYPE data) {
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
	
	private Node search(TYPE data) {
		if(this.head == null) {
			return null;
		}
		
		QueueArray<Node> q = new QueueArray<>();
		q.enque(this.head);
		
		while(!q.isEmpty()) {
			Node ref = q.deque();
			if(ref.compare(data)) {
				return ref;
			}

			if(ref.left != null) {
				q.enque(ref.left);
			}
			
			if(ref.right != null) {
				q.enque(ref.right);
			}
		}
		
		return null;
	}
	
	private Node getParent(TYPE data) {
		if(this.head == null) {
			return null;
		}
		
		if(this.head.compare(data)) {
			return this.head;
		}
		
		QueueArray<Node> q = new QueueArray<>();
		q.enque(this.head);
		
		while(!q.isEmpty()) {
			Node ref = q.deque();
			if((ref.left != null && ref.left.compare(data)) || (ref.right != null && ref.right.compare(data))) {
				return ref;
			}

			if(ref.left != null) {
				q.enque(ref.left);
			}
			
			if(ref.right != null) {
				q.enque(ref.right);
			}
		}
		
		return null;
	}
	
	private Node getDeepest() {
		if(this.head == null) {
			return null;
		}
		
		if(this.head.left == null) {
			return this.head;
		}
		
		if(this.head.right == null) {
			return this.head.left;
		}
		
		QueueArray<Node> q = new QueueArray<>();
		q.enque(this.head.left);
		q.enque(this.head.right);
		
		while(!q.isEmpty()) {
			Node ref = q.deque();
			
			if(ref.left == null) {
				break;
			}else {
				q.enque(ref.left);
			}
			
			if(ref.right == null) {
				break;
			}else {
				q.enque(ref.right);
			}
		}
		
		return q.rear();
	}
	
	public String printDeepest() {
		return this.getDeepest().data.toString();
	}
	
	public boolean delete(TYPE data) {
		Node replace = this.getDeepest();
		Node ref = this.getParent(replace.data);
		
		Node searched = this.search(data);
		
		if(replace == this.head) {
			this.head = null;
			return true;
		}
		
		if(searched == null) {
			return false;
		}
		
		if(replace == searched) {
			if(ref.isLeft(replace)) {
				ref.left = null;
				return true;
			}
			
			if(ref.isRight(replace)) {
				ref.right = null;
				return true;
			}
		}
		
		if(ref.isLeft(replace)) {
			ref.left = null;
		}
		
		if(ref.isRight(replace)) {
			ref.right = null;
		}
		
		Node insert = new Node(replace);
		
		replace.left = null;
		replace.right = null;

		Node parent = this.getParent(data);
		
		insert.left = searched.left;
		insert.right = searched.right;
		
		searched.left = null;
		searched.right = null;
		
		if(searched == this.head) {
			this.head = insert;
		}else {
			if(parent.isLeft(searched)) {
				parent.left = insert;
			}
			
			if(parent.isRight(searched)) {
				parent.right = insert;
			}
		}
		
		return true;
	}
}
