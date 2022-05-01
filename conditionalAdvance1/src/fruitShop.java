import java.text.DecimalFormat;
import java.util.Scanner;

public class fruitShop {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("0.00");


            String fruit = scan.nextLine();
            String dayOfWeek = scan.nextLine();
            Double quantity = Double.parseDouble(scan.nextLine());

            double price = 0;
            double sum = 0;

            if (fruit.equals("banana")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.50;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 2.70;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }

            else if (fruit.equals("apple")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.20;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.25;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }

            else if (fruit.equals("orange")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 0.85;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 0.90;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }

            else  if (fruit.equals("grapefruit")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 1.45;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 1.60;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }

            else if (fruit.equals("kiwi")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 2.70;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 3.00;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }
            else if (fruit.equals("pineapple")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 5.50;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 5.60;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;

                }
            }

            else if (fruit.equals("grapes")) {
                switch (dayOfWeek) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        price = 3.85;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    case "Saturday":
                    case "Sunday":
                        price = 4.20;
                        sum = price * quantity;
                        System.out.println(dF.format(sum));
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }else{
                System.out.println("error");
            }






        }


    }





