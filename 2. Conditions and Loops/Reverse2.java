import java.util.Scanner;

public class Reverse2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        while(n > 0) {
            int a  = n % 10;
            ans = a + 10 * ans;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
