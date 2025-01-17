import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner initialization
        int number = sc.nextInt(); // Get user input
        
        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? YES");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? NO");
        }

        sc.close(); // It's a good practice to close the scanner after use
    }
}
