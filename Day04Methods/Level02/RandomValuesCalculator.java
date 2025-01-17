import java.util.*;

public class RandomValuesCalculator {

    //  array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000); // Generates 4-digit random numbers
        }

        return randomNumbers;
    }

    //  finding average, minimum, and maximum of an array
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        RandomValuesCalculator calculator = new RandomValuesCalculator();

        //  array of 5 random 4-digit numbers
        int[] randomNumbers = calculator.generate4DigitRandomArray(5);

        //generated random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find and display the average, minimum, and maximum
        double[] results = calculator.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
