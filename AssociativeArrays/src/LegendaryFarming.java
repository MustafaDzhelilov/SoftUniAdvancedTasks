import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new HashMap<>();
        Map<String, Integer> junkMap = new TreeMap<>();

        boolean isObtained = false;
        resourcesMap.put("shards", 0);
        resourcesMap.put("fragments", 0);
        resourcesMap.put("motes", 0);

        while (!isObtained){
            String [] tokens = sc.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i+=2) {
                int quantity = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();


                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    resourcesMap.put(material, resourcesMap.get(material) + quantity);
                    if (resourcesMap.get(material) >= 250) {
                        resourcesMap.put(material, resourcesMap.get(material) - 250);
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                }else{
                    junkMap.putIfAbsent(material, 0);
                    junkMap.put(material, junkMap.get(material) + quantity);
                }
            }
        }
        resourcesMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        junkMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
