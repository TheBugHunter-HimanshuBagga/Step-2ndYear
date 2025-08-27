import java.util.Scanner;
 
public class q3 {
 
	// (b) Method to find the first non-repeating character
	public static char findFirstNonRepeatingChar(String text) {
    	int[] freq = new int[256]; // ASCII character frequency table
 
    	// (i) Count frequency of each character
    	for (int i = 0; i < text.length(); i++) {
        	char ch = text.charAt(i);
            freq[ch]++;
    	}
 
    	// (ii) Find first non-repeating character
    	for (int i = 0; i < text.length(); i++) {
        	char ch = text.charAt(i);
        	if (freq[ch] == 1) {
            	return ch;
        	}
    	}
 
    	return '\0'; // return null char if none found
	}
 
	// (c) Main function
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
    	String text = sc.nextLine();
 
    	char result = findFirstNonRepeatingChar(text);
 
    	if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
    	} else {
            System.out.println("No non-repeating character found.");
    	}
 
    	sc.close();
	}
}
