package G11_Chapter_8;

// @author Forrest Wang
// May 5, 2021
//
// Change_Calculator
// Create a Change_Calculator application that prompts the user for the number of quarters, dimes, nickels, and pennies,
// and calculates the cent value of all the coins. The getCents() method should be calculating that.

// Imports:
import java.util.*;

public class Change_Calculator {

    /**
     * Pre-condition: Requires the number of quarters, dimes, nickels, and pennies.
     * Post-condition: Should calculate and output the value of all the coins.
     */
    public static void getCents() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the number of quarters: ");
        int quarters = myScanner.nextInt();
        System.out.println("Enter the number of dimes: ");
        int dimes = myScanner.nextInt();
        System.out.println("Enter the number of nickels: ");
        int nickels = myScanner.nextInt();
        System.out.println("Enter the number of pennies: ");
        int pennies = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int centValue = quarters * 25 + dimes * 10 + nickels * 5 + pennies;

        // Output:
        System.out.println("The value of " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies is equivalent to " + centValue + "¢.");
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should execute the method getCents().
     */
    public static void main(String[] args) {getCents();}
}