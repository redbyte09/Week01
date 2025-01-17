import java.util.Scanner;
//created class here
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking user input here
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();
        //using in-built function replaceAll
        String exchange = sentence.replaceAll(oldWord, newWord);
        
        System.out.println("Modified Sentence: " + exchange);
    }
}
