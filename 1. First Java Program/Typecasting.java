
import java.util.Scanner;

public class Typecasting {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // float num = input.nextInt();
        // int num = input.nextInt();
        // System.out.println(num);

        // TYPE CASTING
        // int num = (int)(67.4f);
        // System.out.println(num);

        // AUTOMATIC TYPE PROMOTION IN EXPRESSIONS
        // int a = 257;
        // byte b = (byte)(a); // 257 % 256 = 1
        // System.out.println(b);

        // int number = 'A';
        // System.out.println(number );




        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double

        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
