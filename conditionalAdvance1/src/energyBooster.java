import java.text.DecimalFormat;
import java.util.Scanner;

public class energyBooster {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("0.00");

            String fruit = scan.nextLine();
            String sizeOfSet = scan.nextLine();
            int countOfSets = Integer.parseInt(scan.nextLine());

            double price = 0;
            double sum = 0;

            if (fruit.equals("Watermelon") && sizeOfSet.equals("small")) {
                price = 2 * 56;
                sum = countOfSets * price;
            } else if (fruit.equals("Mango") && sizeOfSet.equals("small")) {
                price = 2 * 36.66;
                sum = countOfSets * price;
            } else if (fruit.equals("Pineapple") && sizeOfSet.equals("small")) {
                price = 2 * 42.10;
                sum = countOfSets * price;
            } else if (fruit.equals("Raspberry") && sizeOfSet.equals("small")) {
                price = 2 * 20;
                sum = countOfSets * price;
            } else if (fruit.equals("Watermelon") && sizeOfSet.equals("big")) {
                price = 5 * 28.70;
                sum = countOfSets * price;
            } else if (fruit.equals("Mango") && sizeOfSet.equals("big")) {
                price = 5 * 19.60;
                sum = countOfSets * price;
            } else if (fruit.equals("Pineapple") && sizeOfSet.equals("big")) {
                price = 5 * 24.80;
                sum = countOfSets * price;
            } else if (fruit.equals("Raspberry") && sizeOfSet.equals("big")) {
                price = 5 * 15.20;
                sum = countOfSets * price;
            }

            double discount = 0;
            double resulAfterDisc = 0;
            if(sum >=400 && sum <=1000){
                discount = 0.15;
                resulAfterDisc = sum * 0.15;
            }else if(sum > 1000){
                discount = 0.5;
                resulAfterDisc = sum * 0.5;
            }
            System.out.println(dF.format(sum-resulAfterDisc) + " lv.");



        }

    }

