package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID002 {
	public static void main(String[] args) {
		double first = System.currentTimeMillis();
	
		int frst = 1, second = 2, third = 0, sum = 2, i = 0;
		System.out.println(first + "\n" + second);
		
		do {
			third = frst + second;
			frst = second;
			second = third;
			if (third < 4000000 && third % 2 == 0) {
				System.out.println(third);
				sum+= third;
			}
		} while (third < 4000000);
		System.out.println("Sum: " + sum);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
    }
}