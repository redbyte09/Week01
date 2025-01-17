public class LineAndDistance {

    // Method for Euclidean distance between two points
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method for equation of the line given two points
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1); // Calculate the slope (m)
        double yIntercept = y1 - slope * x1;           // Calculate the y-intercept (b)
        return new double[]{slope, yIntercept};        // Return the slope and y-intercept
    }

    public static void main(String[] args) {
        // Sample points
        int x1 = 3, y1 = 4;
        int x2 = 7, y2 = 10;

        // Calculate and show the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
