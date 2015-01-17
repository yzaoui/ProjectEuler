package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID014 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		int count, bigCount = 0, bigNum = 0;
		long num;
		
		for (int i = 1; i < 1000000; i++) {
			count = 1;
			num = i;
			while (num != 1) {
				if (num % 2 == 0) {
					num = num/2;
				} else {
					num = 3 * num + 1;
				}
				count++;
			}
			if (count > bigCount) {
				bigCount = count;
				bigNum = i;
			}
		}
		
		System.out.println(bigNum + " produces the longest chain of " + bigCount + " terms.");
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}