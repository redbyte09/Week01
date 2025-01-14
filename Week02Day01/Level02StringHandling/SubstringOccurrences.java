import java.util.Scanner;
//creating class here
public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking user input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter substring to find: ");
        String subStr = scanner.nextLine();
        //initializing count and index from 0
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index++;
        }
        
        System.out.println("Substring occurs " + count + " times.");
    }
}
