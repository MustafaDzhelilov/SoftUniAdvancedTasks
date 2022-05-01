
import java.text.DecimalFormat;
import java.util.Scanner;

public class inTheTimeInExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("00");

        int hourOfExam = Integer.parseInt(scan.nextLine());
        int minutsOfExam = Integer.parseInt(scan.nextLine());
        int hourOfArrival = Integer.parseInt(scan.nextLine());
        int minutsOfArrival = Integer.parseInt(scan.nextLine());

        String onTime = " ";

        int sumOfMinutsStarts = (hourOfExam * 60) + minutsOfExam;
        int sumOfMinutsArrival = (hourOfArrival * 60) + minutsOfArrival;

        int result = 0;


        if (sumOfMinutsStarts > sumOfMinutsArrival) {
            result = sumOfMinutsStarts - sumOfMinutsArrival;
            if (result <= 30) {
                onTime = "On Time";
                int minutArrivalBefore = result % 60;
                System.out.println(onTime);
                System.out.println(minutArrivalBefore + " minutes before the start");
            } else if (result > 31) {
                onTime = "Early";
                if (result / 60 != 0) {
                    String before = " hours before the start";
                    int hour = result / 60;
                    int minut = result % 60;
                    System.out.println(onTime );
                    System.out.println(hour + ":" + dF.format(minut) + before);
                } else {
                    int minut1 = result % 60;
                    System.out.println(onTime );
                    System.out.println(dF.format(minut1) + " minutes before the start");
                }
            }
        } else if (sumOfMinutsStarts - sumOfMinutsArrival == 0) {
            onTime = "On Time";
            System.out.println(onTime);
        }
        if (sumOfMinutsArrival > sumOfMinutsStarts) {
            onTime = "Late";
            result = sumOfMinutsArrival - sumOfMinutsStarts;
            if (result / 60 != 0) {
                String late = " hours after the start";
                int lateHour = result / 60;
                int lateMinuts = result % 60;
                System.out.println(onTime );
                System.out.println(lateHour + ":" + dF.format(lateMinuts) + late);
            } else {
                int lateMinuts1 = result % 60;
                System.out.println(onTime );
                System.out.println(dF.format(lateMinuts1) + " minutes after the start");
            }
        }
    }
}







