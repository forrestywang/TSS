package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Trigonometric_Functions
// Create a Trigonometric_Functions application that prompts the user for an angle in degrees and then displays the sine,
// cosine, and tangent of the angle.

// Imports:
import java.util.*;

public class Trigonometric_Functions {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter an angle (degrees): ");
        float angle = myScanner.nextFloat();
        myScanner.close();

        // Calculations:
        float sine = (float) Math.sin(Math.toRadians(angle));
        float cosine = (float) Math.cos(Math.toRadians(angle));
        float tangent = (float) Math.tan(Math.toRadians(angle));

        // Output:
        System.out.print("Sine: ");
        System.out.format("%.3f", sine);
        System.out.format("\n");
        System.out.print("Cosine: ");
        System.out.format("%.3f", cosine);
        System.out.format("\n");
        System.out.print("Tangent: ");
        System.out.format("%.3f", tangent);
        System.out.format("\n");
    }
}