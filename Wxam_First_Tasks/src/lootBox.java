import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lootBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split(" ");
        String[] second = sc.nextLine().split(" ");

        List<String> firstLootBox = new ArrayList<>();
        List<String> secondLootBox = new ArrayList<>();
        List<Integer> claimedItems = new ArrayList<>();

        Collections.addAll(firstLootBox, first);
        Collections.addAll(secondLootBox, second);
        Collections.reverse(secondLootBox);

        boolean OK = true;
        while (OK) {

            if (firstLootBox.isEmpty() || secondLootBox.isEmpty()) {
                OK = false;
            } else {

                int firstIndexFromFirstLootBox = Integer.parseInt(firstLootBox.get(0));
                int firstIndexFromSecondLootBox = Integer.parseInt(secondLootBox.get(0));

                int theirSum = firstIndexFromFirstLootBox + firstIndexFromSecondLootBox;

                if (theirSum % 2 == 0) {
                    claimedItems.add(theirSum);
                    firstLootBox.remove(0);
                    secondLootBox.remove(0);
                } else {
                    int lastIndexFromTheSecondBox = Integer.parseInt(secondLootBox.get(0));
                    secondLootBox.remove(0);
                    firstLootBox.add(String.valueOf(lastIndexFromTheSecondBox));
                }

            }//while
        }

            if (firstLootBox.isEmpty()) {
                System.out.println("First lootbox is empty");
            } else {
                System.out.println("Second lootbox is empty");
            }

            int sum = 0;
            for (Integer claimedItem : claimedItems) {
                sum += claimedItem;
            }

            if (sum >= 100) {
                System.out.printf("Your loot was epic! Value: %d", sum);
            } else {
                System.out.printf("Your loot was poor... Value: %d", sum);
            }

    }
}
