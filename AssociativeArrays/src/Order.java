import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Double> infoProductMapPrice = new LinkedHashMap<>();
        Map<String, Integer> infoProductMapQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] tokens = input.split(" ");

            String product = tokens[0];
            Double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            infoProductMapPrice.put(product, price);

            if(!infoProductMapQuantity.containsKey(product)){
                infoProductMapQuantity.put(product, quantity );
            }else {
                infoProductMapQuantity.put(product, infoProductMapQuantity.get(product) + quantity);
            }


            input = sc.nextLine();
        }
        for (Map.Entry<String, Double> entry : infoProductMapPrice.entrySet()) {
            // key - ime na product -> value - cena
            //cena * kolichestvo
            String productName = entry.getKey();
            Double finalSum = entry.getValue() * infoProductMapQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
