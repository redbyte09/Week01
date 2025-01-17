import java.util.*;

public class Spring {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // input  day and month
        int day = sc.nextInt();
        int month = sc.nextInt();

        // Checking conditions for spring season (from March 20th to June 20th)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It is spring season");
        } else {
            System.out.println("Not spring season");
        }
        sc.close();
    }
}
