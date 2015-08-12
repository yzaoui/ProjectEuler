package Solutions;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Yassin Zaoui
 */
public class ID025 {
    static ArrayList<BigInteger> nums;
    static int i;
    static BigInteger num;
    
    public static void main(String[] args) {
	
        long first = System.currentTimeMillis();
        
        i = 0;
        nums = new ArrayList<>();
        nums.add(new BigInteger("1")); nums.add(new BigInteger("1"));
        fib();
        
        System.out.println("\n--------------\n" + (System.currentTimeMillis() - first) + " ms.");
		
    }
    
    public static void fib() {
	
        while ((num = nums.get(i).add(nums.get(i+1))).toString().length() < 1000) {
            nums.add(num);
            i++;
        }
        System.out.println(i+3);
		
    }
    
}