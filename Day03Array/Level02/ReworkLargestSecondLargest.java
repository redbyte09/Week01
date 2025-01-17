import java.util.Scanner;

public class ReworkLargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Max digit array size and create the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            // If index reaches maxDigit, increase the size of the array
            if (index == maxDigit) {
                maxDigit += 10;  // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; 
                System.arraycopy(digits, 0, temp, 0, digits.length); 
                digits = temp;  
            }

            digits[index] = number % 10; // Store the last digit
            number = number / 10; // Remove the last digit
            index++; 
        }

        // Variables to store the largest and second largest
        int largest = -1, secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // largest and second largest digits
        if (secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
    }
}
