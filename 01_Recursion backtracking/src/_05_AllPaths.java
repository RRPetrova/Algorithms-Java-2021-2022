import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_AllPaths {

    public static List<Character> directions = new ArrayList<>();

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
     //   System.out.println("enter x y ");

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

   //    printMatrix(matrix);

        findPaths(0, 0, ' ', matrix);

    }

    private static void findPaths(int rows, int cols, char direction, char[][] matrix) {
        if (!isInBounds(rows, cols, matrix)) {
           // System.out.println(isInBounds(rows, cols, matrix));
            return;
        }

        directions.add(direction);


        if (matrix[rows][cols] == 'e') {
            printPath();
            directions.remove(directions.size() - 1);
            return;
        } else if (matrix[rows][cols] != 'V' && matrix[rows][cols] != '*') {
            matrix[rows][cols] = 'V';
            findPaths(rows - 1, cols, 'U', matrix);
            findPaths(rows + 1, cols, 'D', matrix);
            findPaths(rows, cols - 1, 'L', matrix);
            findPaths(rows, cols + 1, 'R', matrix);
            matrix[rows][cols] = '-';
        }

        directions.remove(directions.size() - 1);

    }


    private static void printPath() {
        for (int i = 1; i < directions.size(); i++) {
            System.out.print(directions.get(i));
        }

     System.out.println();
    }


    private static boolean isInBounds(int rows, int cols, char[][] matrix) {
        return rows >= 0 && cols >= 0 && rows < matrix.length && cols < matrix[rows].length;
    }

    private static void printMatrix(char[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols]);
            }
            System.out.println();
        }
    }


}

