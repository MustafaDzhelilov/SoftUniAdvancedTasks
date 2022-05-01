import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        Map<String, String> registered = new LinkedHashMap<>();

        int i = 0;
        while (i <=count) {
            switch (command.split(" ")[0]) {
                case "register":
                    if (!registered.containsKey(command.split(" ")[1])) {
                        registered.put(command.split(" ")[1], command.split(" ")[2]);
                        System.out.println(command.split(" ")[1] + " registered " +command.split(" ")[2]+ " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + command.split(" ")[2]);
                    }
                    break;
                case "unregister":
                    if (!registered.containsKey(command.split(" ")[1])) {
                        System.out.println("ERROR: user " + command.split(" ")[1] + " not found");
                    } else {
                        registered.remove(command.split(" ")[1]);
                        System.out.println(command.split(" ")[1] + " unregistered successfully" );
                    }
                    break;
            }
                command = sc.nextLine();
            i++;
        }

        for (Map.Entry<String, String> entry : registered.entrySet()) {
            System.out.printf("%s => %s", entry.getKey(), entry.getValue());
        }

    }
}
