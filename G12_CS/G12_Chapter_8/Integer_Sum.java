package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Integer_Sum
// Create an Integer_Sum application that prompts the user for a number between one and 10, and calculates the sum of
// all of the consecutive integers before it.

// Import(s):
import java.util.*;

public class Integer_Sum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        byte sum = 0;

        System.out.println("Enter a number between 1 and 10: ");
        byte number = myScanner.nextByte();
        myScanner.close();

        // Calculations:
        for (byte i = 1; i <= number; i++) {
            sum += i;

            if (i < number) {System.out.print(i + " + ");}

            else {System.out.print(i + " = ");}
        }

        // Output:
        System.out.println(sum);
    }
}