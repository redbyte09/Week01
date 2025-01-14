public class NumberCheckerutility {

    // Method for finding count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method for storing the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method for the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method for the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];  
        
        // Initialize the first column with digit values
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 1729;  
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Storing digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        // Sum of squares of digits
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Checking if number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number? " + isHarshad);

        // Frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit: " + frequency[i][0] + ", Frequency: " + frequency[i][1]);
            }
        }
    }
}
