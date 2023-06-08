package G12_Chapter_7;

// @author Forrest Wang
// October 22, 2021
//
// Find_Best_Fit
// Create a Find_Best_Fit application that determines the most efficient way to store two files on a CD.

// Import(s):
import java.util.*;
import java.io.*;
import java.text.*;

public class Find_Best_Fit {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the size of the first file: ");
        int size1 = myScanner.nextInt();
        System.out.println("Enter the size of the second file: ");
        int size2 = myScanner.nextInt();
        System.out.println("Enter the size of the CD: ");
        int space = myScanner.nextInt();
        myScanner.close();

        // Output:
        // If both files fit:
        if (size1 + size2 <= space && size1 != size2) {System.out.println("Both files fit on the CD.");}

        // If both files do not fit and are smaller than the space:
        else if (size1 + size2 > space && size1 <= space && size2 <= space) {
            // If the first file is larger than the second file:
            if (size1 > size2) {System.out.println("The first file is the largest file that can fit on the CD.");}


            // If the second file is larger than the first file:
            else if (size2 > size1) {System.out.println("The second file is the largest file that can fit on the CD.");}
        }

        // If the second file does not fit and the first file does:
        else if (size2 > space && size1 <= space) {System.out.println("The first file fits on the CD, but the second file does not.");}

        // If the first file does not fit and the second one does:
        else if (size1 > space && size2 <= space) {System.out.println("The second file fits on the CD, but the first file does not.");}

        // If both files fit and are the same size:
        else if (size1 + size2 <= space && size1 == size2) {System.out.println("Both files are the same size and both fit on the CD.");}
    }
}