import java.util.*;
public class Principal {
    //Creating method name simpleIntersest

    public double simpleInterest( double principal,double rate,double time)
    {
        //formula of SI
        double SI=(principal*rate*time)/100;
        return SI;
    }
    public static void main(String[] args) {
        //creating object of class
        Principal myprincipal=new rincipal();
        Scanner sc=new Scanner(System.in);
        //taking user inputs 
        System.out.println("Enter principal");
        double principal=sc.nextDouble();
        System.out.println("Enter rate");
        double rate=sc.nextDouble();
        System.out.println("Enter time");
        double time=sc.nextDouble();
        //calling the method using class
        double interest=myprincipal.simpleInterest(principal,rate,time);
        System.out.println("the simple interest is "+interest+"for Principal"+principal+"Rate of Interest"+rate+"and Time"+time);

    }
}