import java.util.*;
public class MultiplicationArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    //initializing array with size 10
    int[] multiplication=new int[10];
    for(int i=1;i<=10;i++)//creating array
    {
        //taking this because our array start from zero
        //but i=1 so we have to subtract 1 from
        //assing value to make it 0
        //and it will store value in multiplcation from 0
        multiplication[i-1]=number*i;
    }
    for(int i =1;i <=10;i++)
    {
        System.out.println(number+"*"+multiplication[i-1]);
    }
    }
 }