package G11_Chapter_6;

// @author Forrest Wang
// April 7, 2021
//
// Investment_Calculator
// Create an Investment_Calculator application that calculates the number of years needed until the initial investment
// of x investment is worth z when compounded annually at a rate of y.

// Imports:
import java.util.*;

public class Investment_Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the value for the initial investment value: ");
        double initialInvestment = myScanner.nextDouble();
        System.out.println("Enter the amount for the final investment value: ");
        double finalInvestment = myScanner.nextDouble();
        System.out.println("Enter the interest rate (decimal): ");
        double interest = myScanner.nextDouble();
        myScanner.close();

        double rightSide = 0;
        int time;

        // Calculations:
        for (time = 1; finalInvestment >= rightSide; time++) {
            rightSide = initialInvestment * Math.pow(interest + 1, time);
        }

        time -= 1;

        // Output:
        System.out.print("With an interest rate of " + interest + "%, it will take " + time + " year(s) for $");
        System.out.format("%,.2f", initialInvestment);
        System.out.print(" to appreciate to a value greater than $");
        System.out.format("%,.2f", finalInvestment);
    }
}