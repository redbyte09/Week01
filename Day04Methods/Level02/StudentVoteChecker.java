import java.util.*;

public class StudentVoteChecker {

    // creating method
    public boolean canStudentVote(int age) {
        //  return false if it's negative
        if (age < 0) {
            return false;
        }
        // Check if the age is greater than or equal to 18
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();  // Create an object 

        // Define an array
        int[] ages = new int[10];

        // using loop to take input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();  

            //calling method using object
            boolean canVote = checker.canStudentVote(ages[i]);

            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();  // Close the scanner 
    }
}
