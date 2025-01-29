// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop).

package Assignment;

import java.util.Scanner;

public class SumofallNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            else {
                sum += num;
                System.out.println("Summation of all no = " + sum);
            }

        }
    }
}
