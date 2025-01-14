import java.util.*;

public class BMICalculator {
    //Method to calculate BMI
    public static double calculationOfBmi(double weight, double height) {
        double heightInMeters = height / 100; // convert height to meters
        return weight / (heightInMeters * heightInMeters);//BMI formula
    }
     //using this method to know the status
    public static String information(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else if (bmi >= 40.0) {
            return "Obese";
        }
        return "Unknown";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //this is 2D array
        double[][] info = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for individual " + (i + 1) + ":");
            System.out.println("Weight:");
            double weight = sc.nextDouble();
            System.out.println("Height:");
            double height = sc.nextDouble();
            //stroring weight and height in array
            //this means weight will store in first column
            info[i][0] = weight;
            //this will store height in second column
            info[i][1] = height;
            //calling method to calculate bmi
            double bmi = calculationOfBmi(weight, height);
            //now storing bmi in third column
            info[i][2] = bmi;
        }
        
        System.out.println("BMI and information for all:");
        System.out.println("Weight | Height | BMI  | Status");
        //using this loop ti iterate again
        for (int i = 0; i < 10; i++) {
            //doing this to taking all the values at place to print
            double weight = info[i][0];
            double height = info[i][1];
            double bmi = info[i][2];
            String status = information(bmi);
            System.out.printf("%.2f   | %.2f   | %.2f  | %s%n", weight, height, bmi, status);
            //usinn %.2f for getting numbers up to 2 decimals
            //%s for printing string means our status
            //%n for new line
        }
        
        sc.close();
    }
}
