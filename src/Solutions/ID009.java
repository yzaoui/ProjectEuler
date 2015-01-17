package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID009 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
	
		int a = 3, b = 4, c = 5, m = 3, n = 2;
	
		for (int i = 1; a + b + c <= 1000; i++) {
			a = i * ((m * m) - (n * n));
			b = i * (2 * m * n);
			c = i * ((m * m) + (n * n));
			System.out.println("a:" + a + " b: " + b + " c: " + c);
		}
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}