package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Date_Converter_Part_1
// Create a Date_Converter_Part_1 application that prompts the user for a date in the format mm/dd/yyyy, then converts
// it to the format dd-mm-yyyy.

// Import(s):
import java.util.*;

public class Date_Converter_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter a date in the format mm/dd/yyyy: ");
        String date = myScanner.nextLine();

        myScanner.close();

        // Output:
        System.out.println("The date in the format dd-mm-yyyy is " + date.substring(3, 5) + "-" + date.substring(0, 2) + "-" + date.substring(6));
    }
}