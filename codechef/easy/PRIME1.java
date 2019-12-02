/*
 * Link: https://www.codechef.com/problems/PRIME1
 */
package codechef.easy;

public class PRIME1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 100000;
		for(int i = a; i <= b; i++) {
			if(isPrime(i)) System.out.println(i);
		}
		
	}

	//Most optimal prime number checker function
	public static boolean isPrime(int number) {
		if(number == 1) 
			return false;
	    if (number <= 3) 
	        return true;            // as 2 and 3 are prime
	    else if (number%2==0 || number%3==0) 
	        return false;     // check if number is divisible by 2 or 3
	    else {
	        for (int i=5; i*i<=number; i+=6) {
	            if (number % i == 0 || number%(i + 2) == 0) 
	                return false;
	        }
	        return true;
	    }
	}
}
