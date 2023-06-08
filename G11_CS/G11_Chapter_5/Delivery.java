package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Delivery
// Create a Delivery application that prompts the user for the length, width, and height of a package, and then displays
// "Reject." if any dimension is greater than 10, and "Accept." if all dimensions are less than or equal to 10.

// Imports:
import java.util.*;

public class Delivery {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the length of your package (centimetres): ");
        int length = myScanner.nextInt();
        System.out.println("Enter the width of your package (centimetres): ");
        int width = myScanner.nextInt();
        System.out.println("Enter the height of your package (centimetres): ");
        int height = myScanner.nextInt();
        myScanner.close();

        // Output:
        if (length <= 10 && width <= 10 && height <= 10) {
            System.out.println("Accept.");
        }
        else {
            System.out.println("Reject.");
        }
    }
}