import java.util.Scanner;
//creating class
public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        //creating array of string and using split function
        String[] words = sentence.split(" ");
        String longestWord = "";
        //using for to check 
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest word: " + longestWord);
    }
}
