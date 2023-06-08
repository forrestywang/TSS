package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Numbers_Sum
// Create an Numbers_Sum application that prompts the user for a number and then displays the numbers 1 through the
// number entered, each on a separate line. Below the numbers, the sum is displayed.

// Imports:
import java.util.Scanner;

public class Numbers_Sum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter a number: ");
        int maximum = myScanner.nextInt();
        myScanner.close();

        // Output:
        for (int i = 1; i <= maximum; i++) {
            System.out.println(i);
        }

        System.out.println((1 + maximum) * maximum / 2);
    }
}