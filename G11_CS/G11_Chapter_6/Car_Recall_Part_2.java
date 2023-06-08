package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Car_Recall_Part_2
// Modify the Car_Recall_Part_1 application created in Chapter 5 to allow the user to input as many model numbers as
// needed. Use 0 as a sentinel to end user input.

// Imports:
import java.util.*;

public class Car_Recall_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        short modelNumber;

        // Output:
        do {
            System.out.println("Enter your car model number or 0 to quit: ");
            modelNumber = myScanner.nextShort();

            if (modelNumber == 119 || modelNumber == 179 || modelNumber >= 189 && modelNumber <= 195 || modelNumber == 221 || modelNumber == 780) {
                System.out.println("Your car is defective. It must be repaired.");
            }
            else if (modelNumber == 0) {
                System.out.println("Quit.");
            }
            else {
                System.out.println("Your car is not defective.");
            }
        } while (modelNumber != 0);

        myScanner.close();
    }
}