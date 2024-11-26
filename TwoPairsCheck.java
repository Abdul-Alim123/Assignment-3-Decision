import java.util.Scanner;
import java.util.HashMap;

public class TwoPairsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        scanner.close();

        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(num1, countMap.getOrDefault(num1, 0) + 1);
        countMap.put(num2, countMap.getOrDefault(num2, 0) + 1);
        countMap.put(num3, countMap.getOrDefault(num3, 0) + 1);
        countMap.put(num4, countMap.getOrDefault(num4, 0) + 1);

        if (countMap.size() == 2 && countMap.containsValue(2)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
    }
}
