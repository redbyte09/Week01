import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        
        //  temperature input in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        //  result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
