import java.util.*;
//creating class
public class LargestSmallest {
    //creating static method here

    public static int[] findSmallestAndLargest(int number1, int number2, int number3)
    {
        //taking result variable name array with size 2
        int[] result=new int[2];
        //declaring smallest =number1
       int smallest=number1;
       //using condition to update value if smallest find something else
        if(number2<smallest)
        {
            smallest=number2;
        }
        if(number3<smallest)
        {
            smallest=number3;
        }
        //using condition again for largest value by initializing
        int largest=number1;
        if(number2>largest)
        {
            largest=number2;
        }
        if(number3>largest)
        {
            largest=number3;
        }
        //storing values in result 
         result[0]=smallest;
         result[1]=largest;
         return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //taking user input
        System.out.println("Enter first number");
        int number1=sc.nextInt();
        System.out.println("Enter second number");
        int number2=sc.nextInt();
        System.out.println("Enter third number");
        int number3=sc.nextInt();
        //calling method without using object because we used static
        int[]result=findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest number"+result[0]);
        System.out.println("Largest number"+result[1]);
        sc.close();
    }
}