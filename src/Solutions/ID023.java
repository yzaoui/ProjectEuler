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
public class ID023 {

	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		File file = new File("ID023_input.txt");
		FileReader in;
		BufferedReader readFile;
		String text;
		int[] nums = new int[1456];
		int i = 0, sum = 0;
		
		/* Get array of names*/
		try {
			in = new FileReader(file);
            readFile = new BufferedReader(in);
			while ((text = readFile.readLine()) != null) {
				nums[i] = Integer.parseInt(text.split(" ")[1]);
				i++;
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
		
		for (int x : nums) {
			sum += x;
		}
		
		System.out.println(sum);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
	}
	
}