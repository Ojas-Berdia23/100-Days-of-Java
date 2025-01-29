package Assignment;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 number = ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 >= num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }
}
