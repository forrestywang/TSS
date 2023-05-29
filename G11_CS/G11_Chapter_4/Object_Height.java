package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Object_Height
// Create an ObjectHeight program that outputs the height of a ball dropped from 100 metres when given the time.

// Imports:
import java.util.*;

public class Object_Height {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter how long you want the ball to be in the air: ");
        double time = myScanner.nextDouble();
        myScanner.close();

        // Calculations:
        double height = 100 - 4.9 * (time * time);

        // Output:
        System.out.println("When the ball is in the air for " + time + " second(s), it is " + height + " metre(s) above the ground.");
    }
}