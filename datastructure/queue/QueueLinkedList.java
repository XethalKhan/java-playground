package datastructure.queue;

public class QueueLinkedList<TYPE> {

	class Node<DATA> {
		public DATA data;
		public Node<DATA> next;
		
		public Node(DATA data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node<TYPE> front;
	private Node<TYPE> rear;
	
	public QueueLinkedList() {
		this.front = null;
		this.rear = this.front;
	}
	
	public QueueLinkedList(TYPE data) {
		this.front = new Node<TYPE>(data);
		this.rear = this.front;
	}
	
	public void enqueue(TYPE data) {
		Node<TYPE> tmp = new Node<TYPE>(data);
		
		if(this.rear == null) {
			this.front = tmp;
			this.rear = tmp;
			return;
		}
		
		this.rear.next = tmp;
		this.rear = tmp;
	}
	
	public TYPE dequeue() {
		
		if(this.front == null) {
			return null;
		}
		
		Node<TYPE> tmp = this.front;
		this.front = this.front.next;
		tmp.next = null;
		
		if(this.front == null) {
			this.rear = null;
			return null;
		}
		
		return tmp.data;
		
	}
	
	public String toString() {
		String txt = "";
		
		if(this.front == null) {
			return txt;
		}
		
		Node<TYPE> tmp = this.front;
		while(tmp != null) {
			txt += tmp.data.toString() + " ";
			tmp = tmp.next;
		}
		
		return txt;
	}
	
}
