import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        //Quotient is taken by(/)
        int quotient = num1 / num2;
		//remainder is taken by (%)
        int remainder = num1 % num2;
        
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + num1 + " and " + num2);
    }
}
