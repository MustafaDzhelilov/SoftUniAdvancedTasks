package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_to_binary_divide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

       if(number == 0){
           System.out.println(0);
       }else{
           while (number !=0) {
               stack.push(String.valueOf(number % 2));
               number /= 2;
           }
       }
        for (String s : stack) {
            System.out.print(s);
        }
    }
}
