/*
 * Link: https://www.hackerrank.com/challenges/reduced-string/problem
 */
package hackerrank.algorithms.string;

public class SuperReducedString {

	public static void main(String[] args) {
		System.out.println("aa -> " + superReducedString("aa"));
		System.out.println("baab -> " + superReducedString("baab"));
		System.out.println("aaabccddd -> " + superReducedString("aaabccddd"));
	}
	
	
	public static String superReducedString(String input){
		boolean end;
		int pos = 0;
		do {
			end = true;
			int size = input.length();
			for(int i = pos; i < size - 1; i++) {
				if(input.charAt(i) == input.charAt(i + 1)){
					input = input.substring(0, i) + input.substring(i + 2, size);
					end = false;
					pos = i == 0 ? 0 : i - 1;
					break;
				}
			}
		}while(end == false);
		
		if(input.isEmpty()) {
			return "Empty String";
		}else {
			return input;
		}
	}
	
}
