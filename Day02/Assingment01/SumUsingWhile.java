import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner
        double total = 0.0;
        double number = sc.nextDouble(); // Read the first number
        
        while (number != 0) { // Continue until 0 is entered
            total += number;
            number = sc.nextDouble(); // Read the next number
        }
        
        System.out.println("Total sum: " + total); // Print the total sum
        sc.close(); // Close the scanner
    }
}
