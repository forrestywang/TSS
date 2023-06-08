package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Remove_String
// Create a Remove_String application that prompts the user for a sentence and a string. The application should then
// remove every occurrence of the string from the sentence.

// Imports:
import java.util.*;

public class Remove_String {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a sentence: ");
        String sentence = myScanner.nextLine();
        System.out.println("Enter a string: ");
        String string = myScanner.nextLine();
        myScanner.close();

        // Output:
        System.out.println(sentence.replace(string, ""));
    }
}