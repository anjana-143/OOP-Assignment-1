package Assignment;
import java.util.Scanner;
public class TwoFloatingAns7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 100);
        x = x / 100;

        y = Math.round(y * 100);
        y = y / 100;

        if (x == y) {
            System.out.println("They are the same up to two decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
