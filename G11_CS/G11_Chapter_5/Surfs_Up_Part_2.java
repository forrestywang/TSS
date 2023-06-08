package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Surfs_Up_Part_2
// Modify the Surfs_Up_Part_1 application to display "Great day for surfing!" when the waves are 6 feet or over and
// "Go body boarding!" when the waves are less than 6 feet.

// Imports:
import java.util.*;

public class Surfs_Up_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Type the wave height (feet): ");
        int waveHeight = myScanner.nextInt();
        myScanner.close();

        // Output:
        if (waveHeight > 6) {
            System.out.println("Great day for surfing!");
        }
        else {
            System.out.println("Go body boarding!");
        }
    }
}
