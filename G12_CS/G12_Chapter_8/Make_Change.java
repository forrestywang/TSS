package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Make_Change
// Create a Make_Change application that prompts the user for an amount of money in cents and outputs all possible
// representations of that amount as a sum of quarters, dimes, nickels, and pennies.

// Import(s):
import java.util.*;

public class Make_Change {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        int quarters;
        int dimes;
        int nickels;
        int pennies;

        int total;

        int representations = 0;

        System.out.println("Enter an amount of money in cents:");
        int cents = myScanner.nextInt();
        myScanner.close();

        System.out.format("%-15s %-15s %-15s %-15s", "Quarters:", "Dimes:", "Nickels:", "Pennies:");
        System.out.println();

        // Calculations:
        for (quarters = cents / 25; quarters >= 0; quarters--) {
            total = quarters * 25;

            for (dimes = (cents - total) / 10;  dimes >= 0; dimes--) {
                total = quarters * 25 + dimes * 10;

                for (nickels = (cents - total) / 5; nickels >= 0; nickels--) {
                    total = quarters * 25 + dimes * 10 + nickels * 5;

                    pennies = cents - total;

                    representations++;

                    System.out.format("%-15s %-15s %-15s %-15s", quarters, dimes, nickels, pennies);
                    System.out.println();
                }
            }
        }

        // Output:
        System.out.println("There are " + representations + " representations of " + cents + " cents.");
    }
}