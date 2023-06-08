package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Count_Vowels
// Create a Count_Vowels application that prompts the user for a string and then displays a count of the number of
// vowels in the string.

// Imports:
import java.util.*;

public class Count_Vowels {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter text: ");
        String text = myScanner.nextLine();
        String textCapitals = text.toUpperCase();
        myScanner.close();

        int length = text.length();
        int numberVowels = 0;

        // Calculations:
        for (int indexValue = 0; indexValue < length; indexValue++) {
            char character = textCapitals.charAt(indexValue);

            if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                numberVowels++;
            }
        }

        // Output:
        System.out.println("There are " + numberVowels + " vowels in " + text + ".");
    }
}