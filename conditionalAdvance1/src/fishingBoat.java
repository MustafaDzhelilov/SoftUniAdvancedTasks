import java.text.DecimalFormat;
import java.util.Scanner;

public class fishingBoat {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");

            int budget = Integer.parseInt(scan.nextLine());
            String  season = scan.nextLine();
            int fisherCount = Integer.parseInt(scan.nextLine());

            double price = 0;

            switch (season){
                case "Spring":
                    price = 3000;
                    break;
                case "Summer":
                    price = 4200;
                    break;
                case "Autumn":
                    price = 4200;
                    break;
                case "Winter":
                    price = 2600;
                    break;
            }
            if(fisherCount <=6){
                price = price - price * 0.10;
            }else if(fisherCount <=11){
                price = price- price *0.15;
            }else {
                price = price - price * 0.25;
            }
            if(fisherCount % 2 == 0 && !season.equals("Autumn")){
                price = price - price * 0.05;
            }
            if(budget >= price){
                double leftMoney = budget - price;
                System.out.printf("Yes! You have %.2f leva left.", leftMoney);
            }else{
                double needMoney = price - budget;
                System.out.printf("Not enough money! You need %.2f leva.", needMoney);
            }
        }
    }





