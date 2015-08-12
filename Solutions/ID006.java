package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID006 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
	
		int squaresSum = 0, sumSquares = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumSquares += i * i;
			squaresSum += i;
		}
		squaresSum = (int)Math.pow(squaresSum, 2);
		System.out.println(squaresSum - sumSquares);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}