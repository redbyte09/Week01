import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create a 2D array 
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // input
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int totalMarks = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                // Validate for positive marks
                while (marks[i][j] < 0) {
                    System.out.print("Please enter a positive value: ");
                    marks[i][j] = sc.nextInt();
                }

                totalMarks += marks[i][j];
            }

            // Calculate percentage
            percentages[i] = (totalMarks / 3.0);
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        //Display results
        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }

        sc.close();
    }
}