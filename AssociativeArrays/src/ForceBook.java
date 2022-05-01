import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> forceBook = new TreeMap<>();

        String input = sc.nextLine();
        boolean exist = false;

        while (!input.equals("Lumpawaroo")){
            if(input.contains("|")){
                String[] command= input.split("\\| ");
                String user = command[1];
                String side = command[0];
                for (Map.Entry<String, List<String>> entry: forceBook.entrySet()) {
                    if(entry.getValue().contains(user)){
                            exist = true;
                            break;
                    }
                }
                if(!exist){
                    forceBook.put(side, new ArrayList<>());
                }
                forceBook.get(side).add(user);
            }else if(input.contains("->")){
                String [] command = input.split("\\->");
                String user = command[0];
                String side = command[1];
                if(forceBook.containsKey(side)){
                    if(!forceBook.get(side).contains(user)){
                        String currentSide = "";
                        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                            if(entry.getValue().contains(user)){
                                currentSide = entry.getKey();
                                forceBook.get(currentSide).remove(user);
                                if(forceBook.get(currentSide).size() == 0){
                                    forceBook.remove(currentSide);
                                    break;
                                }
                            }
                        }
                        forceBook.put(side, new ArrayList<>());
                        forceBook.get(side).add(user);
                        System.out.printf("%s joins the %s side!%n", user, side);
                    }
                }
            }


            input = sc.nextLine();
        }
        forceBook.entrySet()
                .stream()
                .filter(n1 -> n1.getValue().size() > 0)
                .sorted((x,y) -> Integer.compare(y.getValue().size(), x.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(), entry.getValue().size());
                    entry.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(e -> System.out.printf("! %s%n",e));
                });
    }
}
