import java.util.*;
//creating class here
public class UserAndCharArray
{
    //generating method here
    public static char[] inputString(String str)
    {
        char[] result=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            result[i]=str.charAt(i);
        }
        return result;
    }
    //creating one more method here for comparing
    public static boolean isCompareString(char[] str1,char[] str2)
    {
        
        for (int i = 0; i < str2.length; i++) {
            if(str1[i] != str2[i]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input here
        System.out.println("Enter string ");
        String str=sc.next();
        char[] result = inputString(str);
        char[] result2 =str.toCharArray();
        //calling method here
        if(isCompareString(result, result2))
        {
            System.out.println("Both Method will give same output");
        }
        else{
            System.out.println("Both method will not give same output");
        }

    }
}