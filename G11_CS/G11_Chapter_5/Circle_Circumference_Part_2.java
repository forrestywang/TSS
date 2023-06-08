package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Circle_Circumference_Part_2
// Modify the Circle_Circumference application from Chapter 4 so that the message "Negative radii are illegal." is
// displayed if a negative number is entered by the user for the radius value. Otherwise, the application should
// calculate and display the circumference of the circle.

// Imports:
import java.util.*;

public class Circle_Circumference_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Type the radius length (centimetres): ");
        int radiusLength = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        double circumference = 2 * Math.PI * radiusLength;

        // Output:
        if (radiusLength > 0) {
            System.out.println("For a circle with a radius of " + radiusLength + ", the circumference is " + circumference + " centimetres.");
        }

        else {
            System.out.println("Negative radii are illegal.");
        }
    }
}