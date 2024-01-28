package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Grade_Avg_Part_1
// Create a GradeAvg program that prompts the user for five grades and then displays the average of the grades. Assume
// the grades are integer values. Real division should be performed when calculating the average.

// Imports:
import java.util.*;

public class Grade_Avg_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the value if your first grade (integer): ");
        int grade1 = myScanner.nextInt();
        System.out.println("Enter the value if your second grade (integer): ");
        int grade2 = myScanner.nextInt();
        System.out.println("Enter the value if your third grade (integer): ");
        int grade3 = myScanner.nextInt();
        System.out.println("Enter the value if your fourth grade (integer): ");
        int grade4 = myScanner.nextInt();
        System.out.println("Enter the value if your fifth grade (integer): ");
        int grade5 = myScanner.nextInt();
        myScanner.close();

        // Calculations:
        int average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        // Output:
        System.out.println("The average of your grades is " + average + ".");
    }
}