/*
 * Link: https://www.hackerrank.com/challenges/arrays-ds/problem
 */

package hackerrank.datastructure.arrays;

public class ArrayDS {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 3, 2};
		
		for(int i = arr.length - 1; i > 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[0]);
		
	}
}
