package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Group_Assignment
// Create a Group_Assignment application that prompts the user for his or her name and then displays a group assignment.
// The group assignment depends on the first letter of teh student's last name. Last names beginning with A through I
// are assigned to Group 1, J through S are assigned for Group 2, T through Z are assigned to Group 3.

// Imports:
import java.util.*;

public class Group_Assignment {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your first name: ");
        String firstName = myScanner.next();
        System.out.println("Enter your last name: ");
        String lastName = myScanner.next();
        myScanner.close();

        // Output:
        if (lastName.charAt(0) >= 65 && lastName.charAt(0) <= 73) {
            System.out.println(firstName + " " + lastName + " is assigned to Group 1.");
        }
        else if (lastName.charAt(0) >= 74 && lastName.charAt(0) <= 83) {
            System.out.println(firstName + " " + lastName + " is assigned to Group 2.");
        }
        else {
            System.out.println(firstName + " " +  lastName + " is assigned to Group 3.");
        }
    }
}