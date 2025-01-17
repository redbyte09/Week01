import java.util.Scanner;

public class LeapYear {
     //created method
    // checking year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) { 
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;  // Year is a leap year
            } else {
                return false;  // Year is not a leap year
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
            return false;  // Invalid year for the leap year check
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
