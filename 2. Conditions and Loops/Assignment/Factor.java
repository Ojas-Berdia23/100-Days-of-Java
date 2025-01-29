// Input a number and print all the factors of that number (use loops).

package Assignment;

import java.util.Scanner;

public class Factor {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i=1; i<=num; i++) {
            if (num % i ==0){
                System.out.println(i + " ");
            }
        }
    }
}
