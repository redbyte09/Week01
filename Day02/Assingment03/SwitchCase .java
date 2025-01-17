import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declare variables
        double first, second;
        String op;

        // input from user
        System.out.print("Enter first number: ");
        first = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        second = sc.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();
        double result = 0;
        boolean validOperator = true;

        // Switch-case 
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperator = false;
        }
        
        // Print the result if the operator is valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
