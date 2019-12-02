package datastructure.queue;

public class QueueArray<TYPE> {
	int front;
	int rear;
	int size;
	int capacity;
	TYPE array[];
	
	@SuppressWarnings("unchecked")
	public QueueArray(int capacity) {
		this.capacity = capacity;
		this.front = 0;
		this.size = 0;
		this.rear = this.capacity - 1;
		this.array = (TYPE[]) new Object[capacity];
	}
	
	public QueueArray() {
		this(1000);
	}
	
	public boolean isFull() {
		return (this.size == this.capacity);
	}
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public TYPE deque() {
		if(this.isEmpty()) {
			return null;
		}
		
		TYPE item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		
		return item;
	}
	
	public boolean enque(TYPE data) {
		if(this.isFull()) {
			return false;
		}
		
		this.rear = (this.rear + 1) % 3;
		this.array[this.rear] = data;
		this.size--;
		
		return true;
	}
	
	public TYPE front() {
		if(this.isEmpty()) {
			return null;
		}
		return this.array[this.front];
	}
	
	public TYPE rear() {
		if(this.isEmpty()) {
			return null;
		}
		return this.array[this.rear];
	}
}
