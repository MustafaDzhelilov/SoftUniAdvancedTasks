import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinema {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");
            String cinemaType = scan.nextLine();
            int line = Integer.parseInt(scan.nextLine());
            int column = Integer.parseInt(scan.nextLine());
            double result = 0;
            switch (cinemaType){
                case "Premiere":
                    result = (line * column) * 12;
                    break;
                case "Normal":
                    result = (line * column) * 7.50;
                    break;
                case "Discount":
                    result = (line * column) * 5;
                    break;
            }
            System.out.println(dF.format(result) + " leva");
        }
    }





