import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //  user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check  number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create a String array 
            String[] results = new String[number];
            
            // Loop from 1 to the entered number
            for (int i = 0; i < number; i++) {
                int currentNumber = i + 1; // To make the loop start from 1 to the number
                
                // Check number is a multiple of both 3 and 5
                if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                    results[i] = "FizzBuzz";
                }
                // Check number is a multiple of 3
                else if (currentNumber % 3 == 0) {
                    results[i] = "Fizz";
                }
                // Check number is a multiple of 5
                else if (currentNumber % 5 == 0) {
                    results[i] = "Buzz";
                }
                else {
                    results[i] = String.valueOf(currentNumber);
                }
            }
            
            //  results 
            for (int i = 0; i < number; i++) {
                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }
        }

    }
}
