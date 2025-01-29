// Area Of Circle, Triangle, Rectangle, Isosceles Triangle, Parallelogram, Rhombus, Equilateral Triangle Java Program.

package Assignment;

public class Area {
    public static void main(String[] args) {

        // Circle
        int radius = 5;
        double pi = 3.142, area;
        area = pi * radius * radius;
        System.out.println("Area of the Circle = " + area);

        // Triangle
        int b = 5;
        int h = 8;
        area = 0.5 * b * h;
        System.out.println("Area of Triangle = " + area);

        // Rectangle
        int l = 5;
        b = 8;
        area = l * b;
        System.out.println("Area of Rectangle = " + area);    
        
        // Isoceles Triangle
        b = 8;
        h = 8;
        area = 0.5 * b * h;
        System.out.println("Area of Isoceles Triangle = " + area);

        // Parallelogram
        b = 8;
        h = 6;
        area = b * h;
        System.out.println("Area of Parallelogram = " + area);

        // Rhombus
        int d1 = 8;
        int d2 = 5;
        area = 0.5 * d1 * d2;
        System.out.println("Area of Rhombus = " + area);

        // Equilateral Triangle  (root 3)/4 *a^2
        int a = 5;
        area = (1.732 * a * a) / 4;
        System.out.println("Area of Equilateral Triangle = " + area);

    }
}
