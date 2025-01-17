import java.util.Random;
// creating class here
public class FootBallTeam {

    // creating method with initializing array of name height
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method for mean height of the players
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method for shortest height of the players
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method for tallest height of the players
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generating random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);  // Random height between 150 and 250
        }

        //  heights of the players
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println();

        //  shortest, tallest, and mean height
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);
        double mean = findMeanHeight(heights);

        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }
}
