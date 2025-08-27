 
import java.util.Scanner;
 
public class q4 {
 
	// (a) Method to find frequency of characters and return as 2D array
	public static String[][] findFrequency(String text) {
    	int[] freq = new int[256]; // ASCII frequency table
 
    	// (i) Count frequency
    	for (int i = 0; i < text.length(); i++) {
        	char ch = text.charAt(i);
            freq[ch]++;
    	}
 
    	// (ii) Count number of unique characters
    	int uniqueCount = 0;
    	for (int i = 0; i < 256; i++) {
        	if (freq[i] > 0) {
                uniqueCount++;
        	}
    	}
 
    	// (iii) Store characters and their frequencies in a 2D String array
    	String[][] result = new String[uniqueCount][2];
    	int index = 0;
 
    	for (int i = 0; i < text.length(); i++) {
        	char ch = text.charAt(i);
        	if (freq[ch] > 0) {
                result[index][0] = String.valueOf(ch);    	// character
                result[index][1] = String.valueOf(freq[ch]);  // frequency
                freq[ch] = 0; // mark as processed
                index++;
        	}
    	}
 
    	return result;
	}
 
	// (b) Main function
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
    	String text = sc.nextLine();
 
    	String[][] result = findFrequency(text);
 
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
    	for (String[] row : result) {
            System.out.println("    " + row[0] + "     | 	" + row[1]);
    	}
 
    	sc.close();
	}
}
