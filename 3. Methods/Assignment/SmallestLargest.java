// Find the Largest and Smallest of Three Numbers in Java.

package Assignment;

import java.util.Scanner;

public class SmallestLargest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int small = SmallNo(a, b, c);
        System.out.println("The smallest no. is " + small);
        int large = LargeNo(a, b, c);
        System.out.println("The largest no. is " + large);

    }
    static int SmallNo(int a, int b, int c) {
        int max = Math.min(a, Math.min(b, c));
        return max;
    }

    static int LargeNo(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        return max;
    }
}
