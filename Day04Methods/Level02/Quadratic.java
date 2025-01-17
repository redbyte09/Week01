import java.util.*;
//creating class
    public class Quadratic {
       //creating static method here
        public static double [] findroots(double a,double b,double c)
        {
            //using Math.pow function for powers
            double delta=Math.pow(b,2)+4*a*c;
            //checking conditions and putting values in array
            if(delta>0)
            {
                double x1=(-b+Math.sqrt(delta))/(2*a);
                double x2=(-b-Math.sqrt(delta))/(2*a);
                return new double[]{x1,x2};

            }
            else if(delta==0)
            {
                double x1=-b/(2*a);
                return new double[] {x1};
            }
            else
            {
                System.out.println("Empty array or nothing");
                return new double[] {};
            }

        }
        public static void main(String[] args) {
            //taking inputs
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of a");
            double a=sc.nextDouble();
            System.out.println("Enter value of b ");
            double b=sc.nextDouble();
            System.out.println("Enter value of c");
            double c=sc.nextDouble();
            //calling method here
            double[] roots=findroots(a, b, c);
            //checking conditions here and assinging values in the array
            if(roots.length==2)
            {
                System.out.println("Two different roots");
                System.out.println("Root1:" +roots[0]);
                System.out.println("Root2:" +roots[1]);
            }
            else if (roots.length==1)
            {
                System.out.println("Reapeted");
                System.out.println("Root" +roots[0]);
            }
            else
            {
                System.out.println("No real roots");
            }
            sc.close();
            
        }
    }
