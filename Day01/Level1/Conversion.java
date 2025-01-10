import java.util.*;
public class Conversion
	{
		public static void main(String[] args)
			{
				//Takein user input for km;
				Scanner sc=new Scanner(System.in);
				//using double datatype here
				double km=sc.nextDouble();
				//converting km in miles using(1mile=1.6km)
				double miles = km/1.6;
				System.out.println("The total miles is" + miles + "for the given "+km +"km");
			}
	}		