package Assignment;

import java.util.Scanner;

public class VoteorNot {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = in.nextInt();

        boolean op = isVote(age);
        System.out.println(op);
    }
    static boolean isVote(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
