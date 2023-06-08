package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Quadratic_Equation
// Create a Quadratic_Equation application that gives the the solution to any quadratic equation. The application should
// prompt the user for vales for a, b, and c (ax² + bx + c = 0) and then displays the roots, if any.

// Imports:
import java.util.*;

public class Quadratic_Equation {
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
        float root1 = (float) ((- b + Math.sqrt(discriminant))/(2 * a));
        float root2 = (float) ((- b - Math.sqrt(discriminant))/(2 * a));

        // Output:
        if (discriminant > 0) {
            System.out.print("The roots are ");
            System.out.format("%.1f", root1);
            System.out.print(" and ");
            System.out.format("%.1f", root2);
        }
        else if (root1 == root2) {
            System.out.print("The root is ");
            System.out.format("%.1f", root1);
        }
        else if (discriminant < 0) {
            System.out.println("There are no roots.");
        }
    }
}