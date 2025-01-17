import java.util.Scanner;
public class CountDown
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int counter=sc.nextInt();
    //checking counter sholud be greater then 0
    while(counter>0)
    {
        System.out.println("Value of counter"+counter);
        counter--;
    }
 }
}