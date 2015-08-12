package Solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yassin Zaoui
 */
public class ID022 {
	public static void main(String[] args) {
	
		double first = System.currentTimeMillis();
		
		File file = new File("ID022_input.txt");
		FileReader in;
		BufferedReader readFile;
		String text;
		String[] str = new String[0];
		char[] let;
		int count = 1, sum, total = 0;
		
		/* Get array of names*/
		try {
			in = new FileReader(file);
            readFile = new BufferedReader(in);
			while ((text = readFile.readLine()) != null) {
				str = text.split(",");
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
		
		sort(str);
		
		for (String i : str) {
			sum = 0;
			let = i.substring(1, i.length() - 1).toCharArray();
			for (char j : let) {
				sum += (int)j - 64;
			}
			total += sum * count;
			count++;
		}
		System.out.println("Total: " + total);
		
		System.out.println("\n--------------\nTook " + (System.currentTimeMillis() - first) + " milliseconds.");
		
	}
	
	public static void sort(String[] args) {
	
		List<String> list = Arrays.asList(args);
		Collections.sort(list);
		
	}
}