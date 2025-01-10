 import java.util.*;
 public class NaturalNumber
 {
    public static void main(String[] args) {
        // new scaaner object
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        int sum;
        //checking number is greater then 0 or not
        if(number>0)
        {
            sum=number*(number+1)/2;
            System.out.println("The sum of natural number is"+sum);
        }
        else{
            System.out.println("The number is not a natural number");
        }
    }
 }
