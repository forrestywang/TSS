package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Stages
// Create a stages application that prompts the user for an age. For an age greater than 18, "Adult." is displayed.
// For an age greater than 12, and less than or equal to 18, "Teenager." is displayed.
// For an age greater than 10, and less than or equal to 12, "Pre-teenager." is displayed.
// For an age greater than 5, and less than or equal to 10, "Child." is displayed.
// For an age greater than 0, and less than or equal to 5, "Toddler." is displayed.

// Imports:
import java.util.*;

public class Stages {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Type your age: ");
        int age = myScanner.nextInt();
        myScanner.close();

        // Output:
        if (age > 18) {
            System.out.println("Adult.");
        }
        else if (age > 12) {
            System.out.println("Teenager.");
        }
        else if (age > 10) {
            System.out.println("Pre-teenager.");
        }
        else if (age > 5) {
            System.out.println("Child.");
        }
        else if (age >= 0) {
            System.out.println("Toddler.");
        }
    }
}