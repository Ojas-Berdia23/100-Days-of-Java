package Assignment;

// Input currency in rupees and output in USD.
// 1 Indian Rupee equals 0.012 United States Dollar

import java.util.Scanner;

public class INRtoUSD {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = in.nextInt();
        System.out.println(num * 0.012);
    }
}