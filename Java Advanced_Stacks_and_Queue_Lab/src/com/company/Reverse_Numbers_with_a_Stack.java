package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayDeque<String> stack =  new ArrayDeque<>();
        String[] splitedInput = input.split(" ");

        for (String s : splitedInput) {
            stack.push(s);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
