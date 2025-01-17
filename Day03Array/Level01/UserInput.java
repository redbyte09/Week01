import java.util.*;
public class UserInput
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //initializing array with size 5
        int [] num=new int[5];
        //creating array
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter elements in array::"+(i+1));
            num[i]=sc.nextInt();
         }
         for(int i=0;i<5;i++)
         {
            //checks if numbers are negative, positive,equal
            if(num[i]<0)
            {
                System.out.println("Number is negative");
            }
            if(num[i]>=0)
            {
                System.out.println("Numbner is positive");
                //number is even odd
                if(num[i]%2==0)
                {
                    System.out.println("number is even");
                }
                else{
                    System.out.println("number is odd");
                }
            }
            if(num[i]==0)
            {
                System.out.println("number is zero");
            }
         }
         //compairing first number and last number
         if(num[0]>num[4])
         {
            System.out.println("First element is greater");
         }
         else if (num[0]<num[4])
         {
            System.out.println("First number is lesser");
         }
         else if (num[0]==num[4]) 
         {
            System.out.println("Number is equal");
         }
    }
}