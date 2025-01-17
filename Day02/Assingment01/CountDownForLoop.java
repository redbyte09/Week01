import java.util.Scanner;

public class CountDownForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input for counter
        int counter = sc.nextInt();

        // For loop to print countdown
        for (int i = counter; i > 0; i--) {
            System.out.println("Value of counter: " + i);
        }

        // Close the scanner
        sc.close();
    }
}
