// Java program to multiply two numbers using method.

package Assignment;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int sol = multiply();
        System.out.println("Multiplication of 2 no. = "+ sol);
    }

    static int multiply() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first no. = ");
        int num1 = in.nextInt();
        System.out.print("Enter the second no. = ");
        int num2 = in.nextInt();
        in.close();

        int ans = num1 * num2;
        return ans;
    }
}
