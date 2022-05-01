import java.text.DecimalFormat;
import java.util.Scanner;

public class mountainRunExam {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("0.00");

            double recordInSeconds = Double.parseDouble(scan.nextLine());
            double meters = Double.parseDouble(scan.nextLine());
            double secondsForMeters = Double.parseDouble(scan.nextLine());

            double result  = (30 * Math.floor(meters /50));
            double sum = meters * secondsForMeters +result;

            if(sum < recordInSeconds){
                System.out.println("Yes! The new record is " + dF.format(sum)+ " seconds.");
            }else{
                double needSeconds = sum-recordInSeconds;
                System.out.println("No! He was "+dF.format(needSeconds)+" seconds slower.");
            }
        }
    }

