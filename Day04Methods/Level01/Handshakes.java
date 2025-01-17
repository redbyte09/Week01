import java.util.*;
//creating class
public class Handshakes {
    
    //creating method
    public int Handnumber(int number) {
        //calculating combination
        int combination = (number * (number - 1)) / 2;
        return combination;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating object for class
        Handshakes number = new Handshakes();
        System.out.println("Enter number of Students");
        //taking input for student number
        int n = sc.nextInt();
        //calling method using object
        int MaximumNumber = number.Handnumber(n);
        System.out.println("Maximum handshakes " + MaximumNumber);
        
        sc.close(); //closing the scanner
    }
}
