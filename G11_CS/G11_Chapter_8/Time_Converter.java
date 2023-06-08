package G11_Chapter_8;

// @author Forrest Wang
// May 1, 2021
//
// Time_Converter
// Create a Time_Converter application that allows the user to choose among converting hours to minutes, days to hours,
// minutes to hours, or hours to days. Use methods as appropriate.

// Imports:
import java.util.*;

public class Time_Converter {

    /**
     * Pre-condition: Requires the value of hours.
     * Post-condition: Should convert hours to minutes.
     */
    public static void hoursToMinutes() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        float hours, minutes;

        System.out.println("Enter the number of hours to be converted into minutes: ");
        hours = myScanner.nextFloat();

        myScanner.close();

        // Calculations:
        minutes = hours * 60;

        // Output:
        System.out.println(hours + " hours is equivalent to " + minutes + " minutes.");
    }

    /**
     * Pre-condition: Requires the value of days.
     * Post-condition: Should convert days to hours.
     */
    public static void daysToHours() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        float days, hours;

        System.out.println("Enter the number of days to be converted into hours: ");
        days = myScanner.nextFloat();

        myScanner.close();

        // Calculations:
        hours = days * 24;

        // Output:
        System.out.println(days + " days is equivalent to " + hours + " hours.");
    }

    /**
     * Pre-condition: Requires the value of minutes.
     * Post-condition: Should convert minutes to hours.
     */
    public static void minutesToHours() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        float minutes, hours;

        System.out.println("Enter the number of minutes to be converted into hours: ");
        minutes = myScanner.nextFloat();

        myScanner.close();

        // Calculations:
        hours = minutes / 60;

        // Output:
        System.out.println(minutes + " minutes is equivalent to " + hours + " hours.");
    }

    /**
     * Pre-condition: Requires the value of hours.
     * Post-condition: Should convert hours to days.
     */
    public static void hoursToDays() {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        float hours, days;

        System.out.println("Enter the number of hours to be converted into days: ");
        hours = myScanner.nextFloat();

        myScanner.close();

        // Calculations:
        days = hours / 24;

        // Output:
        System.out.println(hours + " hours is equivalent to " + days + " days.");
    }

    /**
     * Pre-condition: Requires that the number entered should range from 1 to 4.
     * Post-condition: Should let the user convert a variety of units of time.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("1. Convert hours to minutes.");
        System.out.println("2. Convert days to hours.");
        System.out.println("3. Convert minutes to hours.");
        System.out.println("4. Convert hours to days.");
        System.out.println("Enter a number (1, 2, 3, or 4) depending on which conversion you want: ");
        byte option = myScanner.nextByte();

        myScanner.close();

        // Output:
        switch (option) {
            case 1 -> hoursToMinutes();
            case 2 -> daysToHours();
            case 3 -> minutesToHours();
            case 4 -> hoursToDays();
        }

        myScanner.close();
    }
}