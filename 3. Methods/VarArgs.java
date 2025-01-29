import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 45, 6, 8, 90, 1, 0);
        fun();
    }

    

    static void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }
}
