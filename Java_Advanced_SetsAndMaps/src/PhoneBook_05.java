import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        HashMap<String, String> phoneBook = new HashMap<>();

        while (!input.equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];
            if(!phoneBook.containsKey(name)){
                phoneBook.put(name, number);
            }else{
                String currentNumber = phoneBook.get(name);{
                currentNumber = number;
                phoneBook.put(name, currentNumber);
                }
            }
            input = sc.nextLine();
        }
        String command = sc.nextLine();
        while (!command.equals("stop")){
            if(phoneBook.containsKey(command)){
                System.out.println(command + " -> " + phoneBook.get(command));
            }else{
                System.out.printf("Contact %s does not exist.%n", command);
            }
            command = sc.nextLine();
        }
    }
}
