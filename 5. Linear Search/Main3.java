public class Main3 {
    public static void main(String[] args) {
        int[] arr = {5,5,4,9,6,2,15,7,0};
        int n = 9;
        int ans = linearSearch(arr, n);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int num) {
        if(arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if(element == num) {
                return true;
            }
        }

        // this line will execute if none of the return statements above have executed.
        // hence the target not found.
        return false;
    }


    // search the target and return the element
    static int linearSearch2(int[] arr, int num) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int element : arr) {
            if(element == num) {
                return element;
            }
        }

        // this line will execute if none of the return statements above have executed.
        // hence the target not found.
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int num) {
        if(arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = num
            int element = arr[i];
            if(element == num) {
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed.
        // hence the target not found.
        return -1;
    }

}
