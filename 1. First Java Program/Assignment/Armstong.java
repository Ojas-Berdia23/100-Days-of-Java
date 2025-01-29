package Assignment;

// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstong {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = in.nextInt();
        int og = num;
        int temp = 0;
        for(int i=num; num>0; i++) {
            int num1 = num % 10;
            int num2 = num / 10;
            num = num2;
            temp = temp + num1*num1*num1;

        }
        System.out.println(temp);
        if(temp == og) {
            System.out.println("ArmStrong Number");
        }
        else {
            System.out.println("Not an ArmStrong Number");
        }
    }
}
