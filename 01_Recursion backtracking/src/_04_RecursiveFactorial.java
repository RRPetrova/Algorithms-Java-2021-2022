import java.util.Scanner;

public class _04_RecursiveFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = calcFactorial(n);
        System.out.println(sum);

    }

    //5 => 1* 2*3*4*5
    private static int calcFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * calcFactorial(n - 1);
    }
}
