// Perimeter Of Circle, Equilateral Triangle, Parallelogram, Rectangle, Square, Rhombus

package Assignment;

public class Perimeter {
    public static void main(String[] args) {
        
        // Circle
        int r = 5;
        double pi = 3.142;
        double perimeter = 2 * pi * r;
        System.out.println("Perimeter of Circle = " + perimeter);

        // Equilateral Triangle
        int a = 6;
        perimeter = 3 * a;
        System.out.println("Perimeter of Equilateral Triangle = " + perimeter); 

        // Parallelogram
        int l = 5;
        int b = 5;
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of Parallelogram = " + perimeter);

        // Rectangle
        l = 6;
        b = 3;
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of Rectangle = " + perimeter);

        // Square
        a = 7;
        perimeter = 4 * a;
        System.out.println("Perimeter of Square = " + perimeter);

        // Rhombus
        a = 3;
        perimeter = 4 * a;
        System.out.println("Perimeter of Rhombus = " + perimeter);


    }
}
