package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Change
// Create a Change application that prompts the user for the amount of money as an integer in cents and then displays
// the number of each coin type to give as change.

// Imports:
import java.util.*;

public class Change {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Constants:
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        final int PENNIES = 1;

        // Variables:
        System.out.println("Enter the amount of money you want change for (cents): ");
        int money = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int numberQuarters = money / QUARTERS;
        money -= (QUARTERS * numberQuarters);
        int numberDimes = money / DIMES;
        money -= (DIMES * numberDimes);
        int numberNickels = money / NICKELS;
        money -= (NICKELS * numberNickels);
        int numberPennies = money / PENNIES;

        // Output:
        System.out.println("Quarters: " + numberQuarters);
        System.out.println("Dimes: " + numberDimes);
        System.out.println("Nickels: " + numberNickels);
        System.out.println("Pennies: " + numberPennies);
    }
}