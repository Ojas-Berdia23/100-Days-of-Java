// Subtract the Product and Sum of Digits of an Integer.

package Assignment;

public class ProductSum {
    public static void main(String[] args) {
        int n = 234;
        int product = 1, sum = 0;
        while(n > 0) {
            int a = n % 10;
            product *= a;
            sum += a;
            n = n / 10;
        }
        System.out.println(product - sum);
    }
    
}
