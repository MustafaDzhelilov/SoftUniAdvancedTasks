import java.util.Scanner;

public class BookWorm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder string = new StringBuilder(sc.nextLine());
        StringBuilder help = new StringBuilder();
        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];

        int rowIndex = -1;
        int colIndex = -1;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // variant za namirane na P v matrix
                if (line.charAt(col) == 'P') {
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        String command = sc.nextLine();

        while (!command.equals("end")){

            switch (command){
                case "up":
                    if(rowIndex -1 < 0){
                        string.deleteCharAt(string.length() - 1);
                        rowIndex--;
                        command = sc.nextLine();
                        continue;
                    }
                  if(matrix[rowIndex - 1][colIndex] == '-'){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex -1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                   else {
                        char currentSymbol = matrix[rowIndex - 1][colIndex];
                        string.append(currentSymbol);
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex - 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                    break;
                case "down":
                    if(rowIndex + 1 > matrix.length - 1){
                        string.deleteCharAt(string.length() - 1);
                        rowIndex++;
                        command = sc.nextLine();
                        continue;
                    }
                   if(matrix[rowIndex + 1][colIndex] == '-'){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex + 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                   else {
                        char currentSymbol = matrix[rowIndex + 1][colIndex];
                        string.append(currentSymbol);
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex + 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                    break;
                case "left":
                    if(colIndex - 1 < 0){
                        string.deleteCharAt(string.length() - 1);
                        colIndex--;
                        command = sc.nextLine();
                        continue;
                    }
                   if(matrix[rowIndex][colIndex - 1] == '-'){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex - 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                   else {
                        char currentSymbol = matrix[rowIndex][colIndex - 1];
                        string.append(currentSymbol);
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex - 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                    break;
                case "right":
                    if(colIndex + 1 > matrix.length - 1){
                        string.deleteCharAt(string.length() - 1);
                        colIndex++;
                        command = sc.nextLine();
                        continue;
                    }
                   if(matrix[rowIndex][colIndex + 1] == '-'){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex + 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                   else {
                        char currentSymbol = matrix[rowIndex][colIndex + 1];
                        string.append(currentSymbol);
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex + 1;
                        matrix[rowIndex][colIndex] = 'P';
                    }
                    break;
            }


            command = sc.nextLine();
        } // while

        System.out.println(string);
        printMatrix(matrix);

    }

    public static void printMatrix(char[][]matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
