// Program to find Prime Numbers Between given Interval.

package Assignment;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        in.close();
        for(int i = num1; i <= num2; i++) {
            if (Prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean Prime(int num) {

        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i * i < num) {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return i * i >  num;
    }
    
}
