import java.util.*;
public class Side
	{
		public static void main(String[] args)
			{
			//taking user inputs
				Scanner sc=new Scanner(System.in);
				double perimeter=sc.nextDouble();
				//formula of perimter of square =4*side
				//now want to find side then transfer 4 in opposite side
				double side=perimeter/4;
				System.out.println("The length of the side is" +side +"whose perimeter is"+perimeter);
			}
	}		