import java.util.*;
public class EvenOdd
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>0)
    {
        for(int i =1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"is a even number");
            }
            else{
                System.out.println(i+"odd number");
            }
        }
    }
    }
}