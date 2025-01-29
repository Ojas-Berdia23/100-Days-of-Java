package Assignment;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class BasicCalc {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers = ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Select an operator = ");
        char operator = in.next().trim().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        }
        else if (operator == '-') {
            System.out.println(num1 - num2);
        }
        else if (operator == '*') {
            System.out.println(num1 * num2);
        }
        else if (operator == '/') {
            System.out.println(num1 / num2);
        }
        else if (operator == '%') {
            System.out.println(num1 % num2);
        }
        else {
            System.out.println("Please enter the operator Correctly");
        }
    }
}
