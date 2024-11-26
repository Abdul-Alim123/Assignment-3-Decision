import java.util.Scanner;

public class FlexibleNumberOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Should the comparison be 'strict' or 'lenient'? ");
        String mode = scanner.nextLine().toLowerCase();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        boolean increasing, decreasing;

        if (mode.equals("strict")) {
            increasing = (num1 < num2 && num2 < num3);
            decreasing = (num1 > num2 && num2 > num3);
        } else {
            increasing = (num1 <= num2 && num2 <= num3);
            decreasing = (num1 >= num2 && num2 >= num3);
        }

        if (increasing) {
            System.out.println("increasing");
        } else if (decreasing) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }
}
