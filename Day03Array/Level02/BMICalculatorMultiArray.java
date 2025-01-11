import java.util.Scanner;

public class BMICalculatorMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input for persons
        System.out.println("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // input weight and height 
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.println("Weight must be positive. Please enter again:");
                personData[i][0] = scanner.nextDouble();
            }

            System.out.println("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.println("Height must be positive. Please enter again:");
                personData[i][1] = scanner.nextDouble();
            }
        }

        // Calculate BMI and determine weight status 
        for (int i = 0; i < numPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi; 

            // Determine weight status based on BMI
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi < 40.0) {
                weightStatus[i] = "Overweight";
            } else if (bmi >= 40.0) {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight 
        System.out.println("\nPerson Details:");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
