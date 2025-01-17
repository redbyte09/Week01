import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        // Check if three command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide three arguments: month (m), day (d), and year (y).");
            return;
        }

        try {
            // Parse input arguments
            int m = Integer.parseInt(args[0]); // month
            int d = Integer.parseInt(args[1]); // day
            int y = Integer.parseInt(args[2]); // year

            // Validate month and day range
            if (m < 1 || m > 12 || d < 1 || d > 31) {
                System.out.println("Invalid date input. Month should be between 1 and 12, and day should be between 1 and 31.");
                return;
            }
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + 31 * m0 / 12) % 7;

            // Output the day of the week
            System.out.println("The day of the week is: " + d0);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values for month, day, and year.");
        }
    }
}
