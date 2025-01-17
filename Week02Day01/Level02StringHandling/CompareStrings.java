import java.util.Scanner;
//creating class here
public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        //checking condition for equal
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println(str1.compareTo(str2) < 0 ? str1 + " comes before " + str2 : str1 + " comes after " + str2);
        }
    }
}
