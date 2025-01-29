package Assignment;

import java.util.Scanner;

public class ReverseString {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word = ");
        String word  = in.next();
        int right = word.length() - 1;

        while (right >= 0){
            char ch = word.trim().charAt(right);
            System.out.print(ch); 
            right--;
        }
        


    }
}
