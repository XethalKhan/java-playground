package demo;

import datastructure.queue.*;

public class QueueArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueArray<Integer> q = new QueueArray<>();
		q.enque(10);
		q.enque(25);
		q.enque(40);
		q.enque(75);
		System.out.println(q.toString());
		q.deque();
		q.deque();
		System.out.println(q.toString());
	}

}
