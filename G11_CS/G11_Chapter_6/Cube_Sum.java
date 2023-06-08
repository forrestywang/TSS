package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Cube_Sum
// Create a Cube_Sum application that when given a number, find the sum of the cube of all digits in the number.

// Imports:
import java.util.*;

public class Cube_Sum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a positive integer: ");
        long number = myScanner.nextLong();
        myScanner.close();

        short sum = 0;

        // Calculations:
        byte numberOfDigits = (byte) Math.log10(number);

        for (long i = (long) Math.pow(10, numberOfDigits); i != 1; i /= 10) {
            byte digit = (byte) (number / i);
            number -= i * digit;
            short cubeDigit = (short) Math.pow(digit, 3);
            sum += cubeDigit;
        }

        short onesDigitCubed = (short) Math.pow(number % 10, 3);
        sum += onesDigitCubed;

        // Output:
        System.out.println(sum);
    }
}