import java.util.*;
    public class Triangle
    {
        //creating method here
        public int rounds (int side1,int side2,int side3)
        {
        int perimeter=side1+side2+side3;//summing the sides
        int  TotalDistance=5000;//in meters
        //using formula for round
        int round =TotalDistance/perimeter;
        return round;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //creating object for class
        Triangle park=new Triangle();
        //taking user input
        System.out.println("Enter first side");
        int s1=sc.nextInt();
        System.out.println("Enter second side");
        int s2=sc.nextInt();
        System.out.println("Enter third side");
        int s3=sc.nextInt();
        //calling method using object
        int TotalRounds=park.rounds(s1, s2, s3);
        System.out.println("Number of rounds "+TotalRounds);


    }
}