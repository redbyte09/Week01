import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        // Create an empty string to store the modified string
        String modified = "";

        // Loop through each character of the original string
        for (int i = 0; i < str.length(); i++) {
            // If the character is not the one we want to remove, add it to the result
            if (str.charAt(i) != charToRemove) {
                modified += str.charAt(i);
            }
        }

        // Output the modified string
        System.out.println("Modified String: " + modified);
    }
}
