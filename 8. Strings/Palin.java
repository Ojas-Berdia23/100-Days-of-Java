import java.util.Scanner;

public class Palin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any Word: ");
        String word = in.next();
        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        in.close();

    }

    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
