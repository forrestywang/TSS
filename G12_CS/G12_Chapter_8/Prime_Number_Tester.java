package G12_Chapter_8;

// @author Forrest Wang
// November 13, 2021
//
// Prime_Number_Tester
// Create a Prime_Number_Tester application that modifies the isPrime(); method on page 200 so that if the argument is
// odd, it only tests odd factors.

// Import(s):
import java.util.*;

public class Prime_Number_Tester {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        boolean noFactors = true;

        System.out.println("Enter a number to test if it is a prime number: ");
        int number = myScanner.nextInt();
        myScanner.close();

        if (number <= 1 || number % 2 == 0) {noFactors = false;}

        for (int i = 3; true; i += 2) {
            if (i * i > number) {break;}

            else if (number % i == 0) {noFactors = false;}
        }

        if (noFactors) {System.out.println(number + " is a prime number.");}

        else {System.out.println(number + " is not a prime number.");}
    }
}