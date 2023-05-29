package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Digits_Part_2
// Create a digits application that prompts the user for a three-digit number and then displays the ones-place,
// tens-place, and hundreds-place digits.

// Imports:
import java.util.*;

public class Digits_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your three-digit number: ");
        int number = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int onesDigit = number % 10;
        int hundredsDigit = number / 100;
        int tensDigit = (number - onesDigit - hundredsDigit * 100) / 10;

        // Output:
        System.out.println("For the number " + number + ", the ones-place digit is " + onesDigit +
                " , the tens-place digit is " + tensDigit + " , and the hundreds-place digit is " + hundredsDigit + ".");
    }
}
