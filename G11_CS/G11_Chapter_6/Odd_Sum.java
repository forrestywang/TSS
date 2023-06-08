package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Odd_Sum
// Create an Odd_Sum application that prompts the user for a number and then sums the odd numbers from 1 to the number
// entered.

// Imports:
import java.util.*;

public class Odd_Sum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a number: ");
        int maximum = myScanner.nextInt();
        myScanner.close();

        int sum = 0;

        // Calculations:
        for (int i = 1; i <= maximum; i += 2) {
            sum += i;
        }

        // Output:
        System.out.println(sum);
    }
}