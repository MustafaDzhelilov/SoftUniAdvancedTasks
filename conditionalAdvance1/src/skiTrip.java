import java.util.Scanner;

public class skiTrip {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int day = Integer.parseInt(scan.nextLine());
            String typeOfRoom = scan.nextLine();
            String evaluation = scan.nextLine();

            double result = 0;
            double sum = 0;
            double dobavka = 0;
            double sumis = 0;

            switch (typeOfRoom) {
                case "room for one person":
                    result = (day - 1)* 18*-1;
                    break;
                case "apartment":
                    if (day < 10) {
                        sum = (day -1 )*25;
                        result = sum * 0.30;
                    } else if ((day > 10) && (day <= 15)) {
                        sum= (day - 1 )*25;
                        result= sum *0.35;
                    } else if (day > 15) {
                        sum= (day -1 )* 25;
                        result = sum * 0.50;
                    }
                    break;
                case "president apartment":
                    if (day < 10) {
                        sum= (day -1 )*35;
                        result = sum *0.10;
                    } else if ((day > 10) && (day <= 15)) {
                        sum= (day -1 ) *35;
                        result = sum * 0.15;
                    } else if (day > 15) {
                        sum= (day -1 )*35;
                        result = sum *0.20;
                    }
                    break;
                default:
                    System.out.println("error");
            }
            double sumOfEnd = sum-result;
            if (evaluation.equals("positive")) {
                dobavka = sumOfEnd *0.25;
                sumis = sumOfEnd + dobavka;
            } else if (evaluation.equals("negative")) {
                dobavka = sumOfEnd*0.10;
                sumis = sumOfEnd - dobavka;
            }
            System.out.printf("%.02f",sumis);
        }
    }





