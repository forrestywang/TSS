package G11_Chapter_4;

// @author Forrest Wang
// March 15th, 2021
//
// Digits_Part_1
// Create a digits application that prompts the user for a two-digit number and then displays the ones-place and
// tens-place digits.

// Imports:
import java.util.*;

public class Digits_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your two-digit number: ");
        int number = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int onesDigit = number % 10;
        int tensDigit = number / 10;

        // Output:
        System.out.println("For the number " + number + ", the ones-place digit is " + onesDigit + " and the tens-place digit is " + tensDigit + ".");
    }
}