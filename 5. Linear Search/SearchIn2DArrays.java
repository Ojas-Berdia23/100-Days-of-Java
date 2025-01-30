import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
               {1, 2, 3}, // 0th index
               {4, 5, 0}, // 1st index
               {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
        };
        int target = 0;
        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == num) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] >= n) {
                    n = arr[i][j];
                }
            }
        }
        return n;
    }
}
