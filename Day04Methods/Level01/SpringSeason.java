import java.util.*;
// creating class SpringSeason
public class SpringSeason {
    //creating method
    public boolean isSpring(int day,int month)
    {
        // Checking conditions for spring season (from March 20th to June 20th)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
           return true;
        } else {
            return false;
        } 
    }
    public static void main(String[] args) {
        // creating object
        SpringSeason spring=new SpringSeason();
        Scanner sc = new Scanner(System.in);
        // input  day and month
        int day = sc.nextInt();
        int month = sc.nextInt();
        //calling method using object
        boolean result =spring.isSpring(day, month);
        //checking the output
        if(true)
        {
            System.out.println("It is Spring");
        }
        else
        {
            System.out.println("It is not Spring");
        }
         sc.close();
    }
}
