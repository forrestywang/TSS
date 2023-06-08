package G11_Chapter_5;

// @author Forrest Wang
// April 1, 2021
//
// Discriminant
// In mathematics, the quantity b^2 - 4ac is called the "discriminant". Create a Discriminant application that prompts
// the user for the values a, b, and c and then displays "No roots." if the discriminant is negative, "One root." if the
// discriminant is zero, and "Two roots." if the discriminant is positive.

// Imports:
import java.util.*;

public class Discriminant {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the value of a: ");
        int a = myScanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = myScanner.nextInt();
        System.out.println("Enter the value of c: ");
        int c = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int discriminant = (int) (Math.pow(b, 2) - 4 * a * c);

        // Output:
        if (discriminant > 0) {
            System.out.println("Two roots.");
        }
        else if (discriminant == 0) {
            System.out.println("One root.");
        }
        else {
            System.out.println("No roots.");
        }
    }
}