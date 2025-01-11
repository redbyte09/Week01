import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input for the number of persons
        System.out.println("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        //arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // input for the weight and height 
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]); // BMI formula

            // weight status 
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] < 40.0) {
                status[i] = "Overweight";
            } else if (bmi[i] >= 40.0) {
                status[i] = "Obese";
            }
        }

        // height, weight, BMI, and weight 
        System.out.println("\nPerson Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
    }
}
