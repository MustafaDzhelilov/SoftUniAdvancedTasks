import java.text.DecimalFormat;
import java.util.Scanner;

public class hotelRoom {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");

            String month = scan.nextLine();
            int countOfDay = Integer.parseInt(scan.nextLine());
            double studio = 0;
            double apartment = 0;
            double sum = 0;
            double sum1 = 0;

            switch (month) {
                case "May":
                case "October":
                    studio = 50;
                    apartment = 65;
                    sum = studio * countOfDay ;
                    sum1 = apartment  * countOfDay ;
                    if (countOfDay <7) {
                        sum = sum-0;
                        sum1 = sum1 - 0;
                    } else if (countOfDay <14) {
                        sum = sum - (sum * 0.05);
                        sum1 = sum1 - 0;
                    }else if(countOfDay>14){
                        sum = sum - (sum *0.30);
                        sum1 = sum1 - (sum1 * 0.10);
                    }
                    break;
                case "June":
                case "September":
                    studio = 75.20;
                    apartment = 68.70;
                    sum = studio * countOfDay ;
                    sum1 = apartment * countOfDay ;
                    if (countOfDay >14) {
                        sum = sum - (sum * 0.20);
                        sum1 = sum1 - (sum1 * 0.10);
                    }
                    break;
                case "July":
                case "August":
                    studio = 76;
                    apartment = 77;
                    sum = studio * countOfDay ;
                    sum1 = apartment * countOfDay ;
                    if (countOfDay >14) {
                        sum1 = sum1 - (sum1 * 0.10);
                    }
                    break;
            }
            System.out.println("Apartment: "+dF.format(sum1)+" lv.");
            System.out.println("Studio: "+dF.format(sum)+" lv.");

        }
    }