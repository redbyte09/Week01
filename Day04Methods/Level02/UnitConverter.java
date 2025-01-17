public class UnitConverter {

    // created method
    // converting yard to feet
    public static double YardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // converting feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // converting meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // converting inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // converting inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        double yards = 5.0;
        double feet = YardsToFeet(yards);  // Correct method call
        System.out.println(yards + " yards is " + feet + " feet.");

        double feetToConvert = 10.0;
        double yardsConverted = convertFeetToYards(feetToConvert);
        System.out.println(feetToConvert + " feet is " + yardsConverted + " yards.");

        double meters = 2.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is " + inches + " inches.");

        double inchesToConvert = 20.0;
        double metersConverted = convertInchesToMeters(inchesToConvert);
        System.out.println(inchesToConvert + " inches is " + metersConverted + " meters.");

        double inchesForCm = 12.0;
        double centimeters = convertInchesToCm(inchesForCm);
        System.out.println(inchesForCm + " inches is " + centimeters + " centimeters.");
    }
}
