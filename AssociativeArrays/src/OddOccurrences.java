import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] words = sc.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        List<String> occurrenceWord = new ArrayList<>();

        for (String word : words ) {
            String toLowerCase = word.toLowerCase();
            if(!counts.containsKey(toLowerCase)){
                counts.put(toLowerCase, 1);
            }else{
                counts.put(toLowerCase, counts.get(toLowerCase) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            int count = counts.get(entry.getKey());
            if(count % 2 == 1){
                occurrenceWord.add(entry.getKey());
            }
        }
        String toPrint = occurrenceWord.toString().replaceAll("[\\]\\[,]", "");
        toPrint = toPrint.replaceAll("\\s+", ", ");
        System.out.print(toPrint);
    }
}
