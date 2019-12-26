package demo;

import datastructure.binarytree.BinaryTree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		/*
		BinaryTreeDemo.inorderExample();
		BinaryTreeDemo.preorderExample();
		BinaryTreeDemo.postorderExample();
		*/
		
		BinaryTreeDemo.deleteExample();
		
	}

	public static void inorderExample(){
		System.out.println("Inorder demo");
		BinaryTree<Integer> bt = new BinaryTree<Integer>(1);
		System.out.println(bt.printInorder());
	
		bt.insert(2);
		System.out.println(bt.printInorder());
		
		bt.insert(3);
		System.out.println(bt.printInorder());
		
		bt.insert(4);
		System.out.println(bt.printInorder());
		
		bt.insert(5);
		System.out.println(bt.printInorder());
	}
	
	public static void preorderExample() {
		System.out.println("Preorder demo");
		BinaryTree<Integer> bt = new BinaryTree<Integer>(1);
		System.out.println(bt.printPreorder());
	
		bt.insert(2);
		System.out.println(bt.printPreorder());
		
		bt.insert(3);
		System.out.println(bt.printPreorder());
		
		bt.insert(4);
		System.out.println(bt.printPreorder());
		
		bt.insert(5);
		System.out.println(bt.printPreorder());
	}
	
	public static void postorderExample() {
		System.out.println("Postorder demo");
		BinaryTree<Integer> bt = new BinaryTree<Integer>(1);
		System.out.println(bt.printPostorder());
	
		bt.insert(2);
		System.out.println(bt.printPostorder());
		
		bt.insert(3);
		System.out.println(bt.printPostorder());
		
		bt.insert(4);
		System.out.println(bt.printPostorder());
		
		bt.insert(5);
		System.out.println(bt.printPostorder());
	}
	
	public static void deleteExample(){
		System.out.println("Delete demo");
		BinaryTree<Integer> bt = new BinaryTree<Integer>(1);
	
		bt.insert(2);
		
		bt.insert(3);
		
		bt.insert(4);
		
		bt.insert(5);
		System.out.println(bt.printInorder());
		
		bt.delete(1);
		System.out.println(bt.printInorder());
		
		//System.out.println(bt.printDeepest());
	}
}
