import java.text.DecimalFormat;
import java.util.Scanner;

public class operationsBetweenNumbers {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            DecimalFormat dF = new DecimalFormat("#.00");

            int number = Integer.parseInt(scan.nextLine());
            int number1 = Integer.parseInt(scan.nextLine());
            String operators = scan.nextLine();

            int result = 0;

            switch (operators) {
                case "+":
                    result = number + number1;
                    if (result % 2 == 0) {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result+" - even");
                    } else {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result+" - odd");
                    }
                    break;
                case "-":
                    result = number - number1;
                    if (result % 2 == 0) {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result+" - even");
                    } else {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result+" - odd");
                    }
                    break;
                case "*":
                    result = number * number1;
                    if (result % 2 == 0) {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result+" - even");
                    } else {
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " +result+" - odd");
                    }
                    break;
                case "/":
                    if(number1==0) {
                        System.out.println("Cannot divide "+number+" by zero");
                    }else {
                        double delenie = number * 1.0/ number1;
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + dF.format(delenie));
                    } break;
                case "%":
                    if(number1==0){
                        System.out.println("Cannot divide "+number+" by zero");
                    }else {
                        result = number % number1;
                        System.out.println(number + " " + operators + " " + number1 + " " + "= " + result);
                    }break;
            }
        }
    }






