import java.text.DecimalFormat;
import java.util.Scanner;

public class Voleyboll {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#");

            String yeaarType = scan.nextLine();
            int holidayCount = Integer.parseInt(scan.nextLine());
            int countOfJourneyToBirthCity = Integer.parseInt(scan.nextLine());

            double plusPlay = 0.0;

            double differenceOfWeekend = 48 - countOfJourneyToBirthCity;
            double sumOfWeekendInSofia = differenceOfWeekend * (3.0/4);
            double sumOfHolidayPlay = holidayCount * (2.0/3);
            double sumOfPlay = sumOfHolidayPlay + sumOfWeekendInSofia + countOfJourneyToBirthCity;

            if(yeaarType.equals("leap")){
                plusPlay = sumOfPlay + (sumOfPlay * 0.15);
            }else {
                plusPlay = sumOfPlay;
            }
            System.out.println(dF.format(Math.floor(plusPlay)));

        }
    }
