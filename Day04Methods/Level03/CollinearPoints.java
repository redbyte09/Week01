import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        // Check if the slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using the area of the triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Check if the area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 3 points
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check collinearity using both methods
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display the results
        System.out.println("Collinear by Slope Method: " + collinearBySlope);
        System.out.println("Collinear by Area Method: " + collinearByArea);

        if (collinearBySlope && collinearByArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }
    }
}