/*
 * Link: https://www.hackerrank.com/challenges/simple-array-sum/problem
 */

package hackerrank.algorithms.warmup;

public class SimpleArraySum {

	public static void main(String[] args) {
		int[] set1 = {1, 2, 3};
		System.out.println("Sum of [1, 2, 3] = " + simpleArraySum(set1));
		set1 = null;
		int[] set2 = {1, 2, 3, 4, 10, 11};
		System.out.println("Sum of [1, 2, 3, 4, 10, 11] = " + simpleArraySum(set2));
		set2 = null;
	}
	
	public static int simpleArraySum(int[] ar) {
		int size = ar.length;
		int sum = 0;
		for(int i = 0; i < size; i++) {
			sum += ar[i];
		}
		return sum;
	}
}
