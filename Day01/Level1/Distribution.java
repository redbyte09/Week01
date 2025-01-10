public class Distribution
	{
		public static void main(String[] args)
			{
				int numberOfPens=14;
				int numberOfStudents=3;
				// Modulus Operator (%) uses to find the reminder.
				//it will give each students having same number of pens.

				int perPenStudent=14/3;
				int remainingPens=14%3;
				System.out.println("The Pen Per Student is " +perPenStudent +"and the remaining pen not distributed is" +remainingPens);
			}	
	}		