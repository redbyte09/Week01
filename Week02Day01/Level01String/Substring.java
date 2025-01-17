import java.util.*;
public class Substring {
     //created a class with parameters
    public static String  substringUsingCharAt(String str,int start,int end)
    {
        //created empty Stringbuilder object named substring
        StringBuilder substring=new StringBuilder();
        for(int i=start;i<end;i++)
        {
            //appending means adding the string in our substring
            substring.append(str.charAt(i));
        }
        //it converts stringbuilder object into the string because in strinbuilder characters will be stored 
        //and toString() will convert that individual characters in string
        return substring.toString();
        
    }
       //method for checking strings getting by manually and by function
    public static boolean CompareString(String str1,String str2)
    {
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //user inputs here
        System.out.println("Enter string");
        String str=sc.next();
        System.out.println("Enter value of start");
        int start=sc.nextInt();
        System.out.println("Enter value of end");
        int end=sc.nextInt();
        //calling methods here
        String result=substringUsingCharAt(str, start, end);
        String result2=str.substring(start,end);
        if(CompareString(result,result2))
        {
            System.out.println("BOth are same");
        }
        else{
            System.out.println("Not same");
        }
    }
    
    
}