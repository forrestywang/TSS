package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Account_Setup
// Create an Account_Setup application that prompts the user for a username and a password. The application should
// prompts the user until a password with at least eight characters is entered. The username and password should be
// converted to all lowercase letters and then an appropriate message displayed.

// Imports:
import java.util.*;

public class Account_Setup {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your username: ");
        String username = myScanner.nextLine();

        int passwordLength;
        String password;

        do {
            System.out.println("Enter a password that is at least eight characters long: ");
            password = myScanner.nextLine();
            passwordLength = password.length();
        } while (passwordLength < 7);

        myScanner.close();

        // Output:
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}