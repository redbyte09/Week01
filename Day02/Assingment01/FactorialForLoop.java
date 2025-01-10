import java.util.*;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n >= 0) {
            int factorial = 1; // Initialize factorial outside the loop
            for (int i = 1; i <= n; i++) {
                factorial *= i; // Multiply current value of factorial by i
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        sc.close(); // Close the scanner
    }
}
