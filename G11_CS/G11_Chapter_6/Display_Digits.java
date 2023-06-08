package G11_Chapter_6;

// @author Forrest Wang
// April 9, 2021
//
// Display_Digits
// Create a Display_Digits application that when given a number, print the individual digits in that number each on a new line.

// Imports:
import java.util.*;

public class Display_Digits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a positive integer: ");
        long number = myScanner.nextLong();
        myScanner.close();

        // Calculations:
        byte numberOfDigits = (byte) Math.log10(number);

        for (long i = (long) Math.pow(10, numberOfDigits); i != 1; i /= 10) {
            byte digit = (byte) (number / i);
            number -= i * digit;
            System.out.println(digit);
        }

        byte onesDigit = (byte) (number % 10);
        System.out.println(onesDigit);
    }
}