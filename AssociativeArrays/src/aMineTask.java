import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMineTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resources = sc.nextLine();
        Map<String, Integer> allResours = new LinkedHashMap<>();

        while (!resources.equals("stop")){
            int quantity = Integer.parseInt(sc.nextLine());

            if(!allResours.containsKey(resources)){
                allResours.put(resources, quantity);
            }else{
                allResours.put(resources, allResours.get(resources) + quantity);
            }

            resources = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : allResours.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
