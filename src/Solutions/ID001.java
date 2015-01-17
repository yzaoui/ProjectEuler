package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID001 {
	
	public static void main(String[] args) {
		
		double first = System.currentTimeMillis();
	
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum is: " + sum);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}