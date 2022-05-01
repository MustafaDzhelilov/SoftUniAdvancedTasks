import java.util.Scanner;

public class bookWorm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        StringBuilder string = new StringBuilder(sc.nextLine());
        StringBuilder newString = new StringBuilder();

        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        int roxIndex = -1;
        int colIndex = -1;


        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // variant za namirane na P v matrix
                if (line.charAt(col) == 'P') {
                    roxIndex = row;
                    colIndex = col;
                }
            }
        }

        String command = sc.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "up":
                    if(roxIndex - 1 < 0){
                        string.deleteCharAt(string.length() - 1);
                        roxIndex--;
                        command = sc.nextLine();
                        continue;
                    }
                    if (!(matrix[roxIndex - 1][colIndex] == '-')) {
                        char currentSymbol = matrix[roxIndex - 1][colIndex];
                        string.append(currentSymbol);
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex - 1][colIndex] = 'P';
                        roxIndex--;
                    } else {
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex - 1][colIndex] = 'P';
                        roxIndex--;
                    }
                    break;
                case "down":
                    if(roxIndex + 1 > matrix.length - 1){
                        string.deleteCharAt(string.length() - 1);
                        roxIndex++;
                        command = sc.nextLine();
                        continue;
                    }
                    if (!(matrix[roxIndex + 1][colIndex] == '-')) {
                        char currentSymbol = matrix[roxIndex + 1][colIndex];
                        string.append(currentSymbol);
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex + 1][colIndex] = 'P';
                        roxIndex++;
                    } else {
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex + 1][colIndex] = 'P';
                        roxIndex++;
                    }
                    break;
                case "left":
                    if(colIndex - 1 < 0){
                        string.deleteCharAt(string.length() - 1);
                        colIndex--;
                        command = sc.nextLine();
                        continue;
                    }
                    if (!(matrix[roxIndex][colIndex - 1] == '-')) {
                        char currentSymbol = matrix[roxIndex][colIndex - 1];
                        string.append(currentSymbol);
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex][colIndex - 1] = 'P';
                        colIndex--;
                    } else {
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex][colIndex - 1] = 'P';
                        colIndex--;
                    }
                    break;
                case "right":
                    if(colIndex + 1 > matrix.length - 1){
                        string.deleteCharAt(string.length() - 1);
                        colIndex++;
                        command = sc.nextLine();
                        continue;
                    }

                    if (!(matrix[roxIndex][colIndex + 1] == '-')) {
                        char currentSymbol = matrix[roxIndex][colIndex + 1];
                        string.append(currentSymbol);
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex][colIndex + 1] = 'P';
                        colIndex++;
                    } else {
                        matrix[roxIndex][colIndex] = '-';
                        matrix[roxIndex][colIndex + 1] = 'P';
                        colIndex++;
                    }
                    break;
            }

            command = sc.nextLine();
        }

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