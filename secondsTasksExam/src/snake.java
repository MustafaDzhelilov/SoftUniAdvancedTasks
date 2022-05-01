import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[size][size];
        int a  = 0;
        int b = 0;

        for (int row = 0; row < size; row++) {
            String line = sc.nextLine();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = line.charAt(col);
                // find player in matrix
                if (line.charAt(col) == 'S') {
                    a = row;
                    b = col;
                }
            }
        }

        int rowIndex = a;
        int colIndex = b;
        boolean stop = false;
        boolean gameOver = false;
        int foodQuantity = 0;
        int rowIndexOnB = 0;
        int colIndexOnB = 0;

        while (!stop){
            String command = sc.nextLine();

            switch (command) {
                case "up":
                    if (rowIndex - 1 < 0) {
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("Game over!");
                        System.out.printf("Food eaten: %d%n", foodQuantity);
                        stop = true;
                        gameOver = true;
                        break;
                    } else {
                        if (matrix[rowIndex - 1][colIndex] == 'B') {
                            matrix[rowIndex][colIndex] = '.'; // na predishnoto si mqsto
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = '.'; // ostavq tochka v parvoto sreshtnato B
                            //TODO...                           // i otiva kam drugoto B
                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if( matrix[row][col] == 'B'){
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = '.';

                        } else if (matrix[rowIndex - 1][colIndex] == '*') {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                            foodQuantity++;
                           if(foodQuantity >= 10){
                               stop = true;
                               break;
                           }
                        } else {
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                        }
                    }

                    break;
                case "down":
                    if(rowIndex + 1 > matrix.length - 1){
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("Game over!");
                        System.out.printf("Food eaten: %d%n", foodQuantity);
                        stop = true;
                        gameOver = true;
                        break;
                    }else{
                        if(matrix[rowIndex + 1][colIndex] == 'B'){
                            matrix[rowIndex][colIndex] = '.'; // na predishnoto si mqsto
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = '.'; // ostavq tochka v parvoto sreshtnato B
                            //TODO...                           // i otiva kam drugoto B
                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if( matrix[row][col] == 'B'){
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = '.';
                        }else if(matrix[rowIndex + 1][colIndex] == '*'){
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                            foodQuantity++;
                            if(foodQuantity >= 10){
                                stop = true;
                                break;
                            }
                        }else{
                            matrix[rowIndex][colIndex] = '.';
                            rowIndex = rowIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                        }
                    }
                    break;
                case "left":
                    if(colIndex - 1 < 0){
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("Game over!");
                        System.out.printf("Food eaten: %d%n", foodQuantity);
                        stop = true;
                        gameOver = true;
                        break;
                    }else{
                        if(matrix[rowIndex][colIndex - 1] == 'B'){
                            matrix[rowIndex][colIndex] = '.'; // na predishnoto si mqsto
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = '.'; // ostavq tochka v parvoto sreshtnato B
                            //TODO...                           // i otiva kam drugoto B
                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if( matrix[row][col] == 'B'){
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = '.';

                        }else if(matrix[rowIndex][colIndex - 1] == '*'){
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                            foodQuantity++;
                            if(foodQuantity >= 10){
                                stop = true;
                                break;
                            }
                        }else{
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex - 1;
                            matrix[rowIndex][colIndex] = 'S';
                        }
                    }
                    break;
                case "right":
                    if(colIndex + 1 > matrix.length - 1){
                        matrix[rowIndex][colIndex] = '.';
                        System.out.println("Game over!");
                        System.out.printf("Food eaten: %d%n", foodQuantity);
                        stop = true;
                        gameOver = true;
                        break;
                    }else{
                        if(matrix[rowIndex][colIndex + 1] == 'B'){
                            matrix[rowIndex][colIndex] = '.'; // na predishnoto si mqsto
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = '.'; // ostavq tochka v parvoto sreshtnato B
                            //TODO...                           // i otiva kam drugoto B
                            for (int row = 0; row <= matrix.length - 1; row++) {
                                for (int col = 0; col <= matrix.length - 1; col++) {

                                    if( matrix[row][col] == 'B'){
                                        rowIndexOnB = row;
                                        colIndexOnB = col;
                                    }
                                }
                            }
                            rowIndex = rowIndexOnB;
                            colIndex = colIndexOnB;
                            matrix[rowIndex][colIndex] = '.';

                        }else if(matrix[rowIndex][colIndex + 1] == '*'){
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                            foodQuantity++;
                            if(foodQuantity >= 10){
                                stop = true;
                                break;
                            }
                        }else{
                            matrix[rowIndex][colIndex] = '.';
                            colIndex = colIndex + 1;
                            matrix[rowIndex][colIndex] = 'S';
                        }
                    }
                    break;
            }

        } // while
        if(gameOver){
            printMatrix(matrix);
        }else {
            System.out.println("You won! You fed the snake.");
            System.out.printf("Food eaten: %d%n",foodQuantity);
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
