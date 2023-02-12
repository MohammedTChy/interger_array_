import java.util.*;

public class Main {
    public static int countDuplicate(int[] numbers) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int value : map.values()) {
            if (value > 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int result = countDuplicate(numbers);
        System.out.println(result);
    }
}
