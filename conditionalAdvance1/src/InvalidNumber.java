import java.util.Scanner;

public class InvalidNumber {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            int number = Integer.parseInt(scan.nextLine());

            String isValid = "";

            if(number >= 100 && number <=200){
                isValid = "valid";
                System.out.println("");
            }else if(number == 0){
                isValid = "valid";
                System.out.println("");
            }else{
                isValid = "invalid";
                System.out.println(isValid);

            }



        }


    }



