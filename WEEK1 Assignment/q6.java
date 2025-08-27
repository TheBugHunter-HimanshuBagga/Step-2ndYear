import java.util.Scanner;
 
public class q6 {
 
	// (a) Method to find frequency of characters using nested loops
	public static String[] findFrequency(String text) {
    	char[] chars = text.toCharArray(); 	// store characters
    	int[] freq = new int[chars.length];	// frequency array
 
    	// (ii) Count frequency
    	for (int i = 0; i < chars.length; i++) {
        	freq[i] = 1; // assume this char appears at least once
 
        	if (chars[i] == '0') continue; // skip already counted chars
 
        	for (int j = i + 1; j < chars.length; j++) {
            	if (chars[i] == chars[j]) {
                    freq[i]++;  	// increment frequency
                    chars[j] = '0'; // mark duplicate as visited
            	}
        	}
    	}
 
    	// (iii) Store characters and frequencies in a 1D String array
    	int count = 0;
    	for (int i = 0; i < chars.length; i++) {
        	if (chars[i] != '0') count++;
    	}
 
    	String[] result = new String[count];
    	int index = 0;
 
    	for (int i = 0; i < chars.length; i++) {
        	if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
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
 
    	String[] result = findFrequency(text);
 
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
    	for (String row : result) {
            System.out.println("   " + row);
    	}
 
    	sc.close();
	}
}
