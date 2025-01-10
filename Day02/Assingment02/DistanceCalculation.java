import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        
        // Take input for name, fromCity, viaCity, and toCity
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();
        
        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();
        
        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();
        
        // Take input for distances and time
        System.out.print("Enter distance from fromCity to viaCity in miles: ");
        double fromToVia = sc.nextDouble();
        
        System.out.print("Enter distance from viaCity to toCity in miles: ");
        double viaToFinalCity = sc.nextDouble();
        
        System.out.print("Enter time taken in hours: ");
        double timeTaken = sc.nextDouble();
        
        // Calculate total distance and speed
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;
        
        // Output the result
        System.out.println(name + " traveled from " + fromCity + " via " + viaCity + " to " + toCity + " covering " + totalDistance + " miles in " + timeTaken + " hours with an average speed of " + speed + " miles per hour.");
    }
}
