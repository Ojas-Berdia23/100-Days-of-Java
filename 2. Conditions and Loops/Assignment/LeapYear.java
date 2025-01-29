package Assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
