import java.util.*;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        //  valid natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; 
        }

        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];  // Odd numbers array
        int[] evenNumbers = new int[number / 2];     // Even numbers array

        // Initialize 
        int oddIndex = 0;
        int evenIndex = 0;

        // using loop here
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;  // If even, add it to the even array
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;   // If odd, add it to the odd array
                oddIndex++;
            }
        }

        //  odd numbers array
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        //  even numbers array
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
