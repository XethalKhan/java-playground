package demo;

import datastructure.stack.*;

public class StackDemo {

	public static void main(String args[]) 
    { 
		System.out.println("Stack implemented with array");
        StackArray<Object> sa = new StackArray<Object>();
        sa.push(10.34f);  
        sa.push(987);
        sa.push("ABC");
        System.out.println(sa.toString());
        System.out.println(sa.pop() + " Popped from stack\n");
        System.out.println(sa.toString());
        
        System.out.println("------------------------------------------------------");
        
        System.out.println("Stack implemented with linked list");
        StackLinkedList<Object> sll = new StackLinkedList<Object>();
        sll.push(10.34f);  
        sll.push(987);
        sll.push("ABC");
        System.out.println(sll.toString());
        System.out.println(sll.pop() + " Popped from stack\n");
        System.out.println(sll.toString());
    }
}
