import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 13, 29};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse (int[] arr) {
        int end = arr.length-1;
        for(int i=0; i<arr.length/2; i++) {
            arr[i] = arr[end];
            i++;
            end--;
        }
    }
}
