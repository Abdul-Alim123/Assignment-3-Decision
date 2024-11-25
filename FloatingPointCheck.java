import java.util.Scanner;

public class FloatingPointCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        scanner.close();

        if (number == 0) {
            System.out.println("zero");
        } else {
            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            double absValue = Math.abs(number);
            if (absValue < 1) {
                System.out.println(" small");
            } else if (absValue > 1_000_000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }
    }
}
