package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Necklace_Problem
// Create a Necklace_Problem application that when given the starting numbers for several necklaces, print the pattern
// on each. Each necklace consists of beads labelled with a single digit number between 1 and 9 both inclusive. The
// order of the beads follow this pattern: starting from two single digit numbers, add them together add a bead labelled
// with the ones digit of the sum. Repeat this process using the last two beads until you arrive at the original first
// two numbers.

// Imports:
import java.util.*;

public class Necklace_Problem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Enter the number of necklaces: ");
        int necklaces = myScanner.nextInt();

        for (byte i = 1; i <= necklaces; i++) {
            System.out.println("Enter the numbers on the first and second beads (1 to 9, Ex. If the first number is 1, and the second is 8, enter: 1 8): ");
            byte originalNumber1 = myScanner.nextByte();
            byte originalNumber2 = myScanner.nextByte();

            byte number1;
            byte number2;
            byte number3;

            // Output:
            System.out.print(originalNumber1 + " " + originalNumber2);

            // Calculations:
            number3 = (byte) (originalNumber1 + originalNumber2);
            if (Math.log10(number3) >= 1) {number3 -= 10;}
            System.out.print(" " + number3);

            number1 = originalNumber2;
            number2 = number3;
            number3 = (byte) (number1 + number2);

            if (Math.log10(number3) >= 1) {number3 -= 10;}

            System.out.print(" " + number3);

            while (true) {
                number1 = number2;
                number2 = number3;
                number3 = (byte) (number1 + number2);

                if (Math.log10(number3) >= 1) {number3 -= 10;}

                else if (number1 == originalNumber1 && number2 == originalNumber2) {break;}

                System.out.print(" " + number3);
            }

            System.out.println();
        }
        myScanner.close();
    }
}