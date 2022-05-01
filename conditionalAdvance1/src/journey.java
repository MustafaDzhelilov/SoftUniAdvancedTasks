import java.text.DecimalFormat;
import java.util.Scanner;

public class journey {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");

            double budget = Double.parseDouble(scan.nextLine());
            String season = scan.nextLine();

            String destination = " ";
            double expenses = 0;
            String type = " ";

            switch (season) {
                case "summer":
                    if (budget <= 100) {
                        destination = "Bulgaria";
                        expenses = budget * 0.30;
                    } else if (budget <= 1000) {
                        destination = "Balkans";
                        expenses = budget * 0.40;
                    } else {
                        destination = "Europe";
                        expenses = budget * 0.90;
                    }
                    break;
                case "winter":
                    if (budget <= 100) {
                        destination = "Bulgaria";
                        expenses = budget * 0.70;
                    } else if (budget <= 1000) {
                        destination = "Balkans";
                        expenses = budget * 0.80;
                    } else {
                        destination = "Europe";
                        expenses = budget * 0.90;
                    }
                    break;
            }
            if(season.equals("summer")&& !destination.equals("Europe")){
                type = "Camp";
            }else if(season.equals("winter")&& !destination.equals("Europe")){
                type = "Hotel";
            }else if(destination.equals("Europe")){
                type ="Hotel";
            }
            System.out.println("Somewhere in "+destination);
            System.out.println(type + " - "+dF.format(expenses));
        }
    }





