import java.util.Scanner;


public class q2 {


    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {


        }
        return count;
    }


    public static String[] manualSplit(String str) {
        int length = findLength(str);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }


        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();


        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                words[wordIndex] = currentWord.toString();
                wordIndex++;
                currentWord.setLength(0); // clear builder
            }
        }
        words[wordIndex] = currentWord.toString();


        return words;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();


        // Manual split
        String[] manualWords = manualSplit(input);


        // Built-in split
        String[] builtInWords = input.split(" ");


        // Display manual split result
        System.out.println("\nManual split result:");
        for (String w : manualWords) {
            System.out.println(w);
        }


        // Display built-in split result
        System.out.println("\nBuilt-in split() method result:");
        for (String w : builtInWords) {
            System.out.println(w);
        }


        scanner.close();
    }
}
