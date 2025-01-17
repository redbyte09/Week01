import java.util.Scanner;
//create class
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        //took a reversed string type initialized it with ""
        String reversed = "";
        //using loop for reversing
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Reversed String: " + reversed);
    }
}
