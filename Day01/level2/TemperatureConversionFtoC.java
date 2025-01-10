import java.util.Scanner;

public class TemperatureConversionFtoC {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        
        // input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        // Output the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
