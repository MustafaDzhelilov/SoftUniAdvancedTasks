import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Symbols_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        TreeMap<Character, Integer> infoMap = new TreeMap<>();

        for (int i = 0; i < input.length() -1 ; i++) {
            char currentSymbol = input.charAt(i);
            if(!infoMap.containsKey(currentSymbol)){
                infoMap.put(currentSymbol, 1);
            }else
                {
                int currentOccurance = infoMap.get(currentSymbol);
                infoMap.put(currentSymbol, currentOccurance + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : infoMap.entrySet()) {
            //S: 1 time/s
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }

    }
}
