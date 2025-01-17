import java.util.Scanner;

public class LargestSecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Max digit array size and create the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
            // If index == maxDigit, break the loop
            if (index == maxDigit) {
                break;
            }
        }

        // Variables to store the largest and second largest
        int largest = -1, secondLargest = -1;

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        if (secondLargest != -1) {
            System.out.println("The largest digit is: " + largest);
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
    }
}
