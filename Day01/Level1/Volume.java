public class Volume
	{
		public static void main(String[] args)
			{
				int radius=6378;
				double pi=22/7;
				// applying formula to find volume;
				double volume=(4*pi*radius*radius*radius)/3;
				//converting volume (killometer)in miles;
				double miles=volume*1.6 *1.6 *1.6 ;
				System.out.println("The volume of earth in cubic killometers is" +volume + "cubic miles is" +miles);
			}
    }			
				