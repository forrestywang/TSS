package G11_Chapter_7;

// @author Forrest Wang
// April 24, 2021
//
// Formal_Greeting
// Create a Formal_Greeting application that prompts the user for his or her name, including title. The application
// should display "Hello, sir." if the string starts with Mr., "Hello, ma'am." if the string starts with Ms., Mrs., or
// Miss, and "Hello, name." otherwise where name is the user's name.

// Imports:
import java.util.*;

public class Formal_Greeting {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter your name with your title: ");
        String name = myScanner.nextLine();
        myScanner.close();

        // Output:
        if (name.startsWith("Mr.")) {
            System.out.println("Hello, sir.");
        }
        else if (name.startsWith("Ms.") || name.startsWith("Mrs.") || name.startsWith("Miss." )) {
            System.out.println("Hello, ma'am.");
        }
        else {System.out.println("Hello, " + name + ".");}
    }
}