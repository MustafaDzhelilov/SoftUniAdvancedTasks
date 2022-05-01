import java.util.LinkedHashSet;
import java.util.Scanner;

public class Sets_of_Elements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");
        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(sc.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(sc.nextLine());
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);

        for (Integer integer : firstSet) {
            System.out.print(integer + " ");
        }
    }
}
