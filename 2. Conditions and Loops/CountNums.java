import java.util.Scanner;

public class CountNums {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 13839;
        int count = 0;
        while(n > 0) {
            int a  = n % 10;
            

            if (a == num) {
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
