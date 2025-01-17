import java.util.*;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Check if the input is valid (positive number)
        if (number <= 0) {
            System.out.println("Error: Please enter a valid positive number.");
            return;
        }

        // Initialize 
        int maxFactor = 10;
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; 

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // If array is full, resize the array
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
                    // Coping old element to new element
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; 
                }
                factors[index] = i; 
                index++; 
            }
        }

        //  factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
