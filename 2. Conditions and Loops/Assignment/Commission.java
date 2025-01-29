// Calculate Commission Percentage

package Assignment;

import java.util.Scanner;

public class Commission {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sale: ");
        int sales = sc.nextInt();
        float commission;
        
        if(sales >= 100000) { // 25%
            commission = (sales * 25)/100;
        }
        else if(sales >= 80000 && sales <= 99999) { // 22%
            commission = (sales * 22)/100;
        }
        else if(sales >= 60000 && sales <= 79999) { // 20%
            commission = (sales * 20)/100;
        }
        else if(sales >= 40000 && sales <= 59999) { // 15%
            commission = (sales * 15)/100;
        }
        else {
            commission = (sales * 12)/100;
        }
        System.out.println(commission);
    }
}
