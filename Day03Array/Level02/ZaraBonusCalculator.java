import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to store salary, years of service, new salary, and bonus
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to track total bonus, old salary, and new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            // Input for salary and years of service
            while (true) {
                System.out.println("Enter salary for employee " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    salary[i] = scanner.nextDouble();
                    if (salary[i] > 0) {
                        break;
                    } else {
                        System.out.println("Salary must be greater than 0. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid salary! Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            while (true) {
                System.out.println("Enter years of service for employee " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] >= 0) {
                        break;
                    } else {
                        System.out.println("Years of service cannot be negative. Please enter again.");
                    }
                } else {
                    System.out.println("Invalid years! Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        // Loop to calculate bonus and new salary, and calculate total payout
        for (int i = 0; i < 10; i++) {
            // Determine bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update total bonus and salary amounts
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the total bonus payout, old salary, and new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
