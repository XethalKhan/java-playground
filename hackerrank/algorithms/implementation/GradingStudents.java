/**
 * Link: https://www.hackerrank.com/challenges/grading/problem
 */
package hackerrank.algorithms.implementation;

import java.util.Arrays;

public class GradingStudents {

	public static void main(String[] args) {
		int[] gr = {73, 67, 38, 33};
		System.out.println(Arrays.toString(gradingStudents(gr)));
		gr = null;
	}

	public static int[] gradingStudents(int[] grades) {
		int size = grades.length;
		for(int i = 0; i < size; i++) {
			if(grades[i] >= 38) {
				int rem = grades[i] % 5;
				if(rem >= 3) {
					grades[i] = grades[i] + (5 - rem);
				}
			}
		}
		return grades;
	}
}
