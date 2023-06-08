package G11_Chapter_6;

// @author Forrest Wang
// April  10, 2021
//
// Greatest_Common_Divisor
// Create a Greatest_Common_Divisor application that finds the greatest common divisor of two numbers using Euclid's
// algorithm.

// Imports:
import java.util.*;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the first number (positive integer): ");
        int number1 = myScanner.nextInt();
        System.out.println("Enter the second number (positive integer): ");
        int number2 = myScanner.nextInt();
        myScanner.close();

        int greatestCommonDivisor = 0;

        // Calculations:
        int remainder = number1 % number2;

        while (remainder != 0) {
            greatestCommonDivisor = number2 % remainder;
            number2 = remainder;
            remainder = greatestCommonDivisor;
        }

        // Output:
        System.out.println(number2);
    }
}