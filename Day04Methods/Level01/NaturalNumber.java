import java.util.*;
// creating class with name NaturalNumber
public class NaturalNumber {
    // creating method named Sum
    public int Sum (int num)
    {
        // using loop for calculating sum
        int loopSum = 0;
        for(int i=1;i<=num;i++)
        {
            loopSum += i;
        }
        return loopSum;
    } 
    
    public static void main(String[] args) {
        // creating object for class
        NaturaNumber number=new NaturaNumber();
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.println("Enter a number");
        int num = sc.nextInt();
        // calling method using object
        int result=number.Sum(num);
        System.out.println("Sum of natural numbers"+result);
        sc.close(); // Close the scanner
    }
}
