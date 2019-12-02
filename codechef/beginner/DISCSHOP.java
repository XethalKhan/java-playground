/*
 * Link: https://www.codechef.com/problems/DISCSHOP
 */
package codechef.beginner;

public class DISCSHOP {
	public static void main(String[] args) {
		String a = "104";
		System.out.println(minPrice(a));
		//System.out.println(Integer.MAX_VALUE);
	}
	
	public static int minPrice(String price) {
		int length = price.length();
		int min = Integer.parseInt(price.substring(1, length));
		for(int i = 1; i < length - 1; i++) {
			int test = Integer.parseInt(price.substring(0, i) + price.substring(i + 1));
			if(test < min) {
				min = test;
			}
		}
		int test = Integer.parseInt(price.substring(0, length - 1));
		if(test < min) {
			min = test;
		}
		return min;
	}
}
