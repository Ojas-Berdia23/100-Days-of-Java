
import java.util.Scanner;

public class Inputs {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll no. = ");
        int rollno = input.nextInt();
        System.out.println("Your rollno is " + rollno);
    }
}
