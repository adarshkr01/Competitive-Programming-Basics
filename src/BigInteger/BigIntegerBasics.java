package BigInteger;

import java.math.BigInteger;
public class BigIntegerBasics {
	public static void main(String[] args) {
		
		// We use BigInteger because maybe int and long cannot accommodate the value given
		
		// Creating a BigInteger
		// Constructor takes a string as value
		
		BigInteger bi = new BigInteger("5165489516546848465465622");
		System.out.println(bi);
		
		// or
		BigInteger b1 = BigInteger.valueOf(878998555);
		System.out.println(b1);
		// above number should fall in first 64 bits.
		// Don't use new BigInteger.valueOf() as valueOf() is a static function
		
		
		// Inbuilt BigIntegers for ease
		BigInteger y = new BigInteger("12");
		y.add(BigInteger.ONE); // Static function
		y.add(BigInteger.ZERO);
		y.add(BigInteger.TEN);
		
		// Checking if BigInteger is +ve, 0 or -ve
		System.out.println(y.signum());
		
		// Taking BigInteger as input
		// BigInteger n = new BigInteger(scr.next()); 
		// shouldn't be a problem since it accepts string
		
		// Arithmetic on BigInteger can be performed only by another BigInteger
		BigInteger a = new BigInteger("222");
		BigInteger b = BigInteger.TEN;
		BigInteger res;
		res = a.add(b);
		System.out.println(res);
		
		res = a.subtract(b);
		System.out.println(res);
		
		res = a.multiply(b);
		System.out.println(res);
		
		res = a.divide(new BigInteger("2"));
		System.out.println(res);
		
		res = a.add(new BigInteger("150"))
				.multiply(new BigInteger("10"))
				.divide(new BigInteger("5"));
		System.out.println(res);
		
		
		// Mod and Inverse mod
		
		BigInteger x = new BigInteger("5");
		BigInteger mod = x.mod(new BigInteger("2")); // 5%2
		System.out.println(mod);
		
		mod = x.modInverse(new BigInteger("12")); // 12%5
		System.out.println(mod);
		
	}
	
}
