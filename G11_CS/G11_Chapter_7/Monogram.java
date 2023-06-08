package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Monogram
// Create a Monogram application that prompts the user for his or her first name, middle name, and last name and then
// displays their monogram.

// Imports:
import java.util.*;

public class Monogram {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your first name: ");
        String firstName = myScanner.next();
        System.out.println("Enter your middle name: ");
        String middleName = myScanner.next();
        System.out.println("Enter your last name: ");
        String lastName = myScanner.next();
        myScanner.close();

        char firstNameInitial = firstName.charAt(0);
        char monogramFirstInitial = Character.toLowerCase(firstNameInitial);

        char middleNameInitial = middleName.charAt(0);
        char monogramMiddleInitial = Character.toUpperCase(middleNameInitial);

        char lastNameInitial = lastName.charAt(0);
        char monogramLastInitial = Character.toLowerCase(lastNameInitial);

        // Output:
        System.out.println("Your monogram is: " + monogramFirstInitial + monogramMiddleInitial + monogramLastInitial);
    }
}