// Calculate CGPA Java Program


package Assignment;

import java.util.Scanner;

public class CoumpoundInt {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the  principle, rate, no.of time interest, time resp. =  ");
        int p = in.nextInt(); // value at start
        float r = in.nextFloat();
        int n = in.nextInt();
        int t = in.nextInt();

        double a = p -( p * Math.pow(1 + r/100, n*t));
        System.out.println("Compund Interest = " + a );
    }
}
