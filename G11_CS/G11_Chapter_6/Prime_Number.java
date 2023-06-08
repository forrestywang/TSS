package G11_Chapter_6;

// @author Forrest Wang
// April 9, 2021
//
// Prime_Number
// Create a Prime_Number application that when given a number, determines if it is prime.

// Imports:
import java.util.*;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter a positive integer less than 1 million: ");
        int number = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        if (number == 1 || number == 2) {
            System.out.println("The number is a prime number.");
        }
        for (int i = 2; i < number; i++) {
            if (number % i != 0) {
                System.out.println("The number is a prime number.");
                break;
            }
            else {
                System.out.println("The number is not a prime number.");
                break;
            }
        }
    }
}