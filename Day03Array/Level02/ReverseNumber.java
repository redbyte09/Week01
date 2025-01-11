import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input 
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count 
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }

        // Create an array 
        int[] digits = new int[digitCount];

        // Store the digits in the array
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10; 
            tempNumber = tempNumber / 10; 
        }

        // Create array to store reverse order
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[i];
        }

        //  digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }
    }
}
