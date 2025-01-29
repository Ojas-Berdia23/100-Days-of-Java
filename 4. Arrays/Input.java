import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives.
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 17;
        arr[3] = 9;
        arr[4] = 31;
        //Internally it is stored like
        // [23, 45, 17, 9, 31]
        //System.out.println(arr[3]);

        // Input using for loops
        // for(int i=0; i<arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr)); // best way

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // for (int num : arr) {
        //     System.out.print(num + " ");  //here num represent the element of array
        // }

        // System.out.println(arr[5]); // ArrayIndexOutOfBounds



        // Arrays of objects....
        String[] str = new String[5];
        for(int i=0; i<str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "ojas";
        System.out.println(Arrays.toString(str));

        in.close();
    }
}
