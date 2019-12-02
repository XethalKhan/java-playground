/*
 * Link: https://www.codechef.com/problems/CONFLIP
 */
package codechef.easy;

public class CONFLIP {

	public static void main(String[] args) {
		System.out.print(coinFlip(1, 5, 1));
	}

	public static int coinFlip(int I, int N, int Q) {
		if(N%2 == 0 || I == Q) {
			return N/2;
		}else {
			return N/2 + 1;
		}
	}
}
