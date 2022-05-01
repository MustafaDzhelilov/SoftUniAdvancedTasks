import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class flowers_Wreaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lilies = sc.nextLine().split(", ");
        String[] roses = sc.nextLine().split(", ");

        List<String> lili = new ArrayList<>();
        List<String> rose = new ArrayList<>();

        Collections.addAll(lili, lilies);
        Collections.addAll(rose, roses);
        Collections.reverse(lili);

        int wreath = 0;
        int storeSum = 0;

        boolean stop = true;

        while (stop) {

            if (lili.isEmpty() || rose.isEmpty()) {
                stop = false;
            } else {
                int firstIndexLili = Integer.parseInt(lili.get(0));
                int firstIndexRose = Integer.parseInt(rose.get(0));

                if (firstIndexLili + firstIndexRose == 15) {
                    wreath++;
                    lili.remove(0);
                    rose.remove(0);
                }else if (firstIndexLili + firstIndexRose > 15){
                   boolean isTrue = true;
                   while (isTrue){
                       firstIndexLili = firstIndexLili - 2;
                       if(firstIndexLili + firstIndexRose == 15){
                           wreath++;
                           lili.remove(0);
                           rose.remove(0);
                           isTrue = false;
                       }else if(firstIndexLili + firstIndexRose < 15){
                           storeSum += firstIndexLili + firstIndexRose;
                           lili.remove(0);
                           rose.remove(0);
                           isTrue = false;
                       }
                   }
                  if(lili.isEmpty() || rose.isEmpty()){
                      break;
                  }

                }else if(firstIndexLili + firstIndexRose < 15){
                    storeSum += firstIndexLili + firstIndexRose;
                    lili.remove(0);
                    rose.remove(0);
                }
            }
        }

        int wreathFromTheStoredSum = storeSum / 15;
        wreath = wreath + wreathFromTheStoredSum;

        if (wreath >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreath);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", Math.abs(5 - wreath));
        }
    }
}
