package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Car_Payment
// Create a CarPayment application that calculates a monthly car payment after prompting the user for the principal
// owing (P), the interest rate (r) and the number of monthly payments (m).

// Imports:
import java.util.*;

public class Car_Payment {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the principal amount: ");
        float principal = myScanner.nextFloat();
        System.out.println("Enter the interest rate (decimal): ");
        float interestRate = myScanner.nextFloat();
        System.out.println("Enter the number of monthly payments: ");
        float monthlyPaymentsNumber = myScanner.nextFloat();
        myScanner.close();

        // Calculations:
        float monthlyPaymentsValue = (float) ((principal * interestRate/12) / (1 - Math.pow((1 + interestRate/12), - monthlyPaymentsNumber)));

        // Output:
        System.out.print("The monthly payment is: $");
        System.out.format("%.2f", monthlyPaymentsValue);
    }
}