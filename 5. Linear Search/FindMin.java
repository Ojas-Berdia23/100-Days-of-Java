public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(min(arr));
    }


    // return the minimum value in the array..
    static int min (int[] arr) {
        int n = 0;
        for (int i : arr) {
            n = Math.min(i, n);
        }
        return n;
    }

    // using for loop
    static int min2 (int[] arr) {
        int n = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < n) {
                n = arr[i];
            }
        }
        return n;
    }


}
