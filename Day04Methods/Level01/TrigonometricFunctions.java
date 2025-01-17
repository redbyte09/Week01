import java.util.*;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Store results in an array
        double[] results = {sine, cosine, tangent};
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for the angle
        System.out.println("Enter an angle in degrees:");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine: %.4f%n", trigFunctions[0]);
        System.out.printf("Cosine: %.4f%n", trigFunctions[1]);
        System.out.printf("Tangent: %.4f%n", trigFunctions[2]);

        sc.close(); // Close the scanner
    }
}
