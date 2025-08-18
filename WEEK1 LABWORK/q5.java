import java.util.Scanner;


public class q5 {
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch < 'a' || ch > 'z') {
            return "Not a Letter";
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }
    public static int[] countVowelsConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;


        int length = 0;
        try {
            while(true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }


        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            String result = checkChar(ch);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }


        return new int[] {vowelCount, consonantCount};
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int[] counts = countVowelsConsonants(input);


        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);


        scanner.close();
    }
}