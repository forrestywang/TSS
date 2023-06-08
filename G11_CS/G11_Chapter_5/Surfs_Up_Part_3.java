package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Surfs_Up_Part_3
// Modify the Surfs_Up application to display "Great day for surfing!" when the waves are 6 feet or over,
// "Go body boarding!" when the waves are between 3 and 6 feet, "Go for a swim." when the waves are from 0 to 3 feet,
// and "Whoa! What kind of surf is that?" otherwise.

// Imports:
import java.util.*;

public class Surfs_Up_Part_3 {
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
        else if (waveHeight > 3) {
            System.out.println("Go body boarding!");}
        else if (waveHeight > 0) {System.out.println("Go for a swim.");
        }
        else {
            System.out.println("Whoa! What kind of surf is that?");
        }
    }
}