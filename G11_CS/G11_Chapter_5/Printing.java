package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Printing
// Create a Printing application that prompts the user for the number of copies to print and then displays the price per
// copy and the total price for the job.

// Imports:
import java.util.*;

public class Printing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the number of copies printed (integer): ");
        int copies = myScanner.nextInt();
        myScanner.close();
        double price = 0;

        // Calculations:
        if (copies <= 99) {
            price = 0.30;
        }
        else if (copies <= 499) {
            price = 0.28;
        }
        else if (copies <= 749) {
            price = 0.27;
        }
        else if (copies <= 1000) {
            price = 0.26;
        }
        else {
            price = 0.25;
        }

        // Calculations:
        float cost = (float) (copies * price);

        // Output:
        System.out.println("Price per copy is : $" + price);
        System.out.print("Total cost is: $");
        System.out.format("%.2f", cost);
    }
}