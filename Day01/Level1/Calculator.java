import java.util.*;
	public class Calculator
		{
			public static void main(String[] args)
				{
					//taking inputs
				    Scanner sc=new Scanner(System.in);
					//user input number 1
					float number1=sc.nextFloat();
					//user input number 2
					float number2=sc.nextFloat();
					//now calculting add,sub,division,multi
				    System.out.println("sum" +(number1+number2));
					System.out.println("subtraction" +(number1-number2));
					System.out.println("multiplication" +(number1*number2));
					System.out.println("divison" +(number1/number2));
				}
		}		