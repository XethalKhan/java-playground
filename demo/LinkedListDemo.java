package demo;

import datastructure.linkedlist.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList<Object> ll = new SinglyLinkedList<Object>();
		ll.prepend(321);
		ll.prepend("XYZ");
		System.out.print(ll);
		System.out.print("------------------------------\n");
		ll.append(123);
		System.out.print(ll);
		System.out.print("------------------------------\n");
		ll.prepend("CROMICON");
		System.out.print(ll);
		System.out.print("------------------------------\n");
		Object i = ll.get(3);
		System.out.print(i.toString());
	}
	
}
