package G11_Chapter_4;

// @author Forrest Wang
// March 17th, 2021
//
// Election
// Create an Election application that when Given the number of votes each candidate received, output information about
// the results in a table format.

// Imports:
import java.util.*;
import java.text.*;

public class Election {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Variables:
        System.out.println("Note: the total number of votes cannot exceed 37,411,047 votes.");
        System.out.println("Enter the number of votes for the first candidate: ");
        int v1 = myScanner.nextInt();
        System.out.println("Enter the number of votes for the second candidate: ");
        int v2 = myScanner.nextInt();
        System.out.println("Enter the number of votes for the third candidate: ");
        int v3 = myScanner.nextInt();
        System.out.println("Enter the name for the first candidate: ");
        String candidate1 = myScanner.next();
        System.out.println("Enter the name for the second candidate: ");
        String candidate2 = myScanner.next();
        System.out.println("Enter the name for the third candidate: ");
        String candidate3 = myScanner.next();
        myScanner.close();

        // Calculations:
        int totalVotes = v1 + v2 + v3;
        double percentage1 = ((double)v1 / totalVotes) * 100;
        double percentage2 = ((double)v2 / totalVotes) * 100;
        double percentage3 = ((double)v3 / totalVotes) * 100;

        // Formatting:
        DecimalFormat formatting = new DecimalFormat("#.00");

        // Output:
        System.out.format("%-15s%10s%15s", "Candidate:", "Votes:", "Percentage:\n");
        System.out.format("%-15s%10s%15s", candidate1, v1, formatting.format(percentage1) + " %\n");
        System.out.format("%-15s%10s%15s", candidate2, v2, formatting.format(percentage2) + " %\n");
        System.out.format("%-15s%10s%15s", candidate3, v3, formatting.format(percentage3) + " %\n");
        System.out.format("\n");
        System.out.format("%-15s%10s", "Total Votes:", totalVotes);
    }
}