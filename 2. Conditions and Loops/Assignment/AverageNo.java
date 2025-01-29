// Calculate Average Of N Numbers.

package Assignment;

import java.util.Scanner;

public class AverageNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the quantity of number = ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            int num = in.nextInt();
            sum += num;
        }
        double avg = sum / n;
        System.out.println("Average Of N Numbers = " + avg);
        
    }
}
