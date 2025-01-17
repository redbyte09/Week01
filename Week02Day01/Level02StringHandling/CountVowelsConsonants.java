import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();  // Convert the string to lowercase for easy comparison
        
        // Initialize counters for vowels and consonants
        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  // Get the character at the current position

            // Check if the character is a letter (a-z)
            if (ch >= 'a' && ch <= 'z') {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
                // If it's not a vowel, it's a consonant
                else {
                    consonants++;
                }
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
