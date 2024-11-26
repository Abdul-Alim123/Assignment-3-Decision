import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (less than 10 billion): ");
        long number = scanner.nextLong();

        scanner.close();

        if (number < 0) {
            number = -number;
        }

        if (number == 0) {
            System.out.println("The number has 1 digit.");
        } else if (number < 10) {
            System.out.println("The number has 1 digit.");
        } else if (number < 100) {
            System.out.println("The number has 2 digits.");
        } else if (number < 1_000) {
            System.out.println("The number has 3 digits.");
        } else if (number < 10_000) {
            System.out.println("The number has 4 digits.");
        } else if (number < 100_000) {
            System.out.println("The number has 5 digits.");
        } else if (number < 1_000_000) {
            System.out.println("The number has 6 digits.");
        } else if (number < 10_000_000) {
            System.out.println("The number has 7 digits.");
        } else if (number < 100_000_000) {
            System.out.println("The number has 8 digits.");
        } else if (number < 1_000_000_000) {
            System.out.println("The number has 9 digits.");
        } else if (number < 10_000_000_000L) {
            System.out.println("The number has 10 digits.");
        } else {
            System.out.println("The number is too large!");
        }
    }
}
