package G12_Chapter_10;

// @author Forrest Wang
// November 30, 2021
//
// Fibonacci
// Create a Fibonacci application that prompts the user for the term number in the Fibonacci sequence and calculates it
// using recursion.

// Import(s):
import java.util.*;

public class Fibonacci {
    public static int fib(int input) {
        if (input == 1 || input == 2) {return input - 1;}

        return fib(input - 1) + fib(input - 2);
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the term number in the Fibonacci sequence: ");
        int input = myScanner.nextInt();

        System.out.println("Term " + input + " in the Fibonacci sequence is " + fib(input) + ".");
    }
}