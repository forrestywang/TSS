package G11_Chapter_5;

// @author Forrest Wang
// May 3, 2021
// Chapter_5_Test
// Create a kite-boarding application that will help you to select the correct kite(s) based on the given wind conditions.

// Imports:
import java.util.Scanner;

public class Chapter_5_Test {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the current wind speed (MPH): ");
        byte windSpeed = myScanner.nextByte();

        myScanner.close();

        // Output:
        System.out.println("The following kite size(s) would be appropriate: ");

        if (windSpeed >= 12 && windSpeed <= 20) {System.out.println("12 square meters.");}
        if (windSpeed >= 16 && windSpeed <= 25) {System.out.println("9 square meters.");}
        if (windSpeed >= 22 && windSpeed <= 30) {System.out.println("7 square meters.");}
        if (windSpeed >= 24 && windSpeed <= 35) {System.out.println("5 square meters.");}
    }
}