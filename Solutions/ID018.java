package Solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yassin Zaoui
 */
public class ID018 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		int numLines = 15;
		int[][] triangle = new int[numLines][];
		int comp1, comp2;
		
		File file = new File("ID018_input.txt");
		FileReader in;
		BufferedReader readFile;
		String text;
		try {
			int x = 0;
			in = new FileReader(file);
            readFile = new BufferedReader(in);
			while ((text = readFile.readLine()) != null) {
				String[] str = text.split(" ");
				int[] temp = new int[str.length];
				for (int i = 0; i < str.length; i++) {
					temp[i] = Integer.parseInt(str[i]);
				}
				triangle[x] = temp;
				x++;
			}
			readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
		}
		
		for (int j = numLines-2; j >= 0; j--) {
			for (int i = 0; i < triangle[j].length; i++) {
				comp1 = triangle[j+1][i];
				comp2 = triangle[j+1][i+1];
				
				if (comp1 > comp2) {
					triangle[j][i] += comp1;
				} else {
					triangle[j][i] += comp2;
				}
			}
		}
		
		System.out.println(triangle[0][0]);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
    }
	
}