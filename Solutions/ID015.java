package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID015 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
	
		int size = 20;
		long[] current = new long[size+1];
		current[0] = 1;
		  
		long[] last = new long[size+1];		
		for (int i=0; i < size+1; i++) {
			last[i] = i + 1;
		}
		  
		for (int k=0; k < size-1; k++) {
			for (int i=1; i < size+1; i++) {
				current[i] = current[i-1] + last[i];
			}
			last = current;
			current = new long[size+1];
			current[0] = 1;
		}  
		System.out.println(last[size]);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
	}
	
}