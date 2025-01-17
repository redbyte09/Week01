import java.util.Scanner;

public class SumOfNaturalNumbers {
    // creating method
    // sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;  // sum of first 1 natural number is 1
        }
        return n + recursiveSum(n - 1);  // formula of sum = n + sum of (n-1)
    }

    // created mathod
    //finding sum
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;  // Formula for sum of first n natural numbers
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input 
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;  
        }

        //  sum using recursion
        int sumRecursion = recursiveSum(n);

        // sum using the formula
        int sumFormula = formulaSum(n);

        // Presults
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("There is a mismatch between the results.");
        }

        scanner.close();
    }
}
