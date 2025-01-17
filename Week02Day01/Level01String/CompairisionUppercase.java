import java.util.*;
//generated a class
public class CompairisionUppercase {
    //creating method here
    public static char[] convertToCharArray(String str)
    {
        //creating Stringbuilder class 
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            //checking if character is in lowercase
            char ch=str.charAt(i);
            if(ch>='a' &&ch<='z')
            {
                //converting number got by (ch-32) to char 
                ch=(char)(ch-32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean isComparision(String str1,String str2)
    {
        if(str1.length()!=str2.length()){
        return false;
    }
    for(int i=0;i<str1.length();i++)
    {
        if(str1.charAt(i)!=str2.charAt(i))
        {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //user input
        System.out.println("Enter a string");
        String str=sc.next();
        //calling methods
        char[] result=convertToCharArray(str);
        String result2=str.toUpperCase();
        if(isComparision(str, result2))
        {
            System.out.println("Both method prints same");
        }
        else
        {
            System.out.println("Bpth method gives different result");
        }
        sc.close();
    }
}