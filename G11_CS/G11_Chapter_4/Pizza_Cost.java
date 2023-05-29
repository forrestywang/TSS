package G11_Chapter_4;

// @author Forrest Wang
// March 17th, 2021
//
// Pizza_Cost
// Create a PizzaCost program that takes the size of a pizza as input and then displays the cost of making the pizza.

// Imports:
import java.util.*;

public class Pizza_Cost {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Constants:
        final float LABOUR_COST = 0.75f;
        final float RENT_COST = 1.00f;

        // Variables:
        System.out.println("Enter how large the pizza is (inches): ");
        int diameter = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        double materialCost = 0.05 * diameter * diameter;
        double totalCost = LABOUR_COST + RENT_COST + materialCost;

        // Output:
        System.out.print("For a " + diameter + " inch pizza, the cost of making it is $");
        System.out.format("%.2f", totalCost);
        System.out.print(".");
    }
}