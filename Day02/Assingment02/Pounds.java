import java.util.Scanner;

public class Pounds {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Take input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        
        // Convert pounds to kilograms
        double kilograms = pounds * 2.2;
        
        // Output the result
        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " + kilograms);
    }
}
