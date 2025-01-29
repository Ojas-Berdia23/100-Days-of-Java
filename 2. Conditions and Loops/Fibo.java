import java.util.Scanner;

public class Fibo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; //previous
        int b = 1; //current
        int count  = 2;

        while (count <=n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(b);
        
    }
}
