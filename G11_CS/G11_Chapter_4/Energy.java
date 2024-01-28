package G11_Chapter_4;

// March 16th, 2021
// @author Forrest Wang
//
// Energy
// Create an Energy program that prompts the user for a mass value, and outputs the energy it would release and the
// number of lightbulbs it would power.

// Imports:
import java.util.*;
import java.text.*;

public class Energy {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Constants:
        final int SPEED_OF_LIGHT = 300000000;
        final int LIGHT_BULB_ENERGY = 360000;

        // Variables:
        System.out.println("Enter the value of mass (kilograms): ");
        double mass = myScanner.nextDouble();
        myScanner.close();

        // Calculations:
        double energy = mass * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
        double numberOfLightBulbs = energy / LIGHT_BULB_ENERGY;

        // Formatting:
        DecimalFormat formatting = new DecimalFormat("#,###");

        // Output:
        System.out.print(mass + " kilograms is equivalent to ");
        System.out.print(formatting.format(energy));
        System.out.print(" joules, which can power ");
        System.out.print(formatting.format(numberOfLightBulbs));
        System.out.print(" light bulbs for an hour.");

    }
}