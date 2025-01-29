// Calculate Discount Of Product.

package Assignment;

import java.util.Scanner;

public class DiscountofProduct {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the MRP of product = ");
        int price = in.nextInt();
        System.out.print("Enter the discount in %age = ");
        int discount = in.nextInt();
        int disprice = (price * discount) / 100;
        price -= disprice;

        System.out.print("Amount to be paid = Rs" +  price);

    }
}
