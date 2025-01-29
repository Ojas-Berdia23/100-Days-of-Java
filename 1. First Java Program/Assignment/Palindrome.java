package Assignment;

// To find out whether the given String is Palindrome or not. Eg. level, radar

import java.util.Scanner;

public class Palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any Word: ");
        String word = in.next();
         
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) == word.charAt(right)) {
                left++;
                right--;
            }
            else {
                System.out.println("Not Palindrome");
            }    
        }
        System.out.println("Palindrome");
        
    }
}
