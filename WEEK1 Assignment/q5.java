import java.util.Scanner;
 
public class q5 {
 
	// (a) Method to find unique characters using charAt() and nested loops
	public static char[] uniqueCharacters(String text) {
    	int length = text.length();
    	char[] temp = new char[length]; // temporary storage
    	int uniqueCount = 0;
 
    	for (int i = 0; i < length; i++) {
        	char current = text.charAt(i);
        	boolean isUnique = true;
 
        	// check if already stored
        	for (int j = 0; j < uniqueCount; j++) {
            	if (temp[j] == current) {
                    isUnique = false;
                    break;
            	}
        	}
 
        	if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
        	}
    	}
 
    	// Copy only unique chars to new array
    	char[] result = new char[uniqueCount];
    	for (int i = 0; i < uniqueCount; i++) {
        	result[i] = temp[i];
    	}
 
    	return result;
	}
 
	// (b) Method to find frequency of characters using unique characters
	public static String[][] findFrequency(String text) {
    	int[] freq = new int[256]; // ASCII frequency array
 
    	// (i) Count frequency of each character
    	for (int i = 0; i < text.length(); i++) {
        	char ch = text.charAt(i);
            freq[ch]++;
    	}
 
    	// (iii) Find unique characters
    	char[] unique = uniqueCharacters(text);
 
    	// (iv) Create 2D String array
    	String[][] result = new String[unique.length][2];
 
    	// (v) Store unique characters and their frequencies
    	for (int i = 0; i < unique.length; i++) {
        	char ch = unique[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
    	}
 
    	return result;
	}
 
	// (c) Main function
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
