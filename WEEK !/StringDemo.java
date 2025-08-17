public class StringDemo {
public static void main(String[] args) {

// 1. CreaƟng strings in different ways
String str1 = "Hello"; // Using string literal
String str2 = new String("World"); // Using new keyword
char[] charArray = {'J', 'a', 'v', 'a'};
String str3 = new String(charArray); // From character array
StringBuilder sb = new StringBuilder("StringBuilder Example"); // Using StringBuilder
StringBuffer sBuf = new StringBuffer("StringBuffer Example"); // Using StringBuffer

// PrinƟng the created strings
System.out.println("String literal: " + str1);
System.out.println("Using new keyword: " + str2);
System.out.println("From char array: " + str3);
System.out.println("StringBuilder: " + sb);
System.out.println("StringBuffer: " + sBuf);

System.out.println("\n--- Basic String ManipulaƟon ---");

// ConcatenaƟon
String concatStr = str1 + " " + str2;
System.out.println("ConcatenaƟon: " + concatStr);

// Using concat() method
System.out.println("Using concat(): " + str1.concat(" ").concat(str2));

// Substring
System.out.println("Substring (0 to 4): " + concatStr.substring(0, 5));

// Replace
System.out.println("Replace 'World' with 'Java': " + concatStr.replace("World", "Java"));

// Case conversion
System.out.println("Uppercase: " + concatStr.toUpperCase());
System.out.println("Lowercase: " + concatStr.toLowerCase());

// Trim spaces
String strWithSpaces = " Trim Example ";
System.out.println("Before trim: '" + strWithSpaces + "'");
System.out.println("AŌer trim: '" + strWithSpaces.trim() + "'");

// Length
System.out.println("Length of '" + concatStr + "' : " + concatStr.length());
}
}