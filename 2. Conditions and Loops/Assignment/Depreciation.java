// Calculate Depreciation of Value.

package Assignment;

import java.util.Scanner;

public class Depreciation {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the  certain value, rate, time resp. =  ");
        int v1 = in.nextInt(); // value at start
        int r = in.nextInt();
        int t = in.nextInt();

        double v2 = v1 * Math.pow(1 - r/100.0, t);
        System.out.println("Depreciation of Value = " + v2);
    }
}
