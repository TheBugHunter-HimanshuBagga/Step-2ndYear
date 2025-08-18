import java.util.Scanner;


public class q4 {


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


    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }


        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();


        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                words[wordIndex] = currentWord.toString();
                wordIndex++;
                currentWord = new StringBuilder();
            }
        }
        words[wordIndex] = currentWord.toString();


        return words;
    }


    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            int len = findLength(words[i]);
            wordLengths[i][1] = String.valueOf(len);
        }
        return wordLengths;
    }


    public static int[] findShortestLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLen = Integer.MAX_VALUE;
        int longestLen = Integer.MIN_VALUE;


        for (int i = 0; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            if (len < shortestLen) {
                shortestLen = len;
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestLen = len;
                longestIndex = i;
            }
        }
        return new int[] {shortestIndex, longestIndex};
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();


        String[] words = splitWords(input);


        String[][] wordLengths = wordsWithLengths(words);


        int[] indexes = findShortestLongest(wordLengths);


        System.out.println("Shortest word: '" + wordLengths[indexes[0]][0] + "' with length " + wordLengths[indexes[0]][1]);
        System.out.println("Longest word: '" + wordLengths[indexes[1]][0] + "' with length " + wordLengths[indexes[1]][1]);


        scanner.close();
    }
}
