import java.util.*;
//creating student class
public class Students
{
	//creating method
	public int NumberOfHandshakes(int number)
		{
			//formula
			int combination=(number*(number-1))/2;
			return combination;
		}
			public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					//creating object handshakes for class Students
					Students handshakes=new Students();
					System.out.println("Enter number of student");
					int n=sc.nextInt();
					//now calling method here by passing value
					int maximumhandsakes=handshakes.NumberOfHandshakes(n);
					System.out.println("Number of maximum handshakes"+maximumhandsakes);
				}
}				