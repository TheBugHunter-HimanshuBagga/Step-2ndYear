import java.util.Scanner;

public class q6 {

    public static String checkChar(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        // Check if it's a letter
        if (ch < 'a' || ch > 'z') {
            return "Not a Letter";
        }
        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    public static String[][] classifyChars(String str) {
        int length = str.length(); // Use built-in length
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkChar(ch);
        }

        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s | %-12s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s | %-12s\n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] classifiedChars = classifyChars(input);

        displayTable(classifiedChars);
    }
}