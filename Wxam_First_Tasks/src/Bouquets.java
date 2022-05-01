import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split(", ");
        String[] second  = sc.nextLine().split(", ");

        List<String> tulips = new ArrayList<>();
        List<String> daffodils  = new ArrayList<>();

        Collections.addAll(tulips, first);
        Collections.addAll(daffodils, second);
        Collections.reverse(tulips);

        int bouquets = 0;
        int storedFlowers = 0;


        while (!tulips.isEmpty() && !daffodils.isEmpty()){

            int tulipsFirst = Integer.parseInt(tulips.get(0));
            int daffodilsFirst = Integer.parseInt(daffodils.get(0));

            int sum = tulipsFirst + daffodilsFirst;

            if(sum > 15){
                while (!(sum <= 15)){
                    sum = sum -2 ;
                }
            }

            if(sum == 15){
                bouquets++;
                tulips.remove(0);
                daffodils.remove(0);
            }
            if(sum < 15){
                storedFlowers+= sum;
                tulips.remove(0);
                daffodils.remove(0);
            }

        } // while

       int bonusBouquets = storedFlowers / 15;
        bouquets = bouquets + bonusBouquets;

        if(bouquets >= 5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",bouquets);
        }else{
            System.out.printf("You failed... You need more %d bouquets.",Math.abs(5 - bouquets));
        }


    }
}
