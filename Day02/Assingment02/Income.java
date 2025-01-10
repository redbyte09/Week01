import java.util.*;

public class Income {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        
        // Take input for salary
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        // Take input for bonus
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        
        // Calculate total income
        double totalIncome = salary + bonus;
        
        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
    }
}
