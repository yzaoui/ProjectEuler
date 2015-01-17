package Solutions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yassin Zaoui
 */
public class ID012 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		List<Integer> primeList = new ArrayList<Integer>();
        for(int i = 1;i<1000;i++){
            if(isPrime(i)){
                primeList.add(i);
            }
        }
        int[] primeArray = new int[primeList.size()];
        for(int i = 0; i<primeList.size();i++){
            primeArray[i]=primeList.get(i);
        }
        
        int n=3;
        int Dn=2;
        int divisors = 0;
        int n1, Dn1, i, exponent;
        while(divisors<=500){
            n++;
            n1 = n;
            if(n1%2==0){
                n1 = n1/2;
            }
            Dn1 = 1;
            for(i=0;i<primeArray.length;i++){
                if(primeArray[i]*primeArray[i]>n1){
                    Dn1 = 2*Dn1;
                    break;
                }
                exponent = 1;
                while(n1%primeArray[i]==0){
                    exponent++;
                    n1=n1/primeArray[i];
                }
                if(exponent>1){
                    Dn1 = Dn1*exponent;
                }
                if(n1==1){
                    break;
                }
            }
            divisors = Dn*Dn1;
            Dn = Dn1;
        }
        System.out.println(n*(n-1)/2);
		
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