import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Array to store frequency of characters 
        int[] frequency = new int[26];
        
        // using loop here
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {  // Consider only alphabetic characters
                frequency[Character.toLowerCase(ch) - 'a']++;
            }
        }
        
        // Find the character with the maximum frequency
        int maxCount = 0;
        char mostFrequent = ' ';
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequent = (char) (i + 'a');
            }
        }
        
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
