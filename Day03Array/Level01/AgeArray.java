import java.util.*;
public class AgeArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //declaring array with size 10
        int[] age=new int [10];
        //creating object
        for(int i=0;i<age.length;i++)
        {
            //taking user input
            System.out.println("Enter age of student"+(i+1)+"::");
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++)
        { 
            //condition to check useer can vote or not
            if(age[i]<0)
            {
                System.out.println("The age"+age[i]+"is invalid");
            }
            else if(age[i]>=18)
            {
                System.out.println("The student with the age"+age[i]+"can vote");
            }
            else
            {
                System.out.println("The student with the age"+age[i]+"cannot vate");
            }
        }
    }
}