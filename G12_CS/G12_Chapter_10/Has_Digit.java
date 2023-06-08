package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Has_Digit
// Create a Has_Digit application that prompts the user for a String, and determine if it is only composed of digits.

// Import(s):
import java.util.Scanner;

public class Has_Digit {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        int counter = 0;

        System.out.println("Enter a String: ");
        String line = myScanner.nextLine();

        myScanner.close();

        // Calculations:
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                System.out.println("The String does not contain only digits.");
                break;
            }

            else if (i == line.length() - 1 && counter == line.length() - 1) {System.out.println("The String contains only digits.");}

            else if (Character.isDigit(line.charAt(i))) {counter++;}

        }
    }
}