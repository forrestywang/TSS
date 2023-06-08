package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// Display_Box_Part_2
// Modify the Display_Box application to ask the user if a specific character should be used for the display. For
// example, the prompt could be "Do you want to enter a character to display the box? (Enter "1" for yes; enter 0 for
// no): " If the user types "y", then prompt the user for the character. Otherwise, an asterisk is used. The modified
// application should contain overloaded drawBox() and drawBar() methods.

// Imports:
import java.util.*;

public class Display_Box_Part_2 {

    /**
     * Pre-condition: Requires the value of length, and character. Length >= 1.
     * Post-condition: Output a line of characters length long.
     */
    public static void drawBar(int width, int length, String character) {
        // Output:
        for (int i = 0; i < length && width > 0; i++) {System.out.print(character);}

        System.out.println("");
    }

    /**
     * Pre-condition: Requires the value of width, length, and character. Length >= 3.
     * Post-condition: Output a the sides of the rectangle.
     */
    public static void drawBox(int width, int length, String character) {
        // Output:
        for (int a = 0; a < width - 2 && length > 0; a++) {
            System.out.print(character);

            for (int i = 0; i < length - 2; i++) {System.out.print(" ");}

            if (length > 1) {System.out.print(character);}

            System.out.println();
        }
    }

    /**
     * Pre-condition: Requires the value of length, and character. Length >= 1.
     * Post-condition: Output a rectangle.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the length of your rectangle: ");
        int length = myScanner.nextInt();
        System.out.println("Enter the width of your rectangle: ");
        int width = myScanner.nextInt();
        System.out.println("Do you want to enter a character to display the box? (Enter 1 for yes; enter 0 for no): ");
        System.out.println("If you do not want a character to display the box, asterisks will be used instead.");
        byte customCharacterOption = myScanner.nextByte();

        // Output:
        if (customCharacterOption == 1) {
            // Variables:
            System.out.println("Enter the character to display the box: ");
            String character = myScanner.next();

            myScanner.close();

            // Output:
            drawBar(width, length, character);
            drawBox(width, length, character);
            if (width > 1) {drawBar(width, length, character);}
        }
        else {
            // Output:
            drawBar(width, length, "*");
            drawBox(width, length, "*");
            if (width > 1) {drawBar(width, length, "*");}
        }
    }
}