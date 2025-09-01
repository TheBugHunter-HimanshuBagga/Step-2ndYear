import java.util.ArrayList;
import java.util.Scanner;


public class SubstringReplace {


    public static ArrayList<Integer> findOccurrences(String text, String substring) {
        ArrayList<Integer> positions = new ArrayList<>();
        int index = text.indexOf(substring);
        while (index != -1) {
            positions.add(index);
            index = text.indexOf(substring, index + 1);
        }
        return positions;
    }


    public static String manualReplace(String text, String substring, String replacement, ArrayList<Integer> positions) {
        StringBuilder result = new StringBuilder();
        int textIndex = 0;
        int substringLength = substring.length();
        int posIndex = 0;


        while (textIndex < text.length()) {
            if (posIndex < positions.size() && textIndex == positions.get(posIndex)) {
                result.append(replacement);
                textIndex += substringLength;
                posIndex++;
            } else {
                result.append(text.charAt(textIndex));
                textIndex++;
            }
        }
        return result.toString();
    }


    public static boolean compareResults(String manualResult, String text, String substring, String replacement) {
        String builtInResult = text.replace(substring, replacement);
        return manualResult.equals(builtInResult);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the main text: ");
        String text = scanner.nextLine();


        System.out.print("Enter the substring to find: ");
        String substring = scanner.nextLine();


        System.out.print("Enter the replacement substring: ");
        String replacement = scanner.nextLine();


        ArrayList<Integer> positions = findOccurrences(text, substring);


        String manualResult = manualReplace(text, substring, replacement, positions);


        String builtInResult = text.replace(substring, replacement);


        boolean isSame = compareResults(manualResult, text, substring, replacement);


        System.out.println("\nManual Replacement Result: " + manualResult);
        System.out.println("Built-in replace() Result: " + builtInResult);
        System.out.println("Are both results identical? " + isSame);


        scanner.close();
    }
}


