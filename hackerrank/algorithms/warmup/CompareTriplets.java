/*
 * Link: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

package hackerrank.algorithms.warmup;

import java.util.Arrays;

public class CompareTriplets {

	public static void main(String[] args) {
		int[] Alice = {5, 6, 7};
		int[] Bob = {3, 6, 10};
		System.out.println("Alice = " + Arrays.toString(Alice));
		System.out.println("Bob = " + Arrays.toString(Bob));
		System.out.println("Result = " + Arrays.toString(compareTriplets(Alice, Bob)));
		
		int[] Alice1 = {17, 28, 30};
		int[] Bob1 = {99, 16, 8};
		System.out.println("\n\nAlice = " + Arrays.toString(Alice1));
		System.out.println("Bob = " + Arrays.toString(Bob1));
		System.out.println("Result = " + Arrays.toString(compareTriplets(Alice1, Bob1)));
	}

	public static int[] compareTriplets(int[] a, int[] b) {
		int[] result = {0, 0};
		int size = a.length;
		for(int i = 0; i < size; i++) {
			if(a[i] > b[i]) {
				result[0] += 1;
			}
			else if(b[i] > a[i]) {
				result[1] += 1;
			}
		}
		return result;
	}
}
