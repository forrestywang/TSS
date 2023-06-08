package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Remove_HTML_Tag
// Create a Remove_HTML_Tag application that prompts the user for a lien of HTML code, and removes any HTML tags.

// Import(s):
import java.util.*;

public class Remove_HTML_Tag {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a line of HTML code: ");
        String line = myScanner.nextLine();
        int lineLength = line.length();

        myScanner.close();

        // Calculations:
        if (line.charAt(0) == '<' && line.charAt(lineLength - 1) == '>') {
            for (int i = 1; i < lineLength; i++) {
                if (line.charAt(i) == '>' && line.charAt(lineLength - i - 2) == '<') {
                    System.out.println(line.substring(i + 1, lineLength - i - 2));
                    break;
                }
            }
        }

        else {System.out.println(line);}
    }
}