package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Grade_Average
// Create a Grade_Average application that reads from a file named scores.dat and prints out their average.

// Import(s):
import java.util.*;
import java.io.*;

public class Grade_Average {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Scanner input = null;

        try {input = new Scanner(new File("scores.dat"));}

        catch (FileNotFoundException e) {
            System.out.println("Cannot open scores.dat");
            System.exit(1);
        }

        // Variable(s):
        int sum = 0;
        int i;

        // Calculations:
        for (i = 0; myScanner.hasNextLine(); i++) {sum =+ input.nextInt();}

        // Output:
        System.out.println("The grade average is " + sum / i + "%.");
    }
}