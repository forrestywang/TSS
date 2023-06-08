package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// My_Power
// Create a MyPow application that uses the formula e^(Y * ln(X)) to calculate X^Y. The MyPow application
// should prompt the user for two numbers and then display the result from the formula and, for comparison, show the
// same result using the Math.pow() method.

// Imports:
import java.util.*;

public class My_Power {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();

        // Variables:
        System.out.println("Enter a value for X: ");
        float x = myScanner.nextFloat();
        System.out.println("Enter a value for Y: ");
        float y = myScanner.nextFloat();
        myScanner.close();

        // Calculations:
        float formulaAnswer = (float) Math.exp(y * Math.log(x));
        float powerAnswer = (float) Math.pow(x, y);

        // Output:
        System.out.print("The result from using the formula is: ");
        System.out.format("%.2f", formulaAnswer);
        System.out.format("\n");
        System.out.print("The result from using Math.pow() is: ");
        System.out.format("%.2f", powerAnswer);
    }
}