// Calculate Electricity Bill.

package Assignment;

import java.util.Scanner;

public class ElectricBill {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int usage = in.nextInt();
        int bill = 0;
        if(usage <= 100) {
            bill = 10 * usage;
            System.out.println(bill);
        }
        else {
            usage -= 100;
            bill = 1000;
            if(usage <= 100) {
                bill = 20 * usage + bill;
                System.out.println(bill);
            }
            else {
                usage -= 100;
                bill = 2500;
                if(usage <= 100) {
                    bill = 20 * usage + bill;
                    System.out.println(bill);
                }
                else {
                    usage -= 100;
                    bill = 4500;
                    System.out.println(bill);
                }
            }

        }
    }
}
