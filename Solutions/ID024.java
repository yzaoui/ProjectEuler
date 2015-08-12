package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID024 {

	public static void main(String[] args) {
	
		long first = System.currentTimeMillis();
		
		final int LENGTH = 3;
		int count = 0, fact = LENGTH;
		
		for (int i = 0; i < LENGTH; i++) {
			for (int j = 0; j < LENGTH; j++) {
				for (int k = 0; k < LENGTH; k++) {
					if (i != j && j != k && k != i) {
						count++;
						System.out.println(count + ": " + i + "" + j + "" + k);
					}

				}
			}
		}
		
		for (int i = LENGTH - 1; i > 1; i--) {
			fact *= i;
		}
		
		for (int i = 0; i < fact; i++) {
			
		}
		
		System.out.println("\n--------------\n" + (System.currentTimeMillis() - first) + " ms.");
		
	}
	
}