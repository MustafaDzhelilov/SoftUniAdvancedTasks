import java.util.Scanner;

public class fruitOrVegetable {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String fruit = scan.nextLine();

            switch (fruit){
                case "banana":
                case "apple":
                case "kiwi":
                case "cherry":
                case "lemon":
                case "grapes":
                    System.out.println("fruit");
                    break;
                case "tomato":
                case "cucumber":
                case "pepper":
                case "carrot":
                    System.out.println("vegetable");
                    break;
                default:
                    System.out.println("unknown");
                    break;
            }

        }


    }


