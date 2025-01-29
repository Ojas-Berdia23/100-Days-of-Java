// Addition of two numbers in Java using method

package Assignment;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        // using the method
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first no. = ");
        int num1 = in.nextInt();
        System.out.println("Enter the second no. = ");
        int num2 = in.nextInt();
        in.close();

        sum(num1, num2);
        
    }

    static void sum(int num1, int num2) {
        int sum = num1+ num2;
        System.out.println("Sum of 2 number = " + sum);
    }
}
