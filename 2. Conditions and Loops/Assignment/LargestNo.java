// Take integer inputs till the user enters 0 and print the largest number from all.

package Assignment;

import java.util.Scanner;

public class LargestNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            else {
                max = Math.max(max, num);
                System.out.println("Largest No. = " + max);
            }

        }
    }
}
