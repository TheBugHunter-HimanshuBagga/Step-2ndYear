import java.util.Scanner;


public class q3 {


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


    public static String[] splitIntoWords(String str) {
        int length = findLength(str);
       
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (c != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (c == ' ') {
                inWord = false;
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
                if (findLength(currentWord.toString()) > 0) {
                    words[wordIndex] = currentWord.toString();
                    wordIndex++;
                    currentWord.setLength(0); // reset builder
                }
            }
        }
        if (findLength(currentWord.toString()) > 0) {
            words[wordIndex] = currentWord.toString();
        }
       
        return words;
    }


    public static String[][] getWordsWithLengths(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];
       
        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
       
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();


        String[] words = splitIntoWords(input);
       
        String[][] wordLengthPairs = getWordsWithLengths(words);


        System.out.println("\nWord\tLength");
        System.out.println("----------------");
         
        for (int i = 0; i < wordLengthPairs.length; i++) {
            String word = wordLengthPairs[i][0];
            int length = Integer.parseInt(wordLengthPairs[i][1]);
            System.out.printf("%-10s %d\n", word, length);
        }
       
        scanner.close();
    }
}
