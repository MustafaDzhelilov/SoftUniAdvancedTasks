import java.util.Scanner;

public class MaximalSum_Excr_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int row = Integer.parseInt(tokens[0]);
        int col = Integer.parseInt(tokens[1]);
        int[][] matrix = new int[row][col];


        fillMatrix(sc, matrix, row, col);
        int sum = getSumOfElements3x3(matrix,row,col);
        System.out.println("Sum = " + sum);
        printMatrix(matrix,row,col);
    }

    private static int getSumOfElements3x3(int[][] matrix, int rows, int cols) {
        int sum = 0;
        for (int row = 1; row < rows  ; row++) {
            for (int col = 1; col < cols -1; col++) {
                sum += matrix[row][col];
            }
        }
        return  sum;
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 1; row < rows  ; row++) {
            for (int col = 1; col < cols -1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner sc, int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
