import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store age and height 
        int[] age = new int[3];
        double[] height = new double[3];

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // User input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            age[i] = scanner.nextInt();

            System.out.println("Enter the height of " + names[i] + " (in cm): ");
            height[i] = scanner.nextDouble();
        }

        // youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //youngest and tallest friends
        System.out.println("The youngest friend is: " + names[youngestIndex] + " with age: " + age[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height: " + height[tallestIndex] + " cm");
    }
}
