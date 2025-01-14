import java.util.Scanner;

public class FactorCalculator {

    // creating method(static)
    public static int[] findFactors(int number) {
        int count = 0;
        
        // loop to count how many factors the number has
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // creating array for factors
        int[] factors = new int[count];
        int index = 0;

        // loop to save the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding the factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // product of the factors
        int product = findProduct(factors);
        System.out.println("Product of factors: " + product);

        // sum of the square of the factors
        double sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }
}
