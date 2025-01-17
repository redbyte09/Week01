import java.util.*;
public class HarshadNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        //using while loop here
        while(n!=0)
        {
            //taking last digit
           int digit=n%10;
            sum +=digit;
            //removing last digit
            n= n/10;
        }
        if(n%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}