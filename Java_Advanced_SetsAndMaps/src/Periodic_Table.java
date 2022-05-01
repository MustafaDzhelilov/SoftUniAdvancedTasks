import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCount = Integer.parseInt(sc.nextLine());
        TreeSet<String> chemicalElements  = new TreeSet<>();

        for (int i = 0; i < inputCount; i++) {
            String elements = sc.nextLine();
            String[] tokens = elements.split("\\s+");

            chemicalElements.addAll(Arrays.asList(tokens));
        }
        for (String chemicalElement : chemicalElements) {
            System.out.print(chemicalElement + " ");
        }
    }
}
