// Addition Of Two Numbers

package Assignment;

import java.util.Scanner;

public class Addition2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition Of Two Numbers = " + sum);
    }
}
