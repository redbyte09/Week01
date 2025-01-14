public class NumberCheckerUtilityClass {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321; // Example number for palindrome check
        int duckNumber = 1203; // Example number for duck number check

        // Count of digits
        System.out.println("Count of digits in " + number + ": " + countDigits(number));

        // Store digits
        int[] digits = storeDigits(number);
        System.out.print("Digits of " + number + ": ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse digits
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        System.out.println("Is " + number + " a palindrome? " + isPalindrome(number));
        System.out.println("Is " + duckNumber + " a duck number? " + isDuckNumber(duckNumber));
    }
}
