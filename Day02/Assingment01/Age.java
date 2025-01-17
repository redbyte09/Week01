import java.util.Scanner;
public class Age
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //new scaaner object
        int age = sc.nextInt();
        //age should be equal and greater then 18
        if(age>=18)
        {
            System.out.println("The persons age is "+age+"and can vote");
        }
        else{
            System.out.println("The persons age is "+age+"and cannot vote");
        }
    }
}