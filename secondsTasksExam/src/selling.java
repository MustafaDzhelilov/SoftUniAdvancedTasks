import java.util.Scanner;

public class selling {
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

        int rowIndexOnB = 0;
        int colIndexOnB = 0;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // find player in matrix
                if (line.charAt(col) == 'S') {
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }
        int money = 0;

        while (!stop) {
            String command = sc.nextLine();

            switch (command) {
                case "up":
                    if (rowIndex - 1 < 0) {
                        matrix[rowIndex][colIndex] = '-';
                        stop = true;
                        break;
                    } else {
                        if (matrix[rowIndex - 1][colIndex] == 'O') {
                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = '-';

                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if (matrix[row][col] == 'O') {
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = 'S';

                        } else if(matrix[rowIndex - 1][colIndex] == '-'){
                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                        } else {
                            int currentValue = 0;
                            if(matrix[rowIndex - 1][colIndex] == '1'){
                                currentValue = 1;
                            }else if(matrix[rowIndex - 1][colIndex] == '2'){
                                currentValue = 2;
                            }else if(matrix[rowIndex - 1][colIndex] == '3'){
                                currentValue = 3;
                            }else if(matrix[rowIndex - 1][colIndex] == '4'){
                                currentValue = 4;
                            }else if(matrix[rowIndex - 1][colIndex] == '5'){
                                currentValue = 5;
                            }else if(matrix[rowIndex - 1][colIndex] == '6'){
                                currentValue = 6;
                            }else if(matrix[rowIndex - 1][colIndex] == '7'){
                                currentValue = 7;
                            }else if(matrix[rowIndex - 1][colIndex] == '8'){
                                currentValue = 8;
                            }else if(matrix[rowIndex - 1][colIndex] == '9'){
                                currentValue = 9;
                            }

                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                            money += currentValue;

                            if (money >= 50) {
                                stop = true;
                                break;
                            }
                        }
                    }
                    break;
                case "down":
                    if (rowIndex + 1 > matrix.length - 1) {
                        matrix[rowIndex][colIndex] = '-';
                        stop = true;
                        break;
                    } else {
                        if (matrix[rowIndex + 1][colIndex] == 'O') {
                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = '-';

                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if (matrix[row][col] == 'O') {
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = 'S';

                        } else if(matrix[rowIndex + 1][colIndex] == '-'){
                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                        } else {
                            int currentValue = 0;
                            if(matrix[rowIndex + 1][colIndex] == '1'){
                                currentValue = 1;
                            }else if(matrix[rowIndex + 1][colIndex] == '2'){
                                currentValue = 2;
                            }else if(matrix[rowIndex + 1][colIndex] == '3'){
                                currentValue = 3;
                            }else if(matrix[rowIndex + 1][colIndex] == '4'){
                                currentValue = 4;
                            }else if(matrix[rowIndex + 1][colIndex] == '5'){
                                currentValue = 5;
                            }else if(matrix[rowIndex + 1][colIndex] == '6'){
                                currentValue = 6;
                            }else if(matrix[rowIndex + 1][colIndex] == '7'){
                                currentValue = 7;
                            }else if(matrix[rowIndex + 1][colIndex] == '8'){
                                currentValue = 8;
                            }else if(matrix[rowIndex + 1][colIndex] == '9'){
                                currentValue = 9;
                            }

                            matrix[rowIndex][colIndex] = '-';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                            money += currentValue;

                            if (money >= 50) {
                                stop = true;
                                break;
                            }
                        }
                    }
                    break;
                case "left":
                    if (colIndex - 1 < 0) {
                        matrix[rowIndex][colIndex] = '-';
                        stop = true;
                        break;
                    } else {
                        if (matrix[rowIndex][colIndex - 1] == 'O') {
                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = '-';

                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if (matrix[row][col] == 'O') {
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = 'S';

                        } else if(matrix[rowIndex][colIndex -1] == '-'){
                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                        } else {
                            int currentValue = 0;
                            if(matrix[rowIndex][colIndex - 1] == '1'){
                                currentValue = 1;
                            }else if(matrix[rowIndex][colIndex - 1] == '2'){
                                currentValue = 2;
                            }else if(matrix[rowIndex][colIndex - 1] == '3'){
                                currentValue = 3;
                            }else if(matrix[rowIndex][colIndex - 1] == '4'){
                                currentValue = 4;
                            }else if(matrix[rowIndex][colIndex - 1] == '5'){
                                currentValue = 5;
                            }else if(matrix[rowIndex][colIndex - 1] == '6'){
                                currentValue = 6;
                            }else if(matrix[rowIndex][colIndex - 1] == '7'){
                                currentValue = 7;
                            }else if(matrix[rowIndex][colIndex - 1] == '8'){
                                currentValue = 8;
                            }else if(matrix[rowIndex][colIndex - 1] == '9'){
                                currentValue = 9;
                            }

                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                            money += currentValue;

                            if (money >= 50) {
                                stop = true;
                                break;
                            }
                        }
                    }
                    break;
                case "right":
                    if (colIndex + 1 > matrix.length - 1) {
                        matrix[rowIndex][colIndex] = '-';
                        stop = true;
                        break;
                    } else {
                        if (matrix[rowIndex][colIndex + 1] == 'O') {
                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = '-';

                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if (matrix[row][col] == 'O') {
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = 'S';

                        } else if(matrix[rowIndex][colIndex + 1] == '-'){
                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                        } else {
                            int currentValue = 0;
                            if(matrix[rowIndex][colIndex + 1] == '1'){
                                currentValue = 1;
                            }else if(matrix[rowIndex][colIndex + 1] == '2'){
                                currentValue = 2;
                            }else if(matrix[rowIndex][colIndex + 1] == '3'){
                                currentValue = 3;
                            }else if(matrix[rowIndex][colIndex + 1] == '4'){
                                currentValue = 4;
                            }else if(matrix[rowIndex][colIndex + 1] == '5'){
                                currentValue = 5;
                            }else if(matrix[rowIndex][colIndex + 1] == '6'){
                                currentValue = 6;
                            }else if(matrix[rowIndex][colIndex + 1] == '7'){
                                currentValue = 7;
                            }else if(matrix[rowIndex][colIndex + 1] == '8'){
                                currentValue = 8;
                            }else if(matrix[rowIndex][colIndex + 1] == '9'){
                                currentValue = 9;
                            }

                            matrix[rowIndex][colIndex] = '-';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                            money += currentValue;

                            if (money >= 50) {
                                stop = true;
                                break;
                            }
                        }
                    }
                    break;
            }


        } // while

        if(money >= 50){
            System.out.println("Good news! You succeeded in collecting enough money!");
            System.out.printf("Money: %d%n", money);
            printMatrix(matrix);
        }else{
            System.out.println("Bad news, you are out of the bakery.");
            System.out.printf("Money: %d%n", money);
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

