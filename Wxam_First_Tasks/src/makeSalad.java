import java.util.*;
import java.util.stream.Collectors;

public class makeSalad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<String>vegetables = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());
        List<String> calories = Arrays.stream(sc.nextLine().split(" "))
                        .collect(Collectors.toList());
        Collections.reverse(calories);

        List<String> readySalads = new ArrayList<>();

        LinkedHashMap<String, Integer> info = new LinkedHashMap<>();
        info.put("tomato", 80);
        info.put("carrot", 136);
        info.put("lettuce", 109);
        info.put("potato",215);

            int caloriesValue  = Integer.parseInt(calories.get(0));

            while (caloriesValue >= 0){

                String currentVegetable = vegetables.get(0);

                if(info.containsKey(currentVegetable)){
                    int currentValue = info.get(currentVegetable);
                    caloriesValue = caloriesValue - currentValue;
                    if((caloriesValue <= 0)){
                        vegetables.remove(0);
                        readySalads.add(calories.get(0));
                        calories.remove(0);
                    }else{
                        vegetables.remove(0);
                    }
                }
                if(caloriesValue <= 0 && !(vegetables.isEmpty())){
                    if(!calories.isEmpty()) {
                        caloriesValue = Integer.parseInt(calories.get(0));
                    }else{
                        break;
                    }
                }else if(vegetables.isEmpty()){
                    break;
                }

            }

                System.out.println(String.join(" ", readySalads));


            if(!(calories.isEmpty())) {
                System.out.println(String.join(" ", calories));
            }
            if(!(vegetables.isEmpty())){
                System.out.println(String.join(" ",vegetables));
            }


//numbers.toString().replaceAll("[\\[\\],]", "")


    }
}
