public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "  Hello World! Welcome to Java Programming.  ";

        // 1. length()
        System.out.println("Length: " + text.length());

        // 2. trim()
        String trimmed = text.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 4. charAt()
        if (text.length() > 7) {
            System.out.println("Character at index 7: " + text.charAt(7));
        } else {
            System.out.println("Index 7 is out of bounds for charAt().");
        }

        // 5. substring()
        if (text.length() >= 12) {
            System.out.println("Substring (7 to 12): " + text.substring(7, 12));
        } else {
            System.out.println("Cannot get substring (7,12): index out of bounds.");
        }

        // 6. indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Last index of 'o': " + text.lastIndexOf('o'));

        // 7. contains()
        System.out.println("Contains 'World': " + text.contains("World"));

        // 8. replace()
        System.out.println("Replace 'Java' with 'C++': " + text.replace("Java", "C++"));

        // 9. split()
        String[] words = text.trim().split("\\s+");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. equals() and equalsIgnoreCase()
        String str1 = "Java";
        String str2 = "java";
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        // 11. startsWith() and endsWith()
        System.out.println("Starts with '  Hello': " + text.startsWith("  Hello"));
        System.out.println("Ends with 'Programming.  ': " + text.endsWith("Programming.  "));

        // 12. isEmpty()
        String empty = "";
        System.out.println("Is empty string: " + empty.isEmpty());
    }
}