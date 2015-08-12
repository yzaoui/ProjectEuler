package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID010 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		int num = 2000000;
		long sum = 2L;
		
		for (int i = 3; i < num; i += 2) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
	private static boolean isPrime(int n){
	
		if (n==1) {return false;}
		else if (n<4) {return true;} //2 and 3 are prime
		else if (n%2==0) {return false;}
		else if (n<9) {return true;} //we have already excluded 4, 6 and 8.
		else if (n%3==0) {return false;}
		else {
			int r = (int)Math.floor(Math.sqrt(n));
			int f = 5;
			while (f <= r) {
				if (n % f == 0) {return false;}
				if (n % (f+2) == 0) {return false;}
				f += 6;
			}
			return true;
		}
		
    }
	
}