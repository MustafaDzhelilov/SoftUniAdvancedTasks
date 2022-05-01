import java.util.Scanner;

public class Matrix_Polindrome_Excr_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        String [][] matrix = new String[rows][columns];
        char startLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                String palindrome = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindrome;
            }
            startLetter = (char)(startLetter + 1);
        }
            printMatrix(matrix, rows, columns);

    }

    public static void printMatrix(String[][] matrix, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}
