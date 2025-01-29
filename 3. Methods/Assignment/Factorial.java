package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
        in.close();
    }
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (n*factorial(n-1));
        }
    }
}
