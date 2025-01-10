import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Take input for the sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = sc.nextDouble();
        
        System.out.print("Enter side2 of the triangle: ");
        double side2 = sc.nextDouble();
        
        System.out.print("Enter side3 of the triangle: ");
        double side3 = sc.nextDouble();
        
        // Calculate perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Calculate number of rounds needed to complete 5 km
        double rounds = 5000 / perimeter;
        
        // Output the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }
}
