import java.util.Scanner;

public class _02_RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n  = Integer.parseInt(scanner.nextLine());
        printFigure(n);


    }

    private static void printFigure(int n) {
        if (n == 0) {
            return;
        }
        printLineOfChars("*", n);
        printFigure(n-1);
        printLineOfChars("#", n);
    }

    private static void printLineOfChars(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}
