import java.util.Scanner;

public class secondTaskExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int[] position = new int[2];
        String[] commands = scanner.nextLine().split(", ");
        int iterator = commands.length;
        int bombCount = 0;
        for (int row = 0; row < size; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = line[col].charAt(0);

                if(matrix[row][col] == 's'){
                    position[0] = row;
                    position[1] = col;
                }

            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'f') {
                    bombCount++;
                }
            }
        }
        int foundBombs = 0;
        for (int i = 0; i < iterator; i++) {
            String currentCommand = commands[i];
            if (currentCommand.equals("up")) {
                foundBombs = movePlayer(position, matrix, -1, 0, foundBombs);
            } else if (currentCommand.equals("down")) {
                foundBombs = movePlayer(position, matrix, +1, 0, foundBombs);
            } else if (currentCommand.equals("left")) {
                foundBombs = movePlayer(position, matrix, 0, -1, foundBombs);
            } else if (currentCommand.equals("right")) {
                foundBombs = movePlayer(position, matrix, 0, +1, foundBombs);
            }
            if (position[0] == -1 || foundBombs == bombCount) {
                break;
            }
        }

        if (foundBombs == bombCount) {
            System.out.printf("You win! Final python length is %d%n",bombCount + 1);
        } else if (position[0] == -1) {
            System.out.println("You lose! Killed by an enemy!");
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.", (bombCount - foundBombs));
        }
    }

    private static int movePlayer(int[] position, char[][] matrix,
                                  int rowModification, int colModification, int foundBombs) {
        int row = position[0];
        int col = position[1];
        try {
            int newRow = row + rowModification;
            int newCol = col + colModification;

            if(newRow > matrix.length - 1){
                newRow = 0;
            }else if(newRow < 0){
                newRow = matrix.length - 1;
            }
            if(newCol > matrix.length - 1){
                newCol = 0;
            }else if(newCol < 0){
                newCol = matrix.length -1;
            }


            if (matrix[newRow][newCol] == 'f') {
                matrix[row][col] = '*';
                matrix[newRow][newCol] = 's';
                position[0] = newRow;
                position[1] = newCol;
                foundBombs++;
            } else if (matrix[newRow][newCol] == 'e') {
                position[0] = -1;
                matrix[row][col] = '*';
                matrix[newRow][newCol] = 's';
            } else {
                matrix[row][col] = '*';
                matrix[newRow][newCol] = 's';
                position[0] = newRow;
                position[1] = newCol;
            }
        } catch (IndexOutOfBoundsException exception) {
            return foundBombs;
        }
        return foundBombs;
    }
}
