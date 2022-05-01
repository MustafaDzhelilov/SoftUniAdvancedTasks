import java.text.DecimalFormat;
import java.util.Scanner;

public class fitnessCard {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("0.00");

            double moneyInStarts = Double.parseDouble(scan.nextLine());
            String gender = scan.nextLine();
            int age = Integer.parseInt(scan.nextLine());
            String sportsName = scan.nextLine();

            double price = 0;

            if (sportsName.equals("Gym") && gender.equals("m")) {
                price = 42;
            } else if (sportsName.equals("Boxing") && gender.equals("m")) {
                price = 41;
            } else if (sportsName.equals("Yoga") && gender.equals("m")) {
                price = 45;
            } else if (sportsName.equals("Zumba") && gender.equals("m")) {
                price = 34;
            } else if (sportsName.equals("Dances") && gender.equals("m")) {
                price = 51;
            } else if (sportsName.equals("Pilates") && gender.equals("m")) {
                price = 39;
            } else if (sportsName.equals("Gym") && gender.equals("f")) {
                price = 35;
            } else if (sportsName.equals("Boxing") && gender.equals("f")) {
                price = 37;
            } else if (sportsName.equals("Yoga") && gender.equals("f")) {
                price = 42;
            } else if (sportsName.equals("Zumba") && gender.equals("f")) {
                price = 31;
            } else if (sportsName.equals("Dances") && gender.equals("f")) {
                price = 53;
            } else if (sportsName.equals("Pilates") && gender.equals("f")) {
                price = 37;
            }
            if (age <=19){
                price = price - (price * 0.20);
            }
            if(moneyInStarts > price){
                System.out.println("You purchased a 1 month pass for " + sportsName +".");
            }else if(moneyInStarts < price){
                double needMoney = price - moneyInStarts;
                System.out.println("You don't have enough money! You need " + dF.format(needMoney) +" more.");
            }
        }
    }
