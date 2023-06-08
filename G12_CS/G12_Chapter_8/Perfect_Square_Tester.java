package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Perfect_Square_Tester
// Create a Perfect_Square_Tester application that tests whether a number is a perfect square, without using arrays,
// nested loops, library classes, or arithmetic operations except addition.

// Import(s):
import java.util.*;

public class Perfect_Square_Tester {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        int sum = 0;
        boolean isPerfectSquare = false;

        System.out.println("Enter a number to test if it is a perfect square: ");
        int number = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        for (int i = 1; sum < number; i += 2) {
            sum += i;

            if (sum == number) {isPerfectSquare = true;}
        }

        // Output:
        if (isPerfectSquare) {System.out.println(number + " is a perfect square.");}

        else {System.out.println(number + " is not a perfect square.");}
    }
}