package G11_Chapter_5;

// @author Forrest Wang
// April 3, 2021
//
// Grade
// Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then
// displays the corresponding letter grade. The  application should use the grading scale at your school.

// Imports:
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your percentage (0 - 100): ");
        int percentage = myScanner.nextInt();
        myScanner.close();

        // Output:
        if (percentage >= 80) {
            System.out.println("A");
        }
        else if (percentage >= 70) {
            System.out.println("B");
        }
        else if (percentage >= 60) {
            System.out.println("C");
        }
        else if (percentage >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}