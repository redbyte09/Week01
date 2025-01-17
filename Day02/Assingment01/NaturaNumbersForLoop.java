import java.util.*;

public class NaturaNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int formulaSum = 0; // Initialize formulaSum outside the if block
        
        if (num > 0) {
            formulaSum = num * (num + 1) / 2;
        }
        
        int loopSum = 0;
        for(int i=1;i<num;i++)
        {
            loopSum += i;
            i++;
        }
        
        System.out.println("Formula Sum: " + formulaSum);
        System.out.println("For Loop Sum: " + loopSum);
        
        if (formulaSum == loopSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods do not give the same result.");
        }

        sc.close(); // Close the scanner
    }
}
