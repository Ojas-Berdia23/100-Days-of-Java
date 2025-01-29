// Find Ncr & Npr

package Assignment;

import java.util.Scanner;

public class NcrNpr {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num  = in.nextInt();
        int fact = 1;
        
        for (int i=1; i<=num; i++) {
            fact *= i; 
            System.out.println(fact);
        }
        System.out.println("Factorial  = " + fact);


    }
}
