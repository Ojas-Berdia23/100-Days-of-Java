package Assignment;

// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Greeting {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.next();
        System.out.println("Good Morning " + name);
    }
}
