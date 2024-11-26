import java.util.Scanner;

public class FirstLastLetterComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        scanner.close();

        if (input.length() == 0) {
            System.out.println("The string is empty.");
        } else {
            char firstLetter = input.charAt(0);
            char lastLetter = input.charAt(input.length() - 1);

            if (firstLetter == lastLetter) {
                System.out.println("first and last letter same");
            } else {
                System.out.println("first and last letter different");
            }
        }
    }
}
