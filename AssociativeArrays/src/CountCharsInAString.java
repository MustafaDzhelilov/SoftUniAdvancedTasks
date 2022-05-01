import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String words = sc.nextLine();

        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (int index = 0; index < words.length(); index++) {
            char symbol = words.charAt(index);
            if(symbol == ' '){
                continue;
            }
            if(!letterCount.containsKey(symbol)){
                letterCount.put(symbol, 1);
            }else{
                letterCount.put(symbol, letterCount.get(symbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
