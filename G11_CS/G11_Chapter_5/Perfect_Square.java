package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Perfect_Square
// Create a Perfect_Square application that prompts the user for an integer and then displays a message indicating
// whether or not the number is a perfect square. This can be determined by finding the square root of a number,
// truncating it (by casting the double result), and then squaring that result.

// Imports:
import java.util.*;

public class Perfect_Square {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter an integer: ");
        int integer = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        double perfectSquareCheck = Math.pow(Math.sqrt(integer), 2);

        // Output:
        if (integer == perfectSquareCheck) {
            System.out.println(integer + " is a perfect square");
        }
        else {
            System.out.println(integer + " is not a perfect square.");
        }
    }
}