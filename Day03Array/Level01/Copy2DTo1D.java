import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        // 2D array (Matrix)
        int[][] matrix = new int[rows][cols];
        
        // Take user input 
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Create a 1D array 
        int[] array = new int[rows * cols];
        
        // Copy elements from 2D array to the 1D array
        int index = 0; // Index for 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j]; // Copy 
                index++; 
            }
        }
        
        //  1D array
        System.out.println("The elements copied to the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
