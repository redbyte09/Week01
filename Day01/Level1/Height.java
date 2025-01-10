import java.util.*;
public class Height
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int height=sc.nextInt();//taking height in cm
				//converting cm height in inch;
				double inch = height/2.54;
				//converting inches in feet2
				double feet = inch/12;
				System.out.println("Your Height in cm is "+height + "while in feet is" +feet+ "and inches is" +inch);
			}
	}		