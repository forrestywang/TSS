package G11_Chapter_8;

// @author Forrest Wang
// May 5, 2021
//
// Isosceles_Triangle
// Create an Isosceles_Triangle application that prompts the user for the size of an isosceles triangle and then
// displays the triangle with that many lines. The application code should include the drawBar() method from the
// chapter, and an addSpaces() method which prints spaces.

// Imports:
import java.util.*;

public class Isosceles_Triangle {

    /**
     * Pre-condition: Requires the value of size.
     * Post-condition: Should output the spaces.
     */
    public static void addSpaces(int size) {

        // Output:
        for (int i = 0; i < size - 1; i++) {System.out.print(" ");}
    }

    /**
     * Pre-condition: Requires the value of size.
     * Post-condition: Outputs the asterisks
     */
    public static void drawBar(int incrementer) {

        // Output:
        for (int i = 0; i < 1 + incrementer; i++) {System.out.print("*");}
        System.out.println();
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should output the isosceles triangle.
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the size of the isosceles triangle: ");
        int size = myScanner.nextInt();
        int sizeInitial = size;
        myScanner.close();

        int incrementer = 0;

        // Output:
        for (int i = 0; i < sizeInitial; i++, size--, incrementer += 2) {
            addSpaces(size);
            drawBar(incrementer);
        }
    }
}