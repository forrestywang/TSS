package G11_Chapter_3;

// @author Forrest Wang
// March 2, 2021
//
// Timetable
// Create a Timetable application that displays 4 columns representing your timetable with the period in the first
// column (left justified) and then the subject names, Teacher's name and the Room number as seen in the example below
// (right aligned). Choose column widths that work for you.

public class Timetable {
    public static void main(String[] args) {

        // Output:
        System.out.format("%-8s %-30s %-15s %5s", "Period", "Subject", "Teacher", "Room\n");
        System.out.format("%-8s %-30s %-15s %5s", "1", "English", "Ms. Swan", "112\n");
        System.out.format("%-8s %-30s %-15s %5s", "2", "Computer Science", "Mr. Benum", "221\n");
        System.out.format("%-8s %-30s %-15s %5s", "3", "Communication Technology", "Ms. Thompson", "146\n");
        System.out.format("%-8s %-30s %-15s %5s", "4", "Computer Engineering", "Mr. Naccarto", "227\n");
    }
}