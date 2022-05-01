import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        int[] position = new int[2];
        String[] commands = scanner.nextLine().split(",");
        int iterator = commands.length;
        int bombCount = 0;
        for (int row = 0; row < size; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();

            if (line.contains("s")) {
                position[0] = row;
                position[1] = line.indexOf("s");
            }
        }
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                if (aChar == 'B') {
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
                foundBombs = movePlayer(position, matrix, 0, -2, foundBombs);
            } else if (currentCommand.equals("right")) {
                foundBombs = movePlayer(position, matrix, 0, +2, foundBombs);
            }
            if (position[0] == -1 || foundBombs == bombCount) {
                break;
            }
        }
        int colPosition = position[1];
        if (colPosition > 0) {
            colPosition = colPosition / 2;
        }
        if (foundBombs == bombCount) {
            System.out.print("Congratulations! You found all bombs!");
        } else if (position[0] == -1) {
            System.out.printf("END! %d bombs left on the field", bombCount - foundBombs);
        } else {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", (bombCount - foundBombs), position[0], colPosition);
        }
    }

    private static int movePlayer(int[] position, char[][] matrix,
                                  int rowModification, int colModification, int foundBombs) {
        int row = position[0];
        int col = position[1];
        try {
            int newRow = row + rowModification;
            int newCol = col + colModification;

            if (matrix[newRow][newCol] == 'B') {
                matrix[row][col] = '+';
                matrix[newRow][newCol] = 's';
                position[0] = newRow;
                position[1] = newCol;
                foundBombs++;
                System.out.print("You found a bomb!" + System.lineSeparator());
            } else if (matrix[newRow][newCol] == 'e') {
                position[0] = -1;
                matrix[row][col] = '+';
                matrix[newRow][newCol] = 's';
            } else {
                matrix[row][col] = '+';
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


