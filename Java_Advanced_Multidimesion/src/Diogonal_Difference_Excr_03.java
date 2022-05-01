import java.util.Scanner;

public class Diogonal_Difference_Excr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());

        int [][] matrix = new int[size][size];

        fillMatrix(sc,matrix, size);

        int sumPrimaryDiagonal = getSumOFPrimaryDiagonal(matrix,size);
        int sumSecondaryDiagonal = getSumOfSecondaryDiagonal(matrix, size);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }

    private static int getSumOfSecondaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if((row + col) == (size - 1)){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int getSumOFPrimaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row == col){
                    sum += matrix[row][col];
                }
            }
        }
        return  sum;
    }

    private static void printMatrix(int[][] matrix, int size, int size1) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner sc, int[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
    }
}
