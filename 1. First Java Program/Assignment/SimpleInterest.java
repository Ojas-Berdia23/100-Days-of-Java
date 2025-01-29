package Assignment;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        int T = in.nextInt();
        int R = in.nextInt();

        int SimpleInterest = P * R * T / 100;
        System.out.println("Simple Interest = " + SimpleInterest);

    }
}
