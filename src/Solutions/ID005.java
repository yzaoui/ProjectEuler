package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID005 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
	
		int index, limit = 20;
	
		for (int i = limit + 1; true; i++) {
			index = 0;
			for (int j = 1; j < limit + 1; j++) {
				if (i % j == 0) {
					index++;
				}
			}
			if (index == limit) {
				System.out.println(i);
				break;
			}
		}
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}