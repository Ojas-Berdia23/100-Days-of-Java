package Assignment;

import java.util.Scanner;

public class PerfectNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 1;
        int sum = 0;
        while(i < num) {
            if(num % i == 0) {
                sum += i;
            }
            i++;
        }
        if(sum == num) {
            System.out.println("Perfect no");
        }
        else {
            System.out.println("Not a Perfect no");
        }
    }
}
