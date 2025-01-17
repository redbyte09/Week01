import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Take input for principal, rate, and time
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        
        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
