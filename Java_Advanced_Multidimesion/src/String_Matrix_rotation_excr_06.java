import java.util.ArrayList;
import java.util.Scanner;

public class String_Matrix_rotation_excr_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = (sc.nextLine().split("\\(")[1]);
        int b = Integer.parseInt(a.split("\\)")[0]);
        int degree = b % 360;
        int maxLenght = 0;
        ArrayList<String> myList = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("END")) {
            myList.add(input);
            if (maxLenght < input.length()) {
                maxLenght = input.length();
            }
            input = sc.nextLine();
        }
        char[][] matrix = new char[myList.size()][maxLenght];
        for (int row = 0; row < myList.size(); row++) {
            for (int col = 0; col < maxLenght; col++) {
                if (col < myList.get(row).length()) {
                    matrix[row][col] = myList.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        switch (degree){
            case 0:
                for (int row = 0; row < myList.size(); row++) {
                    for (int col = 0; col < maxLenght; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < maxLenght; col++) {
                    for (int row = myList.size() - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = myList.size() - 1; row >= 0; row--) {
                    for (int col = maxLenght - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = maxLenght - 1; col >= 0; col--) {
                    for (int row = 0; row < myList.size(); row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }

    }
}
