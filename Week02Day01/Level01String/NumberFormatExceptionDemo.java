import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate the NumberFormatException
    public static void generateException(String input) {
        // Intentionally parsing a string that might not be a number
        System.out.println("Attempting to parse input as an integer:");
        int number = Integer.parseInt(input);  // This may throw NumberFormatException
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the NumberFormatException
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to parse input as an integer inside try block:");
            int number = Integer.parseInt(input);  // This may throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to parse as an integer:");

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


