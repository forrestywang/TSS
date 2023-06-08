package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Package_Check
// A delivery service does not accept packages heavier than 27 kilograms or larger than 0.1 cubic meters (100,000 cubic
// centimetres). Create a Package_Check application that prompts the user for the weight of a package and its dimensions
// (length, width, and height), and then displays an appropriate message if the package does not meet the requirements.
// Messages should include "Too heavy.", "Too large.", "Too heavy and too large.".

// Imports:
import java.util.*;

public class Package_Check {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Constants:
        final int maxWeight = 27;
        final int maxVolume = 100000;

        // Variables:
        System.out.println("Enter package weight (kilograms): ");
        int weight = myScanner.nextInt();
        System.out.println("Enter package length (centimetres): ");
        int length = myScanner.nextInt();
        System.out.println("Enter package width (centimetres): ");
        int width = myScanner.nextInt();
        System.out.println("Enter package height (centimetres): ");
        int height = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int volume = length * width * height;

        // Output:
        if (weight > maxWeight && volume > maxVolume) {
            System.out.println("Package is too heavy and too large.");
        }
        else if (weight > maxWeight) {
            System.out.println("Package is too heavy.");
        }
        else if (volume > maxVolume) {
            System.out.println("Package is too large.");
        }
    }
}