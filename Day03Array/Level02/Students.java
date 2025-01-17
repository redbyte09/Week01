import java.util.*;
public class Students
{
	public int NumberOfHandshakes(int number)
		{
			int combination=(n*(n-1))/2;
			return combination;
		}
			public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					Students handshakes=new Students();
					System.out.println("Enter number of student);
					int n=sc.nextInt();
					int maximumhandsakes=handshakes.NumberOfHandshakes(n);
				}
}				