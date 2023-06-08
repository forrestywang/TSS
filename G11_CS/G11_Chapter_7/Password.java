package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Password
// Create a Password application that takes a user's attempts at guessing the password and determines whether or not they
// guessed correctly. The user is given 3 chances to guess. After that if they have not guessed correctly they are
// locked out from further attempts.

// Imports:
import java.util.*;

public class Password {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Set your password: ");
        String password = myScanner.nextLine();
        int i;

        // Output:
        for (i = 0; i < 3; i++) {
            System.out.println("Enter your password: ");
            String passwordAttempt = myScanner.nextLine();

            if (passwordAttempt.equals(password)) {
                System.out.println("Access granted.");
                break;
            }
            else {System.out.println("Incorrect.");}
        }

        if (i == 3) {
            System.out.println("Access denied.");
        }

        myScanner.close();
    }
}