package Assignment;


import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.

public class Oddeven {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        }
        else {
            System.out.println(num + " is Odd.");
        }
    }
}
