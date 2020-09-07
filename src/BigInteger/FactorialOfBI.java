package BigInteger;

import java.math.BigInteger;
import java.util.*;
public class FactorialOfBI {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		BigInteger n = new BigInteger(scr.next());
		System.out.println(factorial(n));
	}
	
	static BigInteger factorial(BigInteger n) { 
		/* 
		 * we made this static so we can easily call it from main class without
		 * creating a class object
		 */
		BigInteger res = BigInteger.ONE;
		
		while(n.signum() > 0)  {
			res = res.multiply(n);
			n = n.subtract(BigInteger.ONE);
		}
		
		return res;
	}

}
