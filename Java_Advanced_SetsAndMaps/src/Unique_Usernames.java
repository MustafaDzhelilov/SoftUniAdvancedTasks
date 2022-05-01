import java.util.LinkedHashSet;
import java.util.Scanner;

public class Unique_Usernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCount = Integer.parseInt(sc.nextLine());
        LinkedHashSet<String> usernames  = new LinkedHashSet<>();

        for (int i = 0; i < inputCount; i++) {
            String userName = sc.nextLine();
            usernames.add(userName);
        }

        for (String username : usernames) {
            System.out.println(username);
        }

    }
}
