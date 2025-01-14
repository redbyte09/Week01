import java.util.*;
// creating class with name QuotientRemainder
public class QuotientRemainder {
    //creating method with static keyword with parameter number and divisor
    public static int[] findRemainderAndQuotient(int number, int divisor)
    {
        //creating an array with name division and size 2
        int[] division=new int[2];
        //using / for Quotient
        int quotient = number / divisor;
        //using % for Remainder
        int remainder = number % divisor;
        //storing values in an array 
        division[0]=quotient;
        division[1]=remainder;
        return division;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        //user input
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        //calling method without using object
        int [] division=findRemainderAndQuotient(num1, num2);
        System.out.println("Quotient is"+division[0]);
        System.out.println("Remainder is"+division[1]);
        sc.close();
        
    }
}
