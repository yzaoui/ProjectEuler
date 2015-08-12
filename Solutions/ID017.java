package Solutions;

/**
 *
 * @author Yassin Zaoui
 */
public class ID017 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		StringBuilder str;
		StringBuilder last = new StringBuilder("");
		
		for (int i = 1; i <= 1000; i++) {
			str = new StringBuilder("");
			
			if (i % 900 < 100 && i >= 900) {str.append("ninehundred").append(i == 900 ? "" : "and");}
			else if (i % 800 < 100 && i >= 800) {str.append("eighthundred").append(i == 800 ? "" : "and");}
			else if (i % 700 < 100 && i >= 700) {str.append("sevenhundred").append(i == 700 ? "" : "and");}
			else if (i % 600 < 100 && i >= 600) {str.append("sixhundred").append(i == 600 ? "" : "and");}
			else if (i % 500 < 100 && i >= 500) {str.append("fivehundred").append(i == 500 ? "" : "and");}
			else if (i % 400 < 100 && i >= 400) {str.append("fourhundred").append(i == 400 ? "" : "and");}
			else if (i % 300 < 100 && i >= 300) {str.append("threehundred").append(i == 300 ? "" : "and");}
			else if (i % 200 < 100 && i >= 200) {str.append("twohundred").append(i == 200 ? "" : "and");}
			else if (i % 100 < 100 && i >= 100) {str.append("onehundred").append(i == 100 ? "" : "and");}
			
			//Only every 100
			if (i % 100 == 10) {str.append("ten");}
			if (i % 100 == 11) {str.append("eleven");}
			if (i % 100 == 12) {str.append("twelve");}
			if (i % 100 == 13) {str.append("thirteen");}
			if (i % 100 == 14) {str.append("fourteen");}
			if (i % 100 == 15) {str.append("fifteen");}
			if (i % 100 == 16) {str.append("sixteen");}
			if (i % 100 == 17) {str.append("seventeen");}
			if (i % 100 == 18) {str.append("eighteen");}
			if (i % 100 == 19) {str.append("nineteen");}
			if (i % 100 >= 20 && i % 100 < 30) {str.append("twenty");}
			if (i % 100 >= 30 && i % 100 < 40) {str.append("thirty");}
			if (i % 100 >= 40 && i % 100 < 50) {str.append("forty");}
			if (i % 100 >= 50 && i % 100 < 60) {str.append("fifty");}
			if (i % 100 >= 60 && i % 100 < 70) {str.append("sixty");}
			if (i % 100 >= 70 && i % 100 < 80) {str.append("seventy");}
			if (i % 100 >= 80 && i % 100 < 90) {str.append("eighty");}
			if (i % 100 >= 90 && i % 100 < 100) {str.append("ninety");}
			
			
			//Only every 10 except 10 <= i <= 19
			if (i % 10 == 1 && i % 100 != 11) {str.append("one");}
			if (i % 10 == 2 && i % 100 != 12) {str.append("two");}
			if (i % 10 == 3 && i % 100 != 13) {str.append("three");}
			if (i % 10 == 4 && i % 100 != 14) {str.append("four");}
			if (i % 10 == 5 && i % 100 != 15) {str.append("five");}
			if (i % 10 == 6 && i % 100 != 16) {str.append("six");}
			if (i % 10 == 7 && i % 100 != 17) {str.append("seven");}
			if (i % 10 == 8 && i % 100 != 18) {str.append("eight");}
			if (i % 10 == 9 && i % 100 != 19) {str.append("nine");}
			
			if (i == 1000) {str.append("onethousand");}
			
			last.append(str.toString());
		}
		System.out.println(last.length());
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}