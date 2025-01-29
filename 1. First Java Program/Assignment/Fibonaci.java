package Assignment;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonaci {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;

        if(num == 0){
            System.out.println(0);
            
        }
        else if(num == 1){
            System.out.println(1);
     
        }

        System.out.print( "0 1 " );

        for (int i=0; i<num-2; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print( b + " ");
        }

    }
}
