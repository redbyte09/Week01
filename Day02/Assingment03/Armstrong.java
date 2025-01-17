import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Get user input
        int sum = 0; // Initialize sum to 0
        int originalNumber = num; // Store the original number
        
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Find the last digit
            sum += Math.pow(remainder, 3); // Add the cube of the digit to sum
            originalNumber /= 10; // Remove the last digit from the number
        }
        
        // Check if the sum is equal to the original number
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        sc.close(); // Close the scanner
    }
}
