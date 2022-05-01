import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossFire_Excr_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] dimension = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimension[0];
        int cols = dimension[1];

        List<List<Integer>> matrix = new ArrayList<>();

        fillMatrix(matrix, rows, cols);

        String command = sc.nextLine();

        while (!command.equals("Nuke it from orbit")){
         String[] tokens = command.split("\\s+");
         int row = Integer.parseInt(tokens[0]);
         int col = Integer.parseInt(tokens[1]);
         int radius = Integer.parseInt(tokens[2]);

         //destroy up, down
            for (int currentRow = row - radius; currentRow < row + radius ; currentRow++) {
                if(isInMatrix(col, currentRow, matrix)){
                    matrix.get(currentRow).remove(col);
                }


            }
            //destroy left, right
            for (int currentCol = col + radius; currentCol >= col - radius; currentCol--) {
                if(isInMatrix(row, currentCol, matrix)) {
                    matrix.get(row).remove(currentCol);
                }
            }

         matrix.removeIf(List::isEmpty);

         command = sc.nextLine();
        }
        printMatrix(matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
       return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row:matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }
}
