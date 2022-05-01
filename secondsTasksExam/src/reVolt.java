import java.util.Scanner;

public class reVolt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        String command = "a";

        int roxIndex = -1;
        int colIndex = -1;
        boolean find = false;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // find player in matrix
                if (line.charAt(col) == 'f') {
                    roxIndex = row;
                    colIndex = col;
                }
            }
        }
        while (n > 0){
            if(command.equals(" ")){
                break;
            }
            command = sc.nextLine();
            n--;
             switch (command){
                 case "up":
                     if(!(roxIndex - 1 < 0)) {
                         if (matrix[roxIndex - 1][colIndex] == 'B') {
                             matrix[roxIndex][colIndex] = '-';
                             roxIndex = roxIndex - 2;
                             if(!(roxIndex - 2 < 0)) {
                                 matrix[roxIndex][colIndex] = 'f';
                             }else{
                                 matrix[roxIndex][colIndex] = '-';
                                 roxIndex = matrix.length - 1;
                                 matrix[roxIndex][colIndex] = 'f';
                             }
                             continue;

                         } else if (matrix[roxIndex - 1][colIndex] == 'F') {
                             matrix[roxIndex][colIndex] = '-';
                             matrix[roxIndex - 1][colIndex] = 'f';
                             System.out.println("Player won!");
                             find = true;
                             printMatrix(matrix);
                             break;
                         }else if(matrix[roxIndex - 1][colIndex] == 'T'){
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }else{
                             matrix[roxIndex][colIndex] = '-';
                             roxIndex = roxIndex - 1;
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }
                     }else{
                         matrix[roxIndex][colIndex] = '-';
                         roxIndex = matrix.length - 1;
                         matrix[roxIndex][colIndex] = 'f';
                         continue;
                     }
                 case "down":
                     if(!(roxIndex + 1 > matrix.length -1)) {
                         if (matrix[roxIndex + 1][colIndex] == 'B') {
                             matrix[roxIndex][colIndex] = '-';
                             roxIndex = roxIndex + 1;
                             if(!(roxIndex + 1 > matrix.length -1)) {
                                 roxIndex = roxIndex + 1;
                                 matrix[roxIndex][colIndex] = 'f';
                             }else{
                                 matrix[roxIndex][colIndex] = '-';
                                 roxIndex = roxIndex + 1;
                                 matrix[roxIndex][colIndex] = 'f';
                             }
                             continue;
                         } else if (matrix[roxIndex + 1][colIndex] == 'F') {
                             matrix[roxIndex][colIndex] = '-';
                             matrix[roxIndex + 1][colIndex] = 'f';
                             System.out.println("Player won!");
                             find = true;
                             printMatrix(matrix);
                             break;
                         }else if(matrix[roxIndex + 1][colIndex] == 'T'){
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }else{
                             matrix[roxIndex][colIndex] = '-';
                             roxIndex = roxIndex + 1;
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }
                     }else{
                         matrix[roxIndex][colIndex] = '-';
                         roxIndex = roxIndex = 0;
                         matrix[roxIndex][colIndex] = 'f';
                         continue;
                     }
                 case "left":
                     if(!(colIndex - 1 < 0)) {
                         if (matrix[roxIndex][colIndex - 1] == 'B') {
                             matrix[roxIndex][colIndex] = '-';
                             colIndex = colIndex - 2;
                             if(!(colIndex - 2 < 0)) {
                                 colIndex = colIndex -2;
                                 matrix[roxIndex][colIndex] = 'f';
                             }else{
                                 colIndex = colIndex - 1;
                                 matrix[roxIndex][colIndex] = 'f';
                             }
                             continue;
                         } else if (matrix[roxIndex][colIndex - 1] == 'F') {
                             matrix[roxIndex][colIndex] = '-';
                             matrix[roxIndex][colIndex - 1] = 'f';
                             System.out.println("Player won!");
                             find = true;
                             printMatrix(matrix);
                             break;
                         }else if(matrix[roxIndex][colIndex - 1] == 'T'){
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }else{
                             matrix[roxIndex][colIndex] = '-';
                             colIndex = colIndex - 1;
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }
                     }else{
                         matrix[roxIndex][colIndex] = '-';
                         colIndex = colIndex = matrix.length -1;
                         matrix[roxIndex][colIndex] = 'f';
                         continue;
                     }

                 case "right":
                     if(!(colIndex + 1 > matrix.length - 1)) {
                         if (matrix[roxIndex][colIndex + 1] == 'B') {
                             matrix[roxIndex][colIndex] = '-';
                             colIndex = colIndex + 2;
                             if(!(colIndex + 2 > matrix.length - 1)) {
                                 colIndex = colIndex = 0;
                                 matrix[roxIndex][colIndex] = 'f';
                             }else{
                                 matrix[roxIndex][colIndex] = '-';
                                 colIndex = colIndex = 0;
                                 matrix[roxIndex][colIndex] = 'f';
                             }
                             continue;
                         } else if (matrix[roxIndex][colIndex + 1] == 'F') {
                             matrix[roxIndex][colIndex] = '-';
                             matrix[roxIndex][colIndex + 1] = 'f';
                             System.out.println("Player won!");
                             find = true;
                             printMatrix(matrix);
                             break;
                         }else if(matrix[roxIndex][colIndex + 1] == 'T'){
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }else{
                             matrix[roxIndex][colIndex] = '-';
                             colIndex = colIndex + 1;
                             matrix[roxIndex][colIndex] = 'f';
                             continue;
                         }
                     }else{
                         matrix[roxIndex][colIndex] = '-';
                         colIndex = colIndex = 0;
                         matrix[roxIndex][colIndex] = 'f';
                         continue;
                     }
                     }
                     break;
             }
        if(!(find)) {
            System.out.println("Player lost!");
            printMatrix(matrix);
        }
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
