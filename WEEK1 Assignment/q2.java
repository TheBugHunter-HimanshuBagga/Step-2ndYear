import java.util.Scanner;
 
public class q2 {
 
	// (a) Method to find length of a string without using length()
	public static int findLength(String text) {
    	int count = 0;
    	try {
        	while (true) {
                text.charAt(count); // will throw exception when index is out of bounds
                count++;
        	}
    	} catch (Exception e) {
        	// do nothing, just stop when exception occurs
    	}
    	return count;
	}
 
	// (b) Method to find unique characters and return them as a char array
	public static char[] findUniqueChars(String text) {
    	int length = findLength(text);
    	char[] temp = new char[length]; // temp storage
    	int uniqueCount = 0;
 
    	for (int i = 0; i < length; i++) {
        	char current = text.charAt(i);
        	boolean isUnique = true;
 
        	// check if already exists in temp
        	for (int j = 0; j < uniqueCount; j++) {
            	if (temp[j] == current) {
                    isUnique = false;
                    break;
            	}
        	}
 
        	// if unique, add to temp
        	if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
        	}
    	}
 
    	// copy unique chars to new array of correct size
    	char[] result = new char[uniqueCount];
    	for (int i = 0; i < uniqueCount; i++) {
        	result[i] = temp[i];
    	}
 
    	return result;
	}
 
	// (c) Main function
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a text: ");
    	String text = sc.nextLine();
 
    	// find length without using length()
    	int length = findLength(text);
        System.out.println("Length of text: " + length);
 
    	// find unique characters
    	char[] unique = findUniqueChars(text);
 
        System.out.print("Unique characters: ");
    	for (char c : unique) {
            System.out.print(c + " ");
    	}
        System.out.println();
 
    	sc.close();
	}
}
