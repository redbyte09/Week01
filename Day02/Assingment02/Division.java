import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Take input for number of chocolates and number of children
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        
        // Calculate chocolates per child and remaining chocolates
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        
        // Output the result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
    }
}
