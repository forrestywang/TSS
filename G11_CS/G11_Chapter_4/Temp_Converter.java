package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Temp_Converter
// Create a TempConverter application that converts a Fahrenheit temperature to Celsius temperature. The application
// should prompt the user for the Fahrenheit temperature. Be sure to carefully form the expression. Parentheses will be
// needed to specify the order of operations.

// Imports:
import java.util.*;

public class Temp_Converter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the value of your Fahrenheit temperature (integer): ");
        int fahrenheit = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int celsius = (5*(fahrenheit - 32))/9;

        // Output:
        System.out.println(fahrenheit + " F is equivalent to " + celsius + " C.");
    }
}