import java.util.*;
import java.util.stream.Collectors;

public class datingApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 100 %

        String[] male = sc.nextLine().split("\\s+");
        String[] female = sc.nextLine().split("\\s+");

        List<String> males = new ArrayList<>();
        List<String> females = new ArrayList<>();

        Collections.addAll(males, male);
        Collections.addAll(females, female);
        Collections.reverse(males);

        int matches = 0;

        while (!females.isEmpty() && !males.isEmpty()) {

            int firstItemMale = Integer.parseInt(males.get(0));
            int firstItemFemale = Integer.parseInt(females.get(0));

            if (firstItemMale <= 0) {
                males.remove(0);
              continue;
            }
            if (firstItemFemale <= 0) {
                females.remove(0);
               continue;
            }
            if (firstItemMale % 25 == 0) {
                males.remove(0);
                males.remove(0);
               continue;
            }
            if (firstItemFemale % 25 == 0) {
                females.remove(0);
                females.remove(0);
                continue;
            }

            if (firstItemMale == firstItemFemale) {
                matches++;
                males.remove(0);
                females.remove(0);
            } else {
                females.remove(0);
                males.set(0,String.valueOf(firstItemMale - 2));
                if(Integer.parseInt(males.get(0)) <= 0){
                    males.remove(0);
                }
            }

        } // while

        System.out.printf("Matches: %d%n",matches);

        if(males.isEmpty()){
            System.out.println("Males left: none");
        }else{
            System.out.print("Males left: ");
            System.out.println(String.join(", ", males));
        }
        if(females.isEmpty()){
            System.out.println("Females left: none");
        }else{
            System.out.print("Females left: ");
            System.out.println(String.join(", ", females));
        }


    }
}
