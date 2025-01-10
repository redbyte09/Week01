public class ProfitLoss
	{
		public static void main(String[] args)
			{
				double costPrice= 129;
				double sellingPrice=191;
				double profit=sellingPrice-costPrice;
				double profitPercentage=(profit/costPrice)*100;
				System.out.println("The CostPrice is INR" +costPrice +"Selling Price is INR" +sellingPrice);
				System.out.println("The Profit is INR" +profit + "ProfitPercentage is INR" +profitPercentage);
			}
	}			