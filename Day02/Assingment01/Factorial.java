import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input for the number
        int factorial = 1; // Variable to store the result
        
        if (n >= 0) { // Factorial is defined for non-negative numbers
            int i = 1;
            while (i <= n) {
                factorial *= i; // Multiply current value of factorial by i
                i++; // Increment i
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        sc.close(); // Close the scanner
    }
}
