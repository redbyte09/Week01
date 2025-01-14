import java.util.Scanner;
public class CheckingNumber
{
   public int Checking(int num)
 {
    //checking for positive number
    if(num>0)
    {
        return 1;
    }
    //checking for negative
    if(num<0){
        return -1;
    }
    //checking for zero 
    else{
        return 0;
    }
 }   
    public static void main(String[] args) {
        CheckingNumber checking=new CheckingNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Checking number whether number is negative,positive or zero");
        int n=sc.nextInt();
        int result=checking.Checking(n);
        if(result==1)
        {
            System.out.println("The number is positive");
        }
        else if(result== -1)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
        sc.close();
        
 }
}

    
