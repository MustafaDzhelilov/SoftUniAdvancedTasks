import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        int rowIndex = 0;
        int colIndex = 0;
        int pollinatedFlowers = 0;
        boolean gameOver = false;
        boolean stop = false;
        int count = 0;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // find player in matrix
                if (line.charAt(col) == 'B') {
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        String command = sc.nextLine();

        while (!command.equals("End")) {

            switch (command) {
                case "up":
                    if (rowIndex - 1 < 0) {
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("The bee got lost!");
                        gameOver = true;
                        stop = true;
                        rowIndex = -1;
                        count++;
                        break;
                    } else {
                        if (matrix[rowIndex - 1][colIndex] == 'O') {
                            matrix[rowIndex][colIndex] = '.';
                            matrix[rowIndex - 1][colIndex] = '.';
                            rowIndex = rowIndex - 2;
                            if(matrix[rowIndex][colIndex] == 'f'){
                                pollinatedFlowers++;
                            }
                            matrix[rowIndex][colIndex] = 'B';

                        } else if (matrix[rowIndex - 1][colIndex] == 'f') {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'B';
                            pollinatedFlowers++;
                        } else {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'B';
                        }
                    }
                    break;
                case "down":
                    if (rowIndex + 1 > matrix.length - 1) {
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("The bee got lost!");
                        gameOver = true;
                        count++;
                        rowIndex = -1;
                        break;
                    } else {
                        if (matrix[rowIndex + 1][colIndex] == 'O') {
                            matrix[rowIndex][colIndex] = '.';
                            matrix[rowIndex + 1][colIndex] = '.';
                            rowIndex = rowIndex + 2;
                            if(matrix[rowIndex][colIndex] == 'f'){
                                pollinatedFlowers++;
                            }
                            matrix[rowIndex][colIndex] = 'B';

                        } else if (matrix[rowIndex + 1][colIndex] == 'f') {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'B';
                            pollinatedFlowers++;
                        } else {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'B';
                        }
                    }
                    break;
                case "left":
                    if (colIndex - 1 < 0) {
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("The bee got lost!");
                        gameOver = true;
                        stop = true;
                        colIndex = -1;
                        count++;
                        break;
                    } else {
                        if (matrix[rowIndex][colIndex - 1] == 'O') {
                            matrix[rowIndex][colIndex] = '.';
                            matrix[rowIndex][colIndex - 1] = '.';
                            colIndex = colIndex - 2;
                            if(matrix[rowIndex][colIndex] == 'f'){
                                pollinatedFlowers++;
                            }
                            matrix[rowIndex][colIndex] = 'B';

                        } else if (matrix[rowIndex][colIndex - 1] == 'f') {
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'B';
                            pollinatedFlowers++;

                        } else {
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'B';
                        }
                    }
                    break;
                case "right":
                    if (colIndex + 1 > matrix.length - 1) {
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("The bee got lost!");
                        gameOver = true;
                        stop = true;
                        colIndex = -1;
                        count++;
                        break;
                    } else {
                        if (matrix[rowIndex][colIndex + 1] == 'O') {
                            matrix[rowIndex][colIndex] = '.';
                            matrix[rowIndex][colIndex + 1] = '.';
                            colIndex = colIndex + 2;
                            if(matrix[rowIndex][colIndex] == 'f'){
                                pollinatedFlowers++;
                            }
                            matrix[rowIndex][colIndex] = 'B';

                        } else if (matrix[rowIndex][colIndex + 1] == 'f') {
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'B';
                            pollinatedFlowers++;
                        } else {
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'B';
                        }
                    }
                    break;
            }
            if(count > 0){
                command = "End";
            }else {
                command = sc.nextLine();
            }
            if(rowIndex == -1 || colIndex == -1){
                break;
            }

        }

        if (gameOver) {
            if(pollinatedFlowers < 5){
                System.out.printf("The bee couldn't pollinate the flowers, " +
                        "she needed %d flowers more%n",Math.abs(pollinatedFlowers - 5));
            }else{
                System.out.printf("Great job, the bee manage to pollinate " +
                        "%d flowers!%n",pollinatedFlowers);
            }
            printMatrix(matrix);
        } else {
            if (pollinatedFlowers < 5) {
                System.out.printf("The bee couldn't pollinate the flowers, " +
                        "she needed %d flowers more%n", Math.abs(pollinatedFlowers - 5));
            } else
                System.out.printf("Great job, the bee manage to pollinate " +
                        "%d flowers!%n", pollinatedFlowers);

            printMatrix(matrix);
        }
    }

    public static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}


