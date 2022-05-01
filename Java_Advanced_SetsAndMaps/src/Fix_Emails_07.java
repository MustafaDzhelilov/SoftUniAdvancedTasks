import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fix_Emails_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        LinkedHashMap<String, String> namesWithEmails = new LinkedHashMap<>();

        while (!name.equals("stop")){
            String email = sc.nextLine();

            if(email.endsWith("us") || email.endsWith("uk") || email.endsWith("com")){

            }else{
                if(!namesWithEmails.containsKey(name)){
                    namesWithEmails.put(name, email);
                }else{
                    String currentEmail = namesWithEmails.get(name);
                    currentEmail = email;
                    namesWithEmails.put(name, currentEmail);
                }
            }
            name = sc.nextLine();
        }
        for (Map.Entry<String, String> stringStringEntry : namesWithEmails.entrySet()) {
            System.out.printf("%s -> %s%n",stringStringEntry.getKey(),stringStringEntry.getValue());
        }

    }
}
