package Solutions;

import java.math.BigInteger;

/**
 *
 * @author Yassin Zaoui
 */
public class ID016 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		int num = 2, power = 1000, total = 0;
		BigInteger sum = new BigInteger(Integer.toString(num));
		
		for (int i = 1; i < power; i++) {
			sum = sum.multiply(new BigInteger(Integer.toString(num)));
		}
		
		String str = sum.toString();
		
		for (int i = 0; i < str.length(); i++) {
			total += Integer.parseInt(str.substring(i,i+1));
		}
		System.out.println(total);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}