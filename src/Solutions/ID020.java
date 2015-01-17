package Solutions;

import java.math.BigInteger;

/**
 *
 * @author Yassin Zaoui
 */
public class ID020 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		String str = factorial(100).toString();
		int total = 0;
		
		for (int i = 0; i < str.length(); i++) {
			total += Integer.parseInt(str.substring(i,i+1));
		}
		
		System.out.println(total);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
	}
	
	public static BigInteger factorial(int num) {
	
		BigInteger product = new BigInteger(Integer.toString(num));
		
		for (int i = num - 1; i > 0; i--) {
			product = product.multiply(new BigInteger(Integer.toString(i)));
		}
		
		return product;
		
	}
	
}