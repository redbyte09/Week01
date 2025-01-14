import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Create an empty string to store the result without duplicates
        String result = "";
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is not already in the result string, add it
            if (result.indexOf(ch) == -1) {
                result += ch;  // Concatenate(adding) the character to the result string
            }
        }
        
        // Output the string without duplicates
        System.out.println("String without duplicates: " + result);
    }
}
