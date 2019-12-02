/*
 * Link: https://www.hackerrank.com/challenges/strong-password/problem
 * 
 * Comment: Solved using regular expressions.
 * 
 * Future tasks: Solve using string manipulation functions
 */
package hackerrank.algorithms.string;

public class StrongPassword {
	public static void main(String[] args) {
		test();
	}
	
	//Solution using regular expression
	public static int minimumNumber(String s) {
		int count = 0;
		
		if(!s.matches("(.*)(\\d+)(.*)")) {
			count++;
		}
		
		if(!s.matches("(.*)[A-Z]+(.*)")) {
			count++;
		}
		
		if(!s.matches("(.*)[a-z]+(.*)")) {
			count++;
		}
		
		if(!s.matches("(.*)[!@#$%^&*()-+]+(.*)")) {
			count++;
		}
		
		if(s.length() + count < 6) {
			count += 6 - s.length() - count;
		}
		
		return count;
	}
	
	public static void test() {
		//1 character that fits 1 criterium
		System.out.println("1 character that fits 1 criterium");
		System.out.println("a -> " + minimumNumber("a"));
		System.out.println("B -> " + minimumNumber("B"));
		System.out.println("3 -> " + minimumNumber("3"));
		System.out.println("# -> " + minimumNumber("#"));
		
		//2 characters that satisfy 2 criteriums
		System.out.println("2 characters that satisfy 2 criteriums");
		System.out.println("yD -> " + minimumNumber("yD"));
		System.out.println("C8 -> " + minimumNumber("C8"));
		System.out.println("9! -> " + minimumNumber("9!"));
		System.out.println("@q -> " + minimumNumber("@q"));
		
		//3 characters that satisfy 3 criteriums
		System.out.println("3 characters that satisfy 3 criteriums");
		System.out.println("Cu8 -> " + minimumNumber("Cu8"));
		System.out.println("7!W -> " + minimumNumber("7!W"));
		System.out.println("z6+ -> " + minimumNumber("z6+"));
		System.out.println("-Ge -> " + minimumNumber("-Ge"));
		
		//4 characters that satisfy 4 criteriums
		System.out.println("4 characters that satisfy 4 criteriums");
		System.out.println("Oi5^ -> " + minimumNumber("Oi5^"));
		
		//5 characters that satisfy 4 criteriums
		System.out.println("5 characters that satisfy 4 criteriums");
		System.out.println("nV72$ -> " + minimumNumber("nV72$"));
		
		//2 characters that satisfy 1 criterium
		System.out.println("2 characters that satisfy 1 criterium");
		System.out.println("!! -> " + minimumNumber("!!"));
		
		//3 characters that satisfy 1 criterium
		System.out.println("3 characters that satisfy 1 criterium");
		System.out.println("XZY -> " + minimumNumber("XZY"));
		
		//4 characters that satisfy 1 criterium
		System.out.println("4 characters that satisfy 1 criterium");
		System.out.println("9876 -> " + minimumNumber("9876"));
		
		//5 characters that satisfy 1 criterium
		System.out.println("5 characters that satisfy 1 criterium");
		System.out.println("aaaaa -> " + minimumNumber("aaaaa"));
	}
}
