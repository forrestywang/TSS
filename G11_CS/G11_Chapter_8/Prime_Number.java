package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// Prime_Number
// Create a Prime_Number application to include a method named isPrime(). The method should require one parameter and
// return a Boolean value.

// Imports:
import java.util.*;

public class Prime_Number {

    /**
     * Pre-condition: Number should be a positive integer less than 1 million.
     * Post-condition: Should determine if the number entered is prime.
     */
    public static void isPrime() {
        // Variables:
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a positive integer less than 1 million: ");
        int number = myScanner.nextInt();

        myScanner.close();

        // Calculations:
        if (number == 1 || number == 2) {System.out.println("The number is a prime number.");}
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

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should execute the method "isPrime()".
     */
    public static void main(String[] args) {
        isPrime();
    }
}