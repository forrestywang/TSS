package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Starts_Or_Ends_With
// Create a Starts_Or_Ends_With application that prompts the user for two Strings, then determines if the second String
// appears in the beginning or end of the first String. Do not use any iterative statements, or recursion.

// Import(s):
import java.util.Scanner;

public class Starts_Or_Ends_With {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter a String: ");
        String line = myScanner.nextLine();

        System.out.println("Enter a substring: ");
        String subString = myScanner.nextLine();

        myScanner.close();

        // Calculations:
        String startOfLine = line.substring(0, subString.length());
        String endOfLine = line.substring(line.length() - subString.length());

        if (subString.equals(startOfLine) || subString.equals(endOfLine)) {System.out.println("\"" + line + "\" starts, or ends with \"" + subString + "\"");}

        else {System.out.println("\"" + line + "\" does not start, or end with \"" + subString + "\".");}
    }
}