/*
 * Link: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
package hackerrank.datastructure.linkedlist;

public class PrintLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.prepend(16);
		ll.prepend(13);
		System.out.println(ll);
		System.out.println("-------------------");
		System.out.println(ll.printReverse());
	}

}
