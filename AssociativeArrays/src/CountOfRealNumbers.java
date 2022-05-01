import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double[] nums = Arrays  .stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            if(!counts.containsKey(num)){
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()), entry.getValue());
        }
    }
}
