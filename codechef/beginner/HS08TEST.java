/*
 * Link: https://www.codechef.com/problems/HS08TEST
 */
package codechef.beginner;

public class HS08TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("30, 120.00 -> " + withdraw(30, 120.00d));
		System.out.println("42, 120.00 -> " + withdraw(42, 120.00d));
		System.out.println("300, 120.00 -> " + withdraw(300, 120.00d));
	}

	public static double withdraw(int amount, double acc) {
		if(amount%5 == 0 && (amount + 0.5d) < acc) {
			return acc - amount - 0.5d;
		}
		return acc;
	}
}
