import java.util.*;
public class Item
	{
		public static void main(String[] args)
			{
			    Scanner sc=new Scanner(System.in);
				//prize of purshaching
				double unitPrice=sc.nextDouble();
				//number of item
				int numberOfItem=sc.nextInt();
				//total=number*prize
				double TotalPrice=unitPrice*numberOfItem;
				System.out.println("The tatal purchase price is INR"+TotalPrice +"if the quantity"+numberOfItem+"and unit price is INR"+unitPrice);
			}
	}		
				
			
				