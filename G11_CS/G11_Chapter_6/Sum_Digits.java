package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Sum_Digits
// Create a Sum_Digits application that when given a number, find the sum of each digit in it.

// Imports:
import java.util.*;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a positive integer: ");
        long number = myScanner.nextLong();
        myScanner.close();

        byte sum = 0;

        // Calculations:
        byte numberOfDigits = (byte) Math.log10(number);

        for (long i = (long) Math.pow(10, numberOfDigits); i != 1; i /= 10) {
            byte digit = (byte) (number / i);
            number -= i * digit;
            sum += digit;
        }

        byte onesDigit = (byte) (number % 10);
        sum += onesDigit;

        // Output:
        System.out.println(sum);
    }
}