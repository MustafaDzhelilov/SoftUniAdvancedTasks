import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class datingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 92 %

        String[] male = sc.nextLine().split(" ");
        String[] female = sc.nextLine().split(" ");

        List<String> males = new ArrayList<>();
        List<String> females = new ArrayList<>();

        Collections.addAll(males, male);
        Collections.addAll(females, female);
        Collections.reverse(males);

        boolean stops = true;
        int matches = 0;

        while (stops){

            if(males.isEmpty() || females.isEmpty()){
                stops = false;
            }else{

                int firstIndexFromMales = Integer.parseInt(males.get(0));
                int firstIndexFromFemales = Integer.parseInt(females.get(0));

                if(firstIndexFromFemales <= 0 ){
                    females.remove(0);
                    continue;
                }
                if((firstIndexFromFemales % 25) == 0){
                    females.remove(0);
                    females.remove(0);
                    continue;
                }
                if(firstIndexFromMales <= 0){
                    males.remove(0);
                    continue;
                }
                if((firstIndexFromMales % 25 == 0)){
                    males.remove(0);
                    males.remove(1);
                    continue;
                }

                if(firstIndexFromFemales == firstIndexFromMales){
                    matches++;
                    males.remove(0);
                    females.remove(0);
                }else{
                    females.remove(0);
                    int currentFirstIndexFromMale = Integer.parseInt(males.get(0));
                    currentFirstIndexFromMale = currentFirstIndexFromMale - 2;
                    males.set(0, String.valueOf(currentFirstIndexFromMale));

                    if(Integer.parseInt(males.get(0)) <= 0){
                        males.remove(0);
                    }

                }
            }

        } // while

        System.out.println("Matches: " + matches);
        if(males.isEmpty()){
            System.out.println("Males left: none");
        }else{
            System.out.print("Males left: " );
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
