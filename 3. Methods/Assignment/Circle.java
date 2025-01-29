// Java Program to Calculate Area and Circumference of Circle.

package Assignment;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();
        area(radius);
        circumference(radius);
    }

    static void area(int r) {

        double area = Math.PI * r * r;
        System.out.println("Area of the circle = " + area);
    }

    static void circumference(int r) {

        double circumference =  2 * Math.PI * r;
        System.out.println("Circumference of the circle = " + circumference);
    }

}
