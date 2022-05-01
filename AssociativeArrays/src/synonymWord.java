import java.util.*;
import java.util.stream.Collectors;

public class synonymWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String> > synonymWord = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();
           /* if(!synonymWord.containsKey(word)){
                List<String> synonymForCurrent = new ArrayList<>();
                synonymForCurrent.add(synonym);
                synonymWord.put(word, synonymForCurrent);
            }else{
                List<String> synonymForCurrent = synonymWord.get(word); // взимаме синонимите за текущата дума
                synonymForCurrent.add(synonym); // добавяме още синоними къ листа със синоними
                synonymWord.put(word, synonymForCurrent); // и връщаме всичко обратно
            }*/

            // вариант две
            synonymWord.putIfAbsent(word,new ArrayList<>());
            synonymWord.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : synonymWord.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
