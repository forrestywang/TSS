package G11_Chapter_4;

// @author Forrest Wang
// March 16th, 2021
//
// Grade_Avg_Part_2
// Create a GradeAvg program that prompts the user for five grades and then displays the average of the grades. Assume
// the grades are integer values. Real division should be performed when calculating the average.

// Imports:
import java.util.*;

public class Grade_Avg_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        int sum = 0;
        System.out.println("Enter the value if your first grade (integer): ");
        int grade1 = myScanner.nextInt();
        sum += grade1;
        System.out.println("Enter the value if your second grade (integer): ");
        int grade2 = myScanner.nextInt();
        sum += grade2;
        System.out.println("Enter the value if your third grade (integer): ");
        int grade3 = myScanner.nextInt();
        sum += grade3;
        System.out.println("Enter the value if your fourth grade (integer): ");
        int grade4 = myScanner.nextInt();
        sum += grade4;
        System.out.println("Enter the value if your fifth grade (integer): ");
        int grade5 = myScanner.nextInt();
        sum += grade5;
        myScanner.close();

        // Calculations:
        int average = sum / 5;

        // Output:
        System.out.println("The average of your grades is " + average + ".");
    }
}