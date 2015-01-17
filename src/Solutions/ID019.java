package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID019 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		int numDays = 0, test = 1, count = 0;
		
		for (int year = 1900; year <= 2000; year++) {
			for (int month = 1; month <= 12; month++) {
				switch(month) {
					case 1: case 3: case 5: case 7: case 8: case 10: case 12: numDays = 31; break;
					case 4: case 6: case 9: case 11: numDays = 30; break;
					case 2: if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 ==0)) {numDays = 29;}
						else {numDays = 28;}
					break;
				}
				for (int day = 1; day <= numDays; day++) {
					if (test == 7) {
						if (day == 1 && year > 1900) {
							count++;
						}
						test = 0;
					}
					test++;
				}
			}
		}
		
		System.out.println(count);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}