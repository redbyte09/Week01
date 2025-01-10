import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // user input a, b, and c
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        
        // Perform arithmetic operations
        double result1 = a + b * c; // Multiplication before addition
        double result2 = a * b + c; // Multiplication before addition
        double result3 = c + a / b; // Division before addition
        double result4 = a % b + c; // Modulus before addition
        
        // Output the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
