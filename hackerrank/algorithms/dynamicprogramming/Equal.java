/*
 * Link: https://www.hackerrank.com/challenges/equal/problem
 */
package hackerrank.algorithms.dynamicprogramming;

public class Equal {

	public static void main(String[] args) {
		int[] dt = {512, 125, 928, 381, 890, 90, 512, 789, 469, 473, 908, 990, 195, 763, 102, 643, 458, 366, 684, 857, 126, 534, 974, 875, 459, 892, 686, 373, 127, 297, 576, 991, 774, 856, 372, 664, 946, 237, 806, 767, 62, 714, 758, 258, 477, 860, 253, 287, 579, 289, 496};
		System.out.println(equal(dt));
	}

	public static int equal(int[] arr) {
		int size = arr.length;
		int steps = 0;
		
		while(completed(arr) == false) {
			int max = posMax(arr);
			int min = posMin(arr);
			
			int increment = arr[max] - arr[min];
			
			for(int i = 0; i < size; i++) {
				if(i == max) {
					continue;
				}
				arr[i] += increment;
			}
			
			if(increment >= 5 && increment != 0) {
				steps += (increment/5);
				increment %= 5;
			}
			
			if(increment >= 2 && increment != 0) {
				steps += (increment/2);
				increment %= 2;
			}
			
			if(increment >= 1 && increment != 0) {
				steps += increment;
				increment = 0;
			}
			
		}
		
		return steps;
		
	}
	
	private static int posMin(int[] arr) {
		int min = 0;
		int size = arr.length;
		for(int i = 1; i < size; i++) {
			if(arr[i] < arr[min]) {
				min = i;
			}
		}
		return min;
	}
	
	private static int posMax(int[] arr) {
		int max = 0;
		int size = arr.length;
		for(int i = 1; i < size; i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	private static boolean completed(int[] arr) {
		int size = arr.length;
		for(int i = 1; i < size; i++) {
			if(arr[i] != arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
