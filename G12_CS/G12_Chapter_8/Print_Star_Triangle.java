package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Print_Star_Triangle
// Create a Print_Star_Triangle application that prompts the user for the size of an isosceles triangle and then
// displays the triangle with that many lines.

// Import(s):
import java.util.*;

public class Print_Star_Triangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the size of the isosceles triangle: ");
        int size = myScanner.nextInt();
        int sizeInitial = size;
        myScanner.close();

        int incrementer = 0;

        // Output:
        for (int i = 0; i < sizeInitial; i++, size--, incrementer += 2) {
            for (int a = 0; a < size - 1; a++) {System.out.print(" ");}

            for (int b = 0; b < 1 + incrementer; b++) {System.out.print("*");}
            System.out.println();
        }
    }
}