import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class firstTaskExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split(", ");
        String[] second = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());

        List<String> firstLootBox = new ArrayList<>();
        List<String> secondLootBox = new ArrayList<>();

        Collections.addAll(firstLootBox, first);
        Collections.addAll(secondLootBox, second);
        Collections.reverse(firstLootBox);


        boolean isTrue = true;

       while (isTrue) {

    int one = Integer.parseInt(firstLootBox.get(0));
    int two = Integer.parseInt(secondLootBox.get(0));

    if(!(one == n)) {
        if (two >= one) {
            firstLootBox.remove(0);
            secondLootBox.remove(0);
        }
        if (two < one) {
            secondLootBox.remove(0);
        }
    }else{
            isTrue = false;
    }
} // while

        System.out.printf("Thread with value %s killed task %s%n",secondLootBox.get(0),firstLootBox.get(0));
        System.out.println(String.join(" ", secondLootBox));
    }
}
