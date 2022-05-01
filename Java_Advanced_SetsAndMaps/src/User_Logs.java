import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class User_Logs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Без запетаята накрая !!!
        String input = sc.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> info = new TreeMap<>();


        while (!input.equals("end")){
            //IP={ip} message={message} user={username}
            String[] data = input.split("\\s+");
            String username = data[2].split("=")[1];
            String ip = data[0].split("=")[1];

            info.putIfAbsent(username, new LinkedHashMap<>());
            info.get(username).putIfAbsent(ip, 0);
            info.get(username).put(ip, info.get(username).get(ip) + 1);

            input = sc.nextLine();
        }

        info.entrySet().stream()
                .forEach(entry -> {
                        System.out.println(entry.getKey() + ":");
                    for (var ipEntry : entry.getValue().entrySet()) {
                        System.out.println(ipEntry.getKey() + " => " + ipEntry.getValue() + ". ");
                    }});
    }
}
