import java.util.*;
public class AbundantNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++)
        {
            //checking number is divisible by i or not
            if(number%i==0)
            {
                //adding value of i in sum if condition is true
                sum=sum+i;
            }
        }
        //checking sum is greater then number or not
        if(sum>number)
        {
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not Abundant");
        }
    }

}