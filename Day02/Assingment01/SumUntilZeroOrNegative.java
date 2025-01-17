import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // Initialize sum

        while (true) { // Infinite loop
            System.out.print("Enter a number: ");
            int number = sc.nextInt(); // Take user input
            
            if (number <= 0) { // Check if the number is 0 or negative
                break; // Exit the loop
            }
            
            sum += number; // Add the number to the sum
        }

        System.out.println("Total sum: " + sum); // Print the total sum
        sc.close(); // Close the scanner
    }
}
