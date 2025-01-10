import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Input for the number
        
        for (int i = 6; i <= 9; i++) { // Loop from 6 to 9
            int result = number * i; // Calculate the result
            System.out.println(number + " * " + i + " = " + result); // Print in the required format
        }
        
        sc.close(); // Close the scanner
    }
}
