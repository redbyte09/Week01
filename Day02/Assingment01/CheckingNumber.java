import java.util.Scanner;
public class CheckingNumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //checking for positive number
        if(num>=0)
        {
            System.out.println(" positive");
        }
        //checking for negative
        if(num<0){
            System.out.println("negative");
        }
        if(num==0)
        //checking for zero {
            System.out.println("Zero");
        }
    }
