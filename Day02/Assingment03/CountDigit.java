import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read user input
        int count = 0; // Initialize count to 0
        
        while (n != 0) {
            n = n / 10; // Remove the last digit of n
            count++; // Increment the digit count
        }
        
        System.out.println("COUNT: " + count); // Print the count of digits
        sc.close(); // Close the scanner
    }
}
