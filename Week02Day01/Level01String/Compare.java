import java.util.*;
//created a class 
public class Compare {
    //creating a bool method 
        public static boolean isCharEqual(String str1, String str2) {
            //checking if string lengths are same or not
            if (str1.length() != str2.length()) {
                return false;
            }
            //using loop to check character specific positions
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking inputs
        System.out.println("Enter first string:");
        String str1 = sc.next();
        System.out.println("Enter second string:");
        String str2 = sc.next();
        //calling method here
        boolean result = Compare.isCharEqual(str1, str2);
        //using inbuilt function here
        boolean result2 = str1.equals(str2);
        //checking strings here
        if (result == result2) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Both methods give different results.");
        }

        sc.close();
    }
}
