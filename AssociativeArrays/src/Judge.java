import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Map<String, Integer>> result = new HashMap<>();
        Map<String, Integer> help = new HashMap<>();
        Map<String, Integer> individualResult = new TreeMap<>();

        String input = sc.nextLine();

        while (!input.equals("no more time")){

            String [] tokens = input.split(" -> ");
            String username = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            // for individual standings

            if(!individualResult.containsKey(username)){
                individualResult.put(username, points);
            }else if(individualResult.containsKey(username)){
                    int currentPoints = individualResult.get(username);
                    individualResult.put(username, currentPoints +points);
                }
            // proverqvame dali dadenata igra e v mapa ako ne e q dobavqme ako e proverqvame dali dadeniq username sashtestvuva s dadenata igra,
            // ako ne dobavqme  ako sashtestvuva vzimame starite mu tochki i sravnqvame sas segashnite koito sa po golemi tqh gi zapazvame.

            if(!help.containsKey(contest)){
                help.put(contest, points);
                result.put(username, help);
            }else if(help.containsKey(contest)){
                if(!result.containsKey(username)){
                    help.put(contest, points);
                    result.put(username,help);
                }else if(result.containsKey(username)){
                    int currentPoints = result.get(username).get(contest);
                    if(currentPoints < points){
                        help.put(contest, points);
                        result.put(username, help);
                    }


                }
            }

            input = sc.nextLine();
            }

        }
    }

