package G12_Chapter_10;

// @author Forrest Wang
// December 10, 2021
//
// Date_Converter_Part_2
// Create a Date_Converter_Part_2 application that prompts the user for a date in the format mm/dd/yyyy, then converts
// it to the format dd-mm-yyyy. This should also allow the user to enter dates with leading zeros.

// Import(s):
import java.util.*;

public class Date_Converter_Part_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variable(s):
        System.out.println("Enter a date in the format mm/dd/yyyy: ");
        String date = myScanner.nextLine();
        String newDate = "";

        myScanner.close();

        // Calculations:
        if (date.charAt(1) == '/') {
            newDate += "0" + date.charAt(0) + "-";

            if (date.charAt(3) == '/') {newDate += "0" + date.charAt(2) + "-" + date.substring(4);}

            else {newDate += date.substring(2, 4) + "-" + date.substring(5);}
        }

        else if (date.charAt(1) != '/') {
            newDate += date.substring(0, 2) + "-";

            if (date.charAt(4) == '/') {newDate += "0" + date.charAt(3) + "-" + date.substring(5);}

            else {newDate += date.substring(3, 5) + "-" + date.substring(6);}
        }

        // Output:
        System.out.println("The date in the format dd-mm-yyyy is " + newDate.substring(3, 5) + "-" + newDate.substring(0, 2) + "-" + newDate.substring(6));
    }
}
