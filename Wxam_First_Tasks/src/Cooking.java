import javax.management.StringValueExp;
import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first sequence = fifo -queue
        // second sequence = lifo - stack
        List<String> liquids = new ArrayList<>();
        List<String> ingredient = new ArrayList<>();

        List<String> helpIngredient = new ArrayList<>();
        List<String> helpLiquids = new ArrayList<>();


        TreeMap<String, Integer> info = new TreeMap<>();
        info.put("Bread", 0);
        info.put("Cake", 0);
        info.put("Pastry", 0);
        info.put("Fruit Pie", 0);

        TreeMap<String, Integer> cooking = new TreeMap<>();


        String[] liquidSequence = sc.nextLine().split("\\s+");
        String[] ingredientSequence = sc.nextLine().split("\\s+");

        Collections.addAll(liquids, liquidSequence);
        Collections.addAll(ingredient, ingredientSequence);
        Collections.reverse(ingredient);

        while (liquids.size() > 0) {
            if (ingredient.isEmpty()) {
                break;
            }

            int liquidFirstNumber = Integer.parseInt(liquids.get(0));
            int ingredientFirstNumber = Integer.parseInt(ingredient.get(0));

            int sum = liquidFirstNumber + ingredientFirstNumber;

            int current = 0;

            switch (sum) {
                case 25:
                    if (cooking.containsKey("Bread")) {
                        current = cooking.get("Bread");
                        cooking.put("Bread", current + 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    } else {
                        cooking.put("Bread", 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    }
                    break;
                case 50:
                    if (cooking.containsKey("Cake")) {
                        current = cooking.get("Cake");
                        cooking.put("Cake", current + 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    } else {
                        cooking.put("Cake", 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    }
                    break;
                case 75:
                    if (cooking.containsKey("Pastry")) {
                        current = cooking.get("Pastry");
                        cooking.put("Pastry", current + 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    } else {
                        cooking.put("Pastry", 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    }
                    break;
                case 100:
                    if (cooking.containsKey("Fruit Pie")) {
                        current = cooking.get("Fruit Pie");
                        cooking.put("Fruit Pie", current + 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    } else {
                        cooking.put("Fruit Pie", 1);
                        liquids.remove(0);
                        ingredient.remove(0);
                    }
                    break;
                default:
                    liquids.remove(0);
                    int ingredientZeroIndexValue = Integer.parseInt(ingredient.get(0));
                    ingredientZeroIndexValue = ingredientZeroIndexValue + 3;
                    ingredient.set(0, String.valueOf(ingredientZeroIndexValue));
            }
        }


        if (info.size() == cooking.size()) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
            if (liquids.isEmpty()) {
                System.out.println("Liquids left: none");
            } else {
                System.out.print("Ingredients left: ");
                for (String s : liquids) {
                    helpLiquids.add(s);
                }
                System.out.print(String.join(", ", helpLiquids));
                System.out.println();
            }
            if (ingredient.isEmpty()) {
                System.out.println("Ingredients left: none");
            } else {
                System.out.print("Ingredients left: ");
                for (String s : ingredient) {
                    helpIngredient.add(s);
                }
                System.out.print(String.join(", ", helpIngredient));
                System.out.println();
            }
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
            if (liquids.isEmpty()) {
                System.out.println("Liquids left: none");
            } else {
                System.out.print("Ingredients left: ");
                for (String s : liquids) {
                    helpLiquids.add(s);
                }
                System.out.print(String.join(", ", helpLiquids));
                System.out.println();
            }
            if (ingredient.isEmpty()) {
                System.out.println("Ingredients left: none");
            } else {
                System.out.print("Ingredients left: ");
                for (String s : ingredient) {
                    helpIngredient.add(s);
                }
                System.out.print(String.join(", ", helpIngredient));
                System.out.println();
            }
        }

           // for (Map.Entry<String, Integer> entry : info.entrySet()) {
           //     System.out.println(entry.getKey() + ": " + cooking.get(entry.getKey()));
           // }
        info.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + cooking.get(e.getKey())));

    }
}
