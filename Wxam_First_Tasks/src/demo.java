import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> firstBox = Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));   //  Четене на опашка / add- dobavq / pool - iztriva / peek - vijdame


        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(sc.nextLine()
        .split("\\s+"))
        .map(Integer::parseInt)
        .forEach(secondBox::push);    //Четене на стек  // push - zapis / pop - iztriva / peek - samo vijdame



        while (!firstBox.isEmpty() && secondBox.isEmpty()){

        }
    }
}
