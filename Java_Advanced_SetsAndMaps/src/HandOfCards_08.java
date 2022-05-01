import java.util.*;

public class HandOfCards_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String, LinkedHashSet<String>> playerWithCards = new LinkedHashMap<>();

            while (!input.equals("JOKER")){
                String[] tokens = input.split(": ");
                String name = tokens[0];
                String[] card = tokens[1].split(", ");
                LinkedHashSet<String> hands = new LinkedHashSet<>();
                Collections.addAll(hands, card);

                if(!playerWithCards.containsKey(name)){
                    playerWithCards.put(name,hands);
                }else{
                    LinkedHashSet<String> currentHands = new LinkedHashSet<>(playerWithCards.get(name));
                    Collections.addAll(currentHands, card);
                    playerWithCards.put(name, currentHands);
                }

                        input = sc.nextLine();
            }

        for (Map.Entry<String, LinkedHashSet<String>> player : playerWithCards.entrySet()) {
            //player: име -> списък с карти
            int points = getCardPoints(player.getValue());
            System.out.println(player.getKey() + ": " + points);

        }

    }

    private static int getCardPoints(LinkedHashSet<String> cards) {
        //намерим сумата от картите
        int sum = 0;
        Map<Character, Integer> pointsValues = getPointsValues();
        for (String card : cards) {
            int points = 0;
            //[номер][сила]
            //номер -> 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
            //сила -> S, H, D, C
            //точки = точки от сила * точки от номер
            if(card.contains("10")) {
                //"10C" -> C
                char strength = card.charAt(2);
                points = 10 * pointsValues.get(strength);
            } else {
                //2C  JD
                char number = card.charAt(0);
                char strength = card.charAt(1);
                points = pointsValues.get(strength) * pointsValues.get(number);
            }
            sum += points;
        }

        return sum;
    }

    private static Map<Character, Integer> getPointsValues() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}
