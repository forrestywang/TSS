package G12_Chapter_2;

// @author Forrest Wang
// September 22, 2021
//
// Double_Integer
// Create a Double_Integer application that prompts the user to enter an integer and displays its double.

// Imports:
import java.util.*;
import java.io.*;
import java.text.*;

public class Double_Integer_Part_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        int integer;
        System.out.println("Enter an integer to double: ");
        integer = myScanner.nextInt();
        myScanner.close();

        // Output:
        System.out.println("2 * " + integer + " = " + (integer + integer));
    }
}