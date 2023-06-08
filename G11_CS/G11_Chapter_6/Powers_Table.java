package G11_Chapter_6;

// @author Forrest Wang
// April 10, 2021
//
// Powers_Table
// Create a Powers_Table application that displays a table of powers.

public class Powers_Table {
    public static void main(String[] args) {

        // Formatting:
        System.out.format("%10s %10s %10s %10s %10s", "x¹", "x²", "x³", "x⁴", "x⁵\n");

        // Calculations:
        for (int i = 1; i <= 6; i++) {
            System.out.format("%10s %10s %10s %10s %10s", Math.pow(i, 1), Math.pow(i, 2), Math.pow(i, 3), Math.pow(i, 4), Math.pow(i, 5) + "\n");
        }
    }
}