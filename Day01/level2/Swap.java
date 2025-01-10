import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        
        // Take input for number1
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        
        // Take input for number2
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        
        // Swap the values of num1 and num2 using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Output the swapped numbers
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}
