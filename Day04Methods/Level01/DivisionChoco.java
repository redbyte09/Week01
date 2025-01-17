import java.util.Scanner;
// creating class
public class DivisionChoco {
    //creating static method here
    public static int[] findRemainderAndQuotient(int number, int divisor) 
{
    // creating Choco name array 
    int []Choco=new int[2];
    // finding quotient and remainder
    int chocolatesPerChild = number / divisor;
    int remainingChocolates =number % divisor;
    // adding elements 
    Choco[0]=chocolatesPerChild;
    Choco[1]=remainingChocolates;
    return Choco;
        
}
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Take input for number of chocolates and number of children
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        // calling method here
        int [] choco=findRemainderAndQuotient(chocolates,children);
        System.out.println("Enter chocalates per child"+choco[0]);
        System.out.println("Enter remaining chocalates"+choco[1]);
        sc.close();
    }
}
