package G11_Chapter_4;

// @author Forrest Wang
// March 10, 2021
//
// Distance_Part_1
// Program an application that calculates the total distance of a race with three segments

public class Distance_Part_1 {

    public static void main(String[] args) {

        // Variables:
        float firstDistance = 12.2f; //In kilometres.
        float secondDistance = 10.6f; //In kilometres.
        float thirdDistance = 5.8f; //In kilometres.

        //Calculations:
        float totalDistance = firstDistance + secondDistance + thirdDistance;

        //Output:
        System.out.print("The race is ");
        System.out.format("%.1f", totalDistance);
        System.out.print(" kilometres long");
    }

}