package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        if(checkPalindrome(num)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static boolean checkPalindrome(int n) {
        int ans = 0;
        int temp = n;
        while (temp > 0) {
            ans = (temp % 10) + (ans * 10);
            temp /= 10;
        }
        if (ans == n) {
            return true;
        }
        return false;
    }
}
