import java.util.Scanner;

public class _03_Generating01Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n");
        int n = Integer.parseInt(scanner.nextLine());

        Integer[] array = new Integer[n];

        fillArray(array, 0);


    }

    private static void fillArray(Integer[] array, int index) {

        if (index >= array.length) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i <= 1; i++) {
            array[index] = i;
            fillArray(array, index + 1);
        }

    }

}
