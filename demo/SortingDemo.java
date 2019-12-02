package demo;

import java.util.Arrays;

import algorithms.sort.*;

public class SortingDemo {
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[10];
		for(int i = 0; i <10; i++) {
			arr[i] = (int)(Math.random() * 50 + 1);
		}
		
		System.out.println("Before: " + Arrays.toString(arr));
		
		IntArray.insertionSort(arr);
		
		System.out.println("After: " + Arrays.toString(arr));
	}
}
