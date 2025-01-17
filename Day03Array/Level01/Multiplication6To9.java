import java.util.*;
public class Multiplication6To9
{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    //initializing array with size 4
    int [] multiplicationResult=new int[4];
    for(int i=0;i<4;i++)
    {
        //stroring reult in this multiplicationResult variable
        //using this number*(i+6) because i=0 starting so adding 6
        //will make it 6 and this is what we need
        multiplicationResult[i]=number*(i+6);
    }
    System.out.println("Multiplication table for " + number + " from 6 to 9:");
     for (int i = 0; i < 4; i++)
    {
        System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
    }
   }

}