import java.util.Arrays;
import java.util.Scanner;

public class _01_ArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int recSum = sumNumbers(arr, arr.length - 1);
        System.out.println(recSum);
    }

    private static int sumNumbers(int[] array, int index) {
        if (index < 0) {
            return 0;
        }
        return array[index] + sumNumbers(array, index - 1);
    }
}
