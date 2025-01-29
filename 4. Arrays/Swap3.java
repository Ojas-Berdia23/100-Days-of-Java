import java.util.Arrays;

public class Swap3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 13, 29};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
