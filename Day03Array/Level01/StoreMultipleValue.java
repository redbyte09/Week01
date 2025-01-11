import java.util.*;

public class StoreMultipleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] number = new double[10]; 
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.println("Enter user value:");
            double input = sc.nextDouble(); // Use nextDouble() for double input

            if (input <= 0 || index >= 10) {
                break; // Exit the loop if input is 0, negative, array is full
            } else {
                number[index] = input; // Store the input in the array
                index++;
            }
        }

        // Calculate the total sum
        for (int i = 0; i < index; i++) {
            total += number[i];
        }

        // Display the numbers entered
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(number[i]);
        }

        // Display the total sum
        System.out.println("Total sum: " + total);
    }
}
