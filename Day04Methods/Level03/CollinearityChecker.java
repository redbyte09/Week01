public class CollinearityChecker {

    // Method checking collinearity using the slope formula
    public static boolean arePointsCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean arePointsCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate area
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        
        // Points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample points
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // collinearity using slope
        boolean collinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Points are collinear using slope formula: " + collinearUsingSlope);

        // collinearity using area of triangle f
        boolean collinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Points are collinear using area formula: " + collinearUsingArea);
    }
}
