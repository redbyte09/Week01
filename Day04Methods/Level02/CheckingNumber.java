import java.util.*;

public class CheckingNumber {

    // Method to check if the number is positive, negative, or zero
    public static String isPositive(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        //  input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        // Checking each number if positive or negative and even or odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String sign = isPositive(num);
            System.out.println("Number " + num + " is " + sign);

            if (sign.equals("Positive")) {
                String evenOdd = isEven(num);
                System.out.println("Number " + num + " is " + evenOdd);
            }
        }

        // Comparing the first and last elements of the array
        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("First element is greater");
        } else if (comparison == 0) {
            System.out.println("Both elements are equal");
        } else {
            System.out.println("Last element is greater");
        }

        sc.close();
    }
}
