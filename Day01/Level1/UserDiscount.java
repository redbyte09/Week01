import java.util.*;
public class UserDiscount
	{
		public static void main(String[] args)
			{
			    //using this for taking user input
			    Scanner sc=new Scanner(System.in);
				
				int fee=sc.nextInt();
				int discountPercent=sc.nextInt();
				//this will calculate how much discount we are getting;
				double discountPrice =(fee*discountPercent)/100.0;
				//this will explain the final discount;
				double discountedAmount=fee-discountPrice;
				System.out.println("The discount amount is INR" +discountPrice +"and final discounted fee is INR" +discountedAmount);
			}
	}		
				
				
