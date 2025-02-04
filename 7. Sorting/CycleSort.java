import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                swap(arr, i, arr[i] - 1);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
