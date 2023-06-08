package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// Metric_Conversion
// Create a Metric_Conversion application that displays a menu of conversion choices and then prompts the user to choose
// a conversion. Conversion choices should include inches to centimeters, feet to centimeters, yards to meters, miles to
// kilometers and vice versa. The application should include separate methods for doing each of the conversions.

// Imports:
import java.util.*;

public class Metric_Conversion {

    /**
     * Pre-condition: Requires the value of inches.
     * Post-condition: Should convert inches to centimeters.
     */
    public static void inchesToCentimeters() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double inches, centimeters;

        System.out.println("Enter the distance in inches to be converted into centimeters: ");
        inches = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        centimeters = inches * 2.54;

        // Output:
        System.out.println(inches + " inches is equivalent to " + centimeters + " centimeters.");
    }

    /**
     * Pre-condition: Requires the value of feet.
     * Post-condition: Should convert feet to centimeters.
     */
    public static void feetToCentimeters() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double feet, centimeters;

        System.out.println("Enter the distance in feet to be converted into centimeters: ");
        feet = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        centimeters = feet * 30;

        // Output:
        System.out.println(feet + " feet is equivalent to " + centimeters + " centimeters.");
    }

    /**
     * Pre-condition: Requires the value of yards.
     * Post-condition: Should convert yards to meters.
     */
    public static void yardsToMeters() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double yards, meters;

        System.out.println("Enter the distance in yards to be converted into meters: ");
        yards = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        meters = yards * 0.91;

        // Output:
        System.out.println(yards + " yards is equivalent to " + meters + " meters.");
    }

    /**
     * Pre-condition: Requires the value of miles.
     * Post-condition: Should convert miles to kilometers.
     */
    public static void milesToKilometers() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double miles, kilometers;

        System.out.println("Enter the distance in miles to be converted into kilometers: ");
        miles = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        kilometers = miles * 1.6;

        // Output:
        System.out.println(miles + " miles is equivalent to " + kilometers + " kilometers.");
    }

    /**
     * Pre-condition: Requires the value of centimeters.
     * Post-condition: Should convert centimeters to inches.
     */
    public static void centimetersToInches() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double centimeters, inches;

        System.out.println("Enter the distance in centimeters to be converted into inches: ");
        centimeters = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        inches  = centimeters / 2.54;

        // Output:
        System.out.println(centimeters + " centimeters is equivalent to " + inches + " inches.");
    }

    /**
     * Pre-condition: Requires the value of centimeters.
     * Post-condition: Should convert centimeters to feet.
     */
    public static void centimetersToFeet() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double centimeters, feet;

        System.out.println("Enter the distance in centimeters to be converted into feet: ");
        centimeters = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        feet = centimeters / 30;

        // Output:
        System.out.println(centimeters + " centimeters is equivalent to " + feet + " feet.");
    }

    /**
     * Pre-condition: Requires the value of meters.
     * Post-condition: Should convert meters to yards.
     */
    public static void metersToYards() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double meters, yards;

        System.out.println("Enter the distance in meters to be converted into yards: ");
        meters = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        yards = meters / 0.91;

        // Output:
        System.out.println(meters + " meters is equivalent to " + yards + " yards.");
    }

    /**
     * Pre-condition: Requires the value of kilometers.
     * Post-condition: Should convert kilometers to miles.
     */
    public static void kilometersToMiles() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        double kilometers, miles;

        System.out.println("Enter the distance in kilometers to be converted into miles: ");
        kilometers = myScanner.nextDouble();

        myScanner.close();

        // Calculations:
        miles = kilometers / 1.6;

        // Output:
        System.out.println(kilometers + " kilometers is equivalent to " + miles + " miles.");
    }

    /**
     * Pre-condition: Requires that the number entered should range from 1 to 8.
     * Post-condition: Should let the user convert a variety of units of measurement.
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("1. Convert inches to centimeters.");
        System.out.println("2. Convert feet to centimeters.");
        System.out.println("3. Convert yards to meters.");
        System.out.println("4. Convert miles to kilometers.");
        System.out.println("5. Convert centimeters to inches.");
        System.out.println("6. Convert centimeters to feet.");
        System.out.println("7. Convert meters to yards.");
        System.out.println("8. Convert kilometers to miles.");
        System.out.println("Enter a number (1 to 8) depending on which conversion you want: ");
        byte option = myScanner.nextByte();

        myScanner.close();

        // Output:
        switch (option) {
            case 1 -> inchesToCentimeters();
            case 2 -> feetToCentimeters();
            case 3 -> yardsToMeters();
            case 4 -> milesToKilometers();
            case 5 -> centimetersToInches();
            case 6 -> centimetersToFeet();
            case 7 -> metersToYards();
            case 8 -> kilometersToMiles();
        }
    }
}