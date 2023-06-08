package G11_Chapter_8;

// @author Forrest Wang
// May 5, 2021
//
// Perfect_Integers
// Create a Perfect_Integers application that displays all perfect integers up to 100. A perfect integer is a number
// which is equal to the sum of all its factors except itself. For example, 6 is a perfect integer because the factors
// 1, 2, and 3 sum up to 6. The application should include a boolean method isPerfect().

public class Perfect_Integers {

    /**
     * Pre-condition: Requires the value of i.
     * Post-condition: Checks if the value of i is a perfect integer. If it is, the method outputs it.
     */
    public static void isPerfect(int i) {
        // Variables:
        byte factorSum = 0;

        // Calculations:
        for (byte a = 1; a < i; a++) {if (i % a == 0) {factorSum += a;}}

        // Output:
        if (factorSum == i) {System.out.print(i + " ");}
    }

    /**
     * Pre-condition: Nothing.
     * Post-condition: Should execute the isPerfect() method 100 times to output the perfect integers from 1 - 100.
     */
    public static void main(String[] args) {
        // Output:
        for (byte i = 1; i <= 100; i++) {isPerfect(i);}
    }
}