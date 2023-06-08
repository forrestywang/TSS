package G12_Chapter_10;

// @author Forrest Wang
// December 2, 2021
//
// Bacteria_Colonies
// Create a Bacteria_Colonies application that reads from a text file and determines the number and location of each
// bacteria colony using recursion.

// Import(s):
import java.io.*;
import java.util.*;

public class Bacteria_Colonies {
    private static boolean[][] slide;
    private static int rows;
    private static int columns;

    /**
     * Pre-condition: Requires the values of variables a, and b.
     * Post-condition: Should output the size of the bacteria colony.
     */
    public static int findColonies(int a, int b) {
        if (a >= 0 && a < rows && b >= 0 && b < columns && slide[a][b]) {
            slide[a][b] = false;
            return 1 + findColonies(a, b + 1) + findColonies(a, b - 1) + findColonies(a + 1, b) + findColonies(a - 1, b);
        }

        return 0;
    }

    public static void main(String[] args) {
        // Variable(s):
        String smallSlide = "slide.dat";
        String mediumSlide = "DATA_50x50.txt";
        String largeSlide = "DATA_100x200.txt";
        String fileName = null;
        String line;
        
        int numberOfColonies = 0;

        // Constructor(s):
        Scanner myScanner = new Scanner(System.in);
        Scanner fileReader = null;

        // Choose which text file to read from:
        System.out.println("Choose which bacteria dish to open: ");
        System.out.println("1. Small Bacteria Dish");
        System.out.println("2. Medium Bacteria Dish");
        System.out.println("3. Large Bacteria Dish");
        byte choice = myScanner.nextByte();

        myScanner.close();

        switch (choice) {
            case 1 -> fileName = smallSlide;
            case 2 -> fileName = mediumSlide;
            case 3 -> fileName = largeSlide;
        }

        // Read from the text file:
        try {
            assert fileName != null;
            fileReader = new Scanner(new File(fileName));
        }

        catch (FileNotFoundException e) {
            System.out.println("Cannot open " + fileName);
            System.exit(1);
        }

        // Writing the array:
        rows = Integer.parseInt(fileReader.nextLine());
        columns = Integer.parseInt(fileReader.nextLine());

        slide = new boolean[rows][columns];

        // Go through each row of the array:
        for (int a = 0; a < rows; a++) {
            line = fileReader.nextLine();

            // Go through each column of the array:
            for (int b = 0; b < columns; b++) {
                slide[a][b] = line.charAt(b) == '*';
            }
        }

        fileReader.close();

        // Find and display Bacteria Colonies:
        for (int a = 0; a < rows; a++) {

            // Go through each column of the array:
            for (int b = 0; b < columns; b++) {
                if (slide[a][b]) {
                    System.out.println("There is a bacteria colony at (" + a + ", " + b + "), with a size of  " + findColonies(a, b) + " cells.");
                    numberOfColonies++;
                }
            }
        }

        System.out.println("There are " + numberOfColonies + " bacteria colonies.");
    }
}