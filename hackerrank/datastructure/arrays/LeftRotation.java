/*
 * Link: https://www.hackerrank.com/challenges/array-left-rotation/problem
 */

package hackerrank.datastructure.arrays;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		leftRotate(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

	public static int GCDrecursive(int a, int b) {
	   if (b==0) return a;
	   return GCDrecursive(b,a%b);
	}
	
	public static void leftRotate(int[] arr, int d) {
		int gcd = GCDrecursive(arr.length, d);
		int size = arr.length;
		for(int i = 0; i < gcd; i++) {
			int temp = arr[i];
			int j = i;
			while (true) { 
                int k = j + d; 
                if (k >= size) 
                    k = k - size; 
                if (k == i) 
                    break; 
                arr[j] = arr[k]; 
                j = k; 
            } 
            arr[j] = temp; 
		}
	}
	
}
