import java.util.Scanner;

public class PrimeNo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));

    }

    static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i * i < num) {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return i * i >  num;
    }
}
