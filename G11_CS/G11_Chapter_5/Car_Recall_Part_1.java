package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Car_Recall_Part_1
// An auto company produced some models of cars that may be difficult to drive because the car wheels are not exactly
// round. Cars with model numbers 119, 179, 189 through 195, 221, and 780 have been found to have this defect. Create a
// Car_Recall_Part_1 application that prompts teh customer for the model number of their car to find out if it is defective and
// then displays "Your car is not defective." when the user typed a model number without a defect. Otherwise, the
// message "Your car is defective. It must be repaired." should be displayed.

// Imports:
import java.util.*;

public class Car_Recall_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your car model number: ");
        int modelNumber = myScanner.nextInt();
        myScanner.close();

        // Output:
        if (modelNumber == 119 || modelNumber == 179 || modelNumber >= 189 && modelNumber <= 195 || modelNumber == 221 ||modelNumber == 780) {
            System.out.println("Your car is defective. It must be repaired.");
        }
        else {
            System.out.println("Your car is not defective.");
        }
    }
}