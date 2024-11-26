import java.util.Scanner;

public class WordHalfComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        scanner.close();

        int length = word.length();
        int mid = length / 2;

        String firstHalf = word.substring(0, mid);
        String secondHalf = word.substring((length % 2 == 0) ? mid : mid + 1);

        if (firstHalf.equals(secondHalf)) {
            System.out.println("first and second half same");
        } else {
            System.out.println("first and second half different");
        }
    }
}

