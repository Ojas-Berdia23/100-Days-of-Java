// print all the 3 digits Armstrong No. 

public class ArmStrong {
    public static void main(String[] args) {
        for (int i=100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int num = n;
        int ans = 0;

        while (num > 0 ) {
            int temp = num % 10;
            ans = ans + temp*temp*temp;                
            num = num / 10;
        }
        return ans == n;
    }

    static void arm() {
        int n = 100;
        while (n < 1000) {
            int num = n;
            int ans = 0;


            while (num > 0 ) {
                int temp = num % 10;
                ans = ans + temp*temp*temp;
                num = num / 10;
            }
            if (n == ans) {
                System.out.println(n);
            }
            n++;
        }
    }
}
