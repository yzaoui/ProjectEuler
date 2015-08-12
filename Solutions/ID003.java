package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID003 {

    public static void main(String[] args) {
		double first = System.currentTimeMillis();
	
        long num = 600851475143L;   // odd value is not divided by any even
        long pFactor = 1L;

        for(int i = 3; i <= Math.sqrt(num); i += 2) 
        {
            if( num % i == 0 ) {
                pFactor = i;
                num = num / i;
            }
            while ( num % i == 0 ) {
                num = num / i;
            }
        }
        if( pFactor < num ) { pFactor = num; }

        System.out.println(pFactor);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}