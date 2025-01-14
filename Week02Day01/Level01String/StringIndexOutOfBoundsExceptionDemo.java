import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate the StringIndexOutOfBoundsException
    public static void generateException(String input) {
        // Intentionally accessing an index beyond the length of the string
        System.out.println("Attempting to access character at index 10:");
        char result = input.charAt(10);  // This will throw StringIndexOutOfBoundsException if length is less than 11
        System.out.println("Character: " + result);
    }

    // Method to handle the StringIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to access character at index 10 inside try block:");
            char result = input.charAt(10);  // This will throw StringIndexOutOfBoundsException if length is less than 11
            System.out.println("Character: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        String input = sc.nextLine();

        // Call the method to generate the exception
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Exception caught during generateException: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(input);

        sc.close();
    }
}
