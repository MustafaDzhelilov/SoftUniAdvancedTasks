import java.util.Scanner;

public class revolt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int size = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];

        int rowIndex = -1;
        int colIndex = -1;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // find player in matrix
                if (line.charAt(col) == 'f') {
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

            boolean byPassFinishMark = false;



        while (n > 0){
            String command = sc.nextLine();
            n--;

            if(command.isEmpty()){
                break;
            }
            switch (command){
                case "up":
                    if(rowIndex - 1 < 0){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = matrix.length - 1;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    else if(matrix[rowIndex - 1][colIndex] == 'F'){
                        byPassFinishMark = true;
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex--;
                        matrix[rowIndex][colIndex] = 'f';
                        break;
                    }
                    else if(matrix[rowIndex - 1][colIndex] == 'B'){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex -2;
                        if(!(rowIndex - 2 < 0)) {
                            matrix[rowIndex][colIndex] = 'f';
                        }else{
                            rowIndex = matrix.length - 1;
                            if(matrix[rowIndex][colIndex] == 'F'){
                                byPassFinishMark = true;
                                matrix[rowIndex][colIndex] = 'f';
                                break;
                            }else {
                                matrix[rowIndex][colIndex] = 'f';
                            }
                        }
                    }else{
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex--;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    break;
                case "down":
                    if(rowIndex + 1 > matrix.length -1){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = 0;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    else if(matrix[rowIndex + 1][colIndex] == 'F'){
                        byPassFinishMark = true;
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex++;
                        matrix[rowIndex][colIndex] = 'f';
                        break;
                    }
                    else if(matrix[rowIndex + 1][colIndex] == 'B'){
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex = rowIndex + 2;
                        if(!(rowIndex + 2 > matrix.length - 1)) {
                            matrix[rowIndex][colIndex] = 'f';
                        }else{
                            rowIndex = 0;
                            if(matrix[rowIndex][colIndex] == 'F'){
                                byPassFinishMark = true;
                                matrix[rowIndex][colIndex] = 'f';
                                break;
                            }else {
                                matrix[rowIndex][colIndex] = 'f';
                            }
                        }
                    }else{
                        matrix[rowIndex][colIndex] = '-';
                        rowIndex++;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    break;
                case "left":
                    if(colIndex - 1 < 0){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = matrix.length -1;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    else if(matrix[rowIndex][colIndex - 1] == 'F'){
                        byPassFinishMark = true;
                        matrix[rowIndex][colIndex] = '-';
                        colIndex--;
                        matrix[rowIndex][colIndex] = 'f';
                        break;
                    }
                    else if(matrix[rowIndex][colIndex - 1] == 'B'){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex - 1;
                        if(!(colIndex - 2 < 0)) {
                            matrix[rowIndex][colIndex] = 'f';
                        }else{
                            colIndex = matrix.length - 1;
                            if(matrix[rowIndex][colIndex] == 'F'){
                                byPassFinishMark = true;
                                matrix[rowIndex][colIndex] = 'f';
                                break;
                            }else {
                                matrix[rowIndex][colIndex] = 'f';
                            }
                        }
                    }else{
                        matrix[rowIndex][colIndex] = '-';
                        colIndex--;
                        matrix[rowIndex][colIndex] = 'f';
                    }
                    break;
                case "right":
                    if(colIndex + 1 > matrix.length -1){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = 0;
                        matrix[rowIndex][colIndex] = 'f';

                    }
                    else if(matrix[rowIndex][colIndex + 1] == 'F'){
                        byPassFinishMark = true;
                        matrix[rowIndex][colIndex] = '-';
                        colIndex++;
                        matrix[rowIndex][colIndex] = 'f';
                        break;
                    }
                   else if(matrix[rowIndex][colIndex + 1] == 'B'){
                        matrix[rowIndex][colIndex] = '-';
                        colIndex = colIndex + 1;
                        if(!(colIndex + 2 > matrix.length - 1)) {
                            matrix[rowIndex][colIndex] = 'f';
                        }else{
                            colIndex = 0;
                            if(matrix[rowIndex][colIndex] == 'F'){
                                byPassFinishMark = true;
                                matrix[rowIndex][colIndex] = 'f';
                                break;
                            }else {
                                matrix[rowIndex][colIndex] = 'f';
                            }
                        }
                    }else{
                       matrix[rowIndex][colIndex] = '-';
                       colIndex++;
                       matrix[rowIndex][colIndex] = 'f';
                    }
                    break;

            }
        } // while

        if (byPassFinishMark){
            System.out.println("Player won!");
        }else{
            System.out.println("Player lost!");
        }
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
