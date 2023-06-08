package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Sum_Of_Digits
// Create a Sum_Of_Digits application that prompts the user for a positive integer and outputs the sum of its digits.

// Import(s):
import java.util.*;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        int sum = 0;

        System.out.println("Enter a positive integer: ");
        int integer = myScanner.nextInt();
        myScanner.close();

        System.out.print("The sum of the digits in " + integer + " is ");

        // Calculations:
        while (integer / 10.0 != 0) {
            sum += integer % 10;
            integer /= 10;
        }

        // Output:
        System.out.print(sum + ".");
    }
}