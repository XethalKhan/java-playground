package demo;

import datastructure.heap.MinHeapBinary;

public class MinHeapBinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinHeapBinary h = new MinHeapBinary();
		
		h.insert(100);
		System.out.println("Insert 100: " + h.printInorder());
		
		h.insert(50);
		System.out.println("Insert 50: " + h.printInorder());
		
		h.insert(40);
		System.out.println("Insert 40: " + h.printInorder());
		
		h.insert(200);
		System.out.println("Insert 200: " + h.printInorder());
		
		h.insert(60);
		System.out.println("Insert 60: " + h.printInorder());
		
		h.insert(30);
		System.out.println("Insert 30: " + h.printInorder());
		
		h.insert(80);
		System.out.println("Insert 80: " + h.printInorder());
		
		h.insert(150);
		System.out.println("Insert 150: " + h.printInorder());
		
		h.insert(25);
		System.out.println("Insert 25: " + h.printInorder());
	}

}
