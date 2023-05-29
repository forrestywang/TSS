package G11_Chapter_3;

// @author Forrest Wang
// March 4, 2021
// Bingo
//
// Create a Bingo application that displays a traditional bingo card with five columns of five unique numbers. The
// column labels are B, I, N, G, O. Column B contains numbers ranging from 1 through 15, column I has numbers ranging
// from 16 through 30, column N has four numbers randing from 31 through 45 and a Free Space in the middle of the
// column, column G has numbers ranging from 46 through 60, and column O has numbers randing from 61 through 75.

public class Bingo {
    public static void main(String[] args) {

        // Output:
        System.out.format("%8s%8s%8s%8s%8s", "B", "I", "N", "G", "O\n");
        System.out.format("%8s%8s%8s%8s%8s", "2", "20", "42", "60", "64\n");
        System.out.format("%8s%8s%8s%8s%8s", "14", "25", "32", "55", "70\n");
        System.out.format("%8s%8s%8s%8s%8s", "5", "18", "FREE", "53", "67\n");
        System.out.format("%8s%8s%8s%8s%8s", "12", "16", "31", "46", "75\n");
        System.out.format("%8s%8s%8s%8s%8s", "10", "22", "39", "59", "71\n");
    }
}