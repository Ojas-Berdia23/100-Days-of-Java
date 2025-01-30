public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {5,4,9,6,2,15,7,0};
        int n = 5;
        int ans = Search(arr, n, 1, 4);
        System.out.println(ans);
    }

    static int Search(int[] arr, int num, int start, int end) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int i = start; i < end; i++) {
            // check for element at every index if it is = num
            int element = arr[i];
            if(element == num) {
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed.
        // hence the target not found.
        return Integer.MAX_VALUE;
    }

}
