import java.util.*;
public class Handshakes
	{
		public static void main(String[] args)
			{
			    Scanner sc=new Scanner(System.in);
				int NumberOfStudent=sc.nextInt();
				//combination for hand shakes
				int PossibleHandshakes=(NumberOfStudent*(NumberOfStudent-1))/2;
				System.out.println("number of possible handshakes" +PossibleHandshakes);
			}
	}		