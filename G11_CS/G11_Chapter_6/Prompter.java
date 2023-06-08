package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Prompter
// Create a Prompter application that prompts the user for two numbers. The first number is a minimum value and the
// second is a max value. Prompter then prompts the user for a number between teh minimum and maximum numbers entered.
// The user should be continually prompted until a number within the range is entered. Be sure to include teh min and
// max numbers in the prompt.

// Imports:
import java.util.*;

public class Prompter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables
        System.out.println("Enter a minimum value: ");
        int minimum = myScanner.nextInt();
        System.out.println("Enter a maximum value: ");
        int maximum = myScanner.nextInt();
        int number;

        do {
            System.out.println("Enter a number between " + minimum + " and " + maximum + ": ");
            number = myScanner.nextInt();
        } while (number < minimum || number > maximum);

        myScanner.close();
    }
}