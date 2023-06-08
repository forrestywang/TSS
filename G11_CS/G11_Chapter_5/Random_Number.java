package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Random_Number
// Create a Random_Number application that prompts the user for two numbers. The first number is a minimum value and the
// second is a maximum value. Random_Number then displays an integer between the min and max value entered by the user.

// Imports:
import java.util.*;

public class Random_Number {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        // Variables:
        System.out.println("Enter the minimum value: ");
        int min = myScanner.nextInt();
        System.out.println("Enter the maximum value: ");
        int max = myScanner.nextInt();
        myScanner.close();

        // Output:
        System.out.println(rng.nextInt(max - min + 1) + min);
    }
}