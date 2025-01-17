import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate the IllegalArgumentException
    public static void generateException(String input) {
        // Intentionally setting the start index greater than the end index for substring
        System.out.println("Attempting to get a substring with invalid indices:");
        String result = input.substring(4, 3);  // This will throw IllegalArgumentException
        System.out.println("Substring: " + result);
    }

    // Method to handle the IllegalArgumentException
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to get a substring inside try block:");
            String result = input.substring(4, 3);  // This will throw IllegalArgumentException
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
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
