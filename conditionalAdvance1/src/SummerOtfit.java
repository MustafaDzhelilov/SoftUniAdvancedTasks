import java.text.DecimalFormat;
import java.util.Scanner;

public class SummerOtfit {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");
            int gradus = Integer.parseInt(scan.nextLine());
            String dayType = scan.nextLine();
            String outfit = "";
            String shoes = "";

            if(dayType.equals("Morning")&& gradus >=10 && gradus <=18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if(dayType.equals("Afternoon")&& gradus >=10 && gradus <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(dayType.equals("Evening")&& gradus >=10 && gradus <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(dayType.equals("Morning")&& gradus >18 && gradus <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(dayType.equals("Afternoon")&& gradus >18 && gradus <=24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if(dayType.equals("Evening")&& gradus >18 && gradus <=24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(dayType.equals("Morning")&& gradus >=25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if(dayType.equals("Afternoon")&& gradus >=25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }else if(dayType.equals("Evening")&& gradus >=25){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            System.out.println("It's " + gradus + " degrees, get your " + outfit + " and "+shoes + ".");
        }
    }





