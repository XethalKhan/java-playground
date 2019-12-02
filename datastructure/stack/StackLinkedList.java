package datastructure.stack;

import datastructure.linkedlist.SinglyLinkedList;

public class StackLinkedList<TYPE> {
	private int size;
	private int cap;
	private SinglyLinkedList<TYPE> data;
	
	public StackLinkedList() {
		this(1000);
	}
	
	public StackLinkedList(int size) {
		this.data = new SinglyLinkedList<TYPE>();
		this.cap = size;
		this.size = 0;
	}
	
	public boolean isEmpty(){
		return (this.size == 0);
	}
	
	public boolean push(TYPE x) {
		if(this.size == this.cap) {
			return false;
		}

		this.size++;
		this.data.append(x);
		return true;
	}
	
	public TYPE pop() {
		if(this.size < 1) {
			return null;
		}
		
		this.size--;
		TYPE res = this.data.get(0);
		this.data.delete(0);
		return res;
	}
	
	public TYPE peek() {
		if(this.size == 0) {
			return null;
		}
		
		return this.data.get(0);
	}
	
	public String toString() {
		String txt = "";
		for(int i = 0; i < size; i++) {
			txt += this.data.get(i).toString() + "\n";
		}
		return txt;
	}
}
