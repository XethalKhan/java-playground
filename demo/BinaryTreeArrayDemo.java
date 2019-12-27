package demo;

import datastructure.binarytree.BinaryTreeArray;

public class BinaryTreeArrayDemo {

	public static void main(String[] args) {
		Integer[] arr = {1, 2, 3, 4, 5};
		BinaryTreeArray<Integer> bt = new BinaryTreeArray<Integer>(arr);
		System.out.println("Inorder: " + bt.printInorder());
		System.out.println("Preorder: " + bt.printPreorder());
		System.out.println("Postorder: " + bt.printPostorder());
	}

}
