public class NumberCheckerUtility2 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(storeDigits(square));
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        int product = 1;
        for (int digit : digits) {
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Helper methods
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int primeNumber = 29;
        int neonNumber = 9;
        int spyNumber = 123;
        int automorphicNumber = 25;
        int buzzNumber = 27;

        System.out.println("Is " + primeNumber + " a prime number? " + isPrime(primeNumber));
        System.out.println("Is " + neonNumber + " a neon number? " + isNeonNumber(neonNumber));
        System.out.println("Is " + spyNumber + " a spy number? " + isSpyNumber(spyNumber));
        System.out.println("Is " + automorphicNumber + " an automorphic number? " + isAutomorphicNumber(automorphicNumber));
        System.out.println("Is " + buzzNumber + " a buzz number? " + isBuzzNumber(buzzNumber));
    }
}
