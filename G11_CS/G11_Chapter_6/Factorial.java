package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Factorial
// Create a Factorial application that prompts the user for a number and then displays its factorial. The factorial of a
// number is the product of all the positive integers from 1 to the number.

// Imports:
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a number: ");
        int maximum = myScanner.nextInt();
        myScanner.close();

        int sum = 1;

        // Calculations:
        for (int i = 1; i <= maximum; i++) {
            sum *= i;
        }

        // Output:
        System.out.println(sum);
    }
}