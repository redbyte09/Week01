import java.util.*;
public class AreaOfTriangle
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				double Base=sc.nextDouble();
				double Height=sc.nextDouble();
				Double Area=(1*Base*Height)/2;
				double AreaInch=Area/2.54;
				double AreaFeet=Area/30.48;
				System.out.println("Your Area in cm is" +Area +"while in feet is" +AreaFeet +"and inches is" +AreaInch);
	}		}	