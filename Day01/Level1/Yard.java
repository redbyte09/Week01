import java.util.*;
public class Yard
	{
		public static void main(String[] arga)
			{	
				Scanner sc=new Scanner(System.in);
				double distance=sc.nextDouble();//user input in feets(1 foot=12inches)
				double distanceInCm=distance*30.48;//convert foot in cm is 30.48
				double distanceInInches=distance*12;//convert foot in inches 
				System.out.println("Your Height in cm is "+distanceInCm +"while in feet"+distance +"and inches is"+distanceInInches);
			}
	}		