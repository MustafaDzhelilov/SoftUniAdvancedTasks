import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, Integer> resource = new LinkedHashMap<>();

        while (!input.equals("stop")){
            int quantity  =Integer.parseInt(sc.nextLine());
            resource.put(input, quantity);
            input = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resource.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
