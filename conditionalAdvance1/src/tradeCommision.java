import java.util.Scanner;

public class tradeCommision {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String city = scan.nextLine();
            double volume = Double.parseDouble(scan.nextLine());

            double result = 0;

            switch (city) {
                case "Sofia":
                    if (volume >= 0 && volume <= 500) {
                        result = 0.05 * volume;
                    } else if (volume > 500 && volume <= 1000) {
                        result = 0.07 * volume;
                    } else if (volume > 1000 && volume <= 10000) {
                        result = 0.08 * volume;
                    } else if (volume > 10000) {
                        result = 0.12 * volume;
                    } else {
                        System.out.println("error");
                    }
                    break;


                case "Varna":
                    if (volume >= 0 && volume <= 500) {
                        result = 0.045 * volume;
                    } else if (volume > 500 && volume <= 1000) {
                        result = 0.075 * volume;
                    } else if (volume > 1000 && volume <= 10000) {
                        result = 0.10 * volume;
                    } else if (volume > 10000) {
                        result = 0.13 * volume;
                    } else {
                        System.out.println("error");
                    }
                    break;


                case "Plovdiv":
                    if (volume >= 0 && volume <= 500) {
                        result = 0.055 * volume;
                    } else if (volume > 500 && volume <= 1000) {
                        result = 0.08 * volume;
                    } else if (volume > 1000 && volume <= 10000) {
                        result = 0.12 * volume;
                    } else if (volume > 10000) {
                        result = 0.145 * volume;
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }

            if(result !=0) {
                System.out.printf("%.2f", result);
            }


        }


    }





