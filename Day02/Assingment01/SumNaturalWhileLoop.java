import java.util.*;

public class SumNaturalWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int formulaSum = 0; // Initialize formulaSum outside the if block
        
        if (num > 0) {
            formulaSum = num * (num + 1) / 2;
        }
        
        int loopSum = 0;
        int i = 1;
        while (i <= num) {
            loopSum += i;
            i++;
        }
        
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("While Loop Sum: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods do not give the same result.");
        }

        sc.close(); // Close the scanner
    }
}
