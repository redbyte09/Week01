import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate the ArrayIndexOutOfBoundsException
    public static void generateException(String[] array) {
        // Intentionally accessing an index out of bounds
        System.out.println("Attempting to access index 4:");
        System.out.println(array[4]);  // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle the ArrayIndexOutOfBoundsException
    public static void handleException(String[] array) {
        try {
            System.out.println("Attempting to access index 5 inside try block:");
            System.out.println(array[4]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names (max 4):");
        int n = sc.nextInt();
        sc.nextLine();  // for the newline

        // Define an array to store names
        String[] names = new String[n];
        System.out.println("Enter the names:");

        // Take input for the names
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Call the method to generate the exception (this will crash the program)
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught during generateException: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);

        sc.close();
    }
    //e: This is the exception object that was caught in the catch block.
}
