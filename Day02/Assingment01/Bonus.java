import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt(); // Input for salary
        
        System.out.print("Enter the years of service: ");
        int year = sc.nextInt(); // Input for years of service
        
        if (year > 5) { // Check if years of service is more than 5
            int bonus = (salary * 5) / 100; // Calculate 5% bonus
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus as the service is less than or equal to 5 years.");
        }
        
        sc.close(); // Close the scanner
    }
}
