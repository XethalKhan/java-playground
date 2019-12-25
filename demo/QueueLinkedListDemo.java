package demo;

import datastructure.queue.QueueLinkedList;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<Integer> q = new QueueLinkedList<>();
		q.enqueue(1);
		System.out.println(q.toString());
		
		q.enqueue(2);
		System.out.println(q.toString());
		
		q.dequeue();
		System.out.println(q.toString());
		
		q.enqueue(3);
		System.out.println(q.toString());
		
		q.enqueue(4);
		System.out.println(q.toString());
		
		q.dequeue();
		System.out.println(q.toString());
	}

}
