import java.util.Arrays;
import java.util.Scanner;
//creating class here
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking inputs
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        //creating two array here 1 and 2
        //and storing values of string in array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        //sorting arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        //checking both array are equal or not
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
