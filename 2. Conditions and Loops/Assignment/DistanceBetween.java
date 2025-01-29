// Calculate Distance Between Two Points.

package Assignment;

import java.util.Scanner;

public class DistanceBetween {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distances = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double distance;
//        distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)); 
        distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2)* 1.0);
        System.out.println("Distance bet 2 point = " + distance);

    }
}
