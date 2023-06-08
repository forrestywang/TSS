package G12_Chapter_7;

// @author Forrest Wang
// October 22, 2021
//
// Best_Match
// Create a Best_Match application that outputs colours depending on the values of red, green, and blue.

// Import(s):
import java.util.*;
import java.io.*;
import java.text.*;

public class Best_Match {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the value of red: ");
        int red = myScanner.nextInt();
        System.out.println("Enter the value of green: ");
        int green = myScanner.nextInt();
        System.out.println("Enter the value of blue: ");
        int blue = myScanner.nextInt();
        myScanner.close();

        // Output:
        // Component Colours:
        if (red > green && red > blue) {System.out.println("RED");}

        else if (green > red && green > blue) {System.out.println("GREEN");}

        else if (blue > red && blue > green) {System.out.println("BLUE");}

        // Composite Colours:
        else if (red == green && red > blue) {System.out.println("YELLOW");}

        else if (red == blue && red > green) {System.out.println("MAGENTA");}

        else if (blue == green && blue > red) {System.out.println("CYAN");}

        // Gray:
        else if (red == green && red == blue) {System.out.println("GRAY");}
    }
}