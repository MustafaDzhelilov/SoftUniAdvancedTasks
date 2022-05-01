import java.util.*;

public class bombProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bombEffects = sc.nextLine().split(", ");
        String[] bombCasing = sc.nextLine().split(", ");

        List<String> effects = new ArrayList<>();
        List<String> casing = new ArrayList<>();

        Collections.addAll(effects, bombEffects);
        Collections.addAll(casing, bombCasing);
        Collections.reverse(casing);

        TreeMap<String, Integer> bomb = new TreeMap<>();
        bomb.put("Datura Bombs", 0);
        bomb.put("Cherry Bombs", 0);
        bomb.put("Smoke Decoy Bombs", 0);

        boolean stop = true;
        int countsValue = 0;

        while (stop){
            countsValue = 0;
            for (Map.Entry<String, Integer> entry : bomb.entrySet()) {
                String count = String.valueOf(entry.getValue());
                if(Integer.parseInt(count) >= 3){
                    countsValue++;
                }
            }

            if(effects.isEmpty() || casing.isEmpty() || countsValue == 3){
                stop = false;
                }
            else{
                int firstIndexFromEffects = Integer.parseInt(effects.get(0));
                int secondIndexFromCasing = Integer.parseInt(casing.get(0));
                int sum = firstIndexFromEffects + secondIndexFromCasing;

                int current = 0;
                switch (sum){
                    case 40:
                        if(bomb.containsKey("Datura Bombs")){
                            current = bomb.get("Datura Bombs");
                            bomb.put("Datura Bombs",current + 1);
                            effects.remove(0);
                            casing.remove(0);
                        }else{
                            bomb.put("Datura Bombs", 1);
                            effects.remove(0);
                            casing.remove(0);
                        }
                        break;
                    case 60:
                        if(bomb.containsKey("Cherry Bombs")){
                            current = bomb.get("Cherry Bombs");
                            bomb.put("Cherry Bombs",current + 1);
                            effects.remove(0);
                            casing.remove(0);
                        }else{
                            bomb.put("Cherry Bombs", 1);
                            effects.remove(0);
                            casing.remove(0);
                        }
                        break;
                    case 120:
                        if(bomb.containsKey("Smoke Decoy Bombs")){
                            current = bomb.get("Smoke Decoy Bombs");
                            bomb.put("Smoke Decoy Bombs",current + 1);
                            effects.remove(0);
                            casing.remove(0);
                        }else{
                            bomb.put("Smoke Decoy Bombs", 1);
                            effects.remove(0);
                            casing.remove(0);
                        }
                        break;
                    default:
                        int currentCasingValue = Integer.parseInt(casing.get(0));
                        currentCasingValue = currentCasingValue - 5;
                        casing.set(0,String.valueOf(currentCasingValue));
                } //switch

            } // else
        }//while

        boolean isFull = true;
        for (Map.Entry<String, Integer> entry : bomb.entrySet()) {
            String valueOfEntry = String.valueOf(entry.getValue());
            if(valueOfEntry == null){
                bomb.put(entry.getKey(),0);
            }
        }

            int forMap = 0;
            for (Map.Entry<String, Integer> entry : bomb.entrySet()) {

                String count = String.valueOf(entry.getValue());
                if (Integer.parseInt(count) >= 3) {
                    forMap++;
                }
            }
            if (forMap == 3) {
                System.out.println("Bene! You have successfully filled the bomb pouch!");
                if (effects.isEmpty()) {
                    System.out.println("Bomb Effects: empty");
                } else {
                    System.out.print("Bomb Effects: ");
                    System.out.println(String.join(", ", effects));
                }
                if (casing.isEmpty()) {
                    System.out.println("Bomb Casings: empty");
                } else {
                    System.out.print("Bomb Casings: ");
                    System.out.println(String.join(", ", casing));
                }
               bomb.entrySet().stream()
                       .forEach(e -> System.out.println(e.getKey() + ": " + String.join(", ",String.valueOf(e.getValue()))));
            } else {
                System.out.println("You don't have enough materials to fill the bomb pouch.");
                if (effects.isEmpty()) {
                    System.out.println("Bomb Effects: empty");
                } else {
                    System.out.print("Bomb Effects: ");
                    System.out.println(String.join(", ", effects));
                }
                if (casing.isEmpty()) {
                    System.out.println("Bomb Casings: empty");
                } else {
                    System.out.print("Bomb Casings: ");
                    System.out.println(String.join(", ", casing));
                }
                bomb.entrySet().stream()
                        .forEach(e -> System.out.println(e.getKey() + ": " + String.join(", ",String.valueOf(e.getValue()))));

            }


        }
    }

