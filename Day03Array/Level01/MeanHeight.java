import java.util.*;
public class MeanHeight {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //initializing array of heights with size 11
        double []heights=new double[11];
        for(int i=0;i<11;i++)
        {
            //taking user input
            heights[i]=sc.nextDouble();
        }
        //initializing summ=0.0
        double sum=0.0;
        for(int i=0;i<11;i++)
        {
            //summing heights in sum
             sum=heights[i]+sum;
         }
        System.out.println("Sum"+sum);
        //mean formula sum divided by number of things
        double mean=sum/11;
        System.out.println("The mean height of the football team is"+mean);
    }
}