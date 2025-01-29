
import java.util.Scanner;

public class Temperature {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Temperature in Celsius: ");
        Float tempC = in.nextFloat();
        float tempF = (tempC * 9 / 5) + 32; 
        System.out.println("Temperature in Fahrenhiet = " + tempF);
    }
}
