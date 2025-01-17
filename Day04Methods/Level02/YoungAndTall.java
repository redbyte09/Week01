import java.util.Scanner;

public class YoungAndTall {
    
    // Method to find the youngest 
    //(int[] ages) means creating array of int with name ages
    public static String findYoungest(int[] ages) {
        //assign minAge=ages[0] and choose one friend youngest
        //then use if else to check condition and acco. to it change name
        int minAge = ages[0];
        String youngestFriend = "Amar";
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                if (i == 1) {
                    youngestFriend = "Akbar";
                } else if (i == 2) {
                    youngestFriend = "Anthony";
                }
            }
        }
        return youngestFriend;
    }
    
    // Method to find the tallest among the friends
    public static String findTallest(double[] heights) {
        //same before approch use with height
        double maxHeight = heights[0];
        String tallestFriend = "Amar";
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                if (i == 1) {
                    tallestFriend = "Akbar";
                } else if (i == 2) {
                    tallestFriend = "Anthony";
                }
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store age and height 
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // user input for ages and heights 
        System.out.println("Enter the age and height of Amar:");
        ages[0] = sc.nextInt();
        heights[0] = sc.nextDouble();
        
        System.out.println("Enter the age and height of Akbar:");
        ages[1] = sc.nextInt();
        heights[1] = sc.nextDouble();
        
        System.out.println("Enter the age and height of Anthony:");
        ages[2] = sc.nextInt();
        heights[2] = sc.nextDouble();
        
        // Find the youngest and the tallest
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        //  results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        
        sc.close();
    }
}
