package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID004 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
	
		String[] str;
		int largest = 0;
		
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				str = Integer.toString(i * j).split("");
				if (str.length == 7) {
					if (str[1].equals(str[6]) && str[2].equals(str[5]) && str[3].equals(str[4])) {
						if (i * j > largest) {
							largest = i * j;
						}
					}
				} else {
					if (str[1].equals(str[5]) && str[2].equals(str[4])) {
						if (i * j > largest) {
							largest = i * j;
						}
					}
				}
			}
		}
		System.out.println(largest);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}