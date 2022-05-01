import java.util.*;
import java.util.stream.Collectors;

public class cook1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] liquids = sc.nextLine().split("\\s+");
        String[] ingredients = sc.nextLine().split("\\s+");

        List<String> liquid = new ArrayList<>();
        List<String> ingredient = new ArrayList<>();
        Map<String, Integer> info = new TreeMap<>();
        info.put("Bread", 0);
        info.put("Cake", 0);
        info.put("Pastry", 0);
        info.put("Fruit Pie", 0);

        Collections.addAll(liquid, liquids);
        Collections.addAll(ingredient, ingredients);
        Collections.reverse(ingredient);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        boolean isEmpty = false;

        while (liquid.size() > 0 || ingredient.size() > 0){

            if(liquid.isEmpty()){
                isEmpty = true;
                break;
            }

            int indexZeroLiquids = Integer.parseInt(liquid.get(0));
            int indexZeroIngredient = Integer.parseInt(ingredient.get(0));

            int sum = indexZeroLiquids + indexZeroIngredient;
            int current = 0;
           switch (sum){

               case 25:
                       current = info.get("Bread");
                       info.put("Bread", current + 1);
                       liquid.remove(0);
                       ingredient.remove(0);

                   a= a + 1;


                   break;
               case 50:
                       current = info.get("Cake");
                       info.put("Cake", current + 1);
                       liquid.remove(0);
                       ingredient.remove(0);
                   b=  b +1;
                   break;
               case 75:
                       current = info.get("Pastry");
                       info.put("Pastry", current + 1);
                       liquid.remove(0);
                       ingredient.remove(0);
                   c = c +1;
                   break;
               case 100:
                       current = info.get("Fruit Pie");
                       info.put("Fruit Pie", current + 1);
                       liquid.remove(0);
                       ingredient.remove(0);
                   d= d +1;
                   break;
               default:
                   liquid.remove(0);
                   int ingredientValue = Integer.parseInt(ingredient.get(0));
                   ingredient.set(0,String.valueOf(ingredientValue + 3));
           }

        } // while

       int sumValue = a+b+c+d;

        if(sumValue >= 4){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");

        }

        if(isEmpty = true){
            System.out.println("Liquids left: none");
        }else{
            System.out.print("Liquids left: ");
            System.out.println(String.join(", ", liquid));
        }
        if(ingredient.isEmpty()){
            System.out.println("Ingredients left: none");
        }else{
            System.out.print("Ingredients left: ");
            System.out.println(String.join(", ", ingredient));
        }
        info.entrySet().stream().forEach(e-> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}
