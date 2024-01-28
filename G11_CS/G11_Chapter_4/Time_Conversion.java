package G11_Chapter_4;

// @author Forrest Wang
// March 17th, 2021
//
// Time_Conversion
// Create a TimeConversion application that when given a time in minutes, convert it to hours and minutes in the format
// hours:minutes.

// Imports:
import java.util.*;

public class Time_Conversion {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter in your time (minutes): ");
        int time = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int hours = time / 60;
        int minutes = time % 60;
        String filler = "";
        if(minutes < 10) filler = "0";

        // Output:
        System.out.println(time + " minutes is equivalent to " + hours + ":" + filler + minutes + ".");
    }
}
