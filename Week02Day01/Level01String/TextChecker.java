import java.util.Scanner;

public class TextChecker {

    // Method to convert a character to uppercase using ASCII values
    public static char toUpperCaseChar(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 32);
        }
        return ch;
    }

    // Method to convert a string to uppercase
    public static String toUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) { 
            upperCaseText.append(toUpperCaseChar(text.charAt(i)));
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Method to split text into words without using split() method
    public static String[] splitIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()]; // Temporary storage
        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0); // Reset the word
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) {
            words[wordCount++] = word.toString(); // Add the last word
        }

        // Trim the array to the actual number of words
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to find the length of a string without using length() method
    public static int getStringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to generate a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Convert text to uppercase
        String upperCaseText = toUpperCase(inputText);
        System.out.println("Uppercase using custom method: " + upperCaseText);

        // Convert text to uppercase using built-in method and compare
        String builtInUpperCase = inputText.toUpperCase();
        boolean isSame = compareStrings(upperCaseText, builtInUpperCase);
        System.out.println("Comparison with built-in toUpperCase(): " + isSame);

        // Split text into words
        String[] words = splitIntoWords(inputText);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display words and their lengths
        System.out.println("Words and their lengths:");
        System.out.println("Word\tLength");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }

        scanner.close();
    }
}
