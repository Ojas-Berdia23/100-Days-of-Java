// Volume Of Cone, Prism, Cylinder, Sphere, Pyramid Java Program

package Assignment;

public class Volume {
    public static void main(String[] args) {
        
        // Cone
        int h = 5;
        int r = 4;
        double pi = 3.14;
        double volume = (pi * r * r * h)/3f;
        System.out.println("Volume of Cone = " + volume);

        // Prism
        int b = 5;
        int l = 8;
        h = 3;
        volume = b * h * l;
        System.out.println("Volume of Prism = " + volume);

        // Cylinder
        r = 4;
        h = 7;
        volume = pi * r * r * h;
        System.out.println("Volume of Cylinder = " + volume); 

        // Sphere
        r = 2;
        volume = (4 * pi * r * r * r) / 3f;
        System.out.println("Volume of Sphere = " + volume);

        // Pyramid
        l = 5;
        b = 4;
        h = 8;
        volume = (l * b * h)/3f;
        System.out.println("Volume of Pyramid = " + volume);
    }
}
