import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Create an empty string to store the result
        String result = "";
        
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 'a' - 'A');  // Convert to lowercase
            } 
            // If the character is lowercase, convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 'a' + 'A');  // Convert to uppercase
            } 
            // If it's neither uppercase nor lowercase, just add it as is
            else {
                result += ch;
            }
        }
        
        System.out.println("Toggled case string: " + result);
    }
}
