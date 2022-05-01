package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Maximum_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < countOfCommands; i++) {
            String command = sc.nextLine();

            if(command.equals("2")){
                stack.pop();
            }else if(command.equals("3")){
                if(!stack.isEmpty()){
                    int min = Integer.MIN_VALUE;
                    for (Integer s : stack) {
                        if(min < s){
                            min = s;
                        }
                    }
                    System.out.println(min);
                }
            }else if(command.split(" ")[0].equals("1")){
                int pushElement = Integer.parseInt(command.split(" ")[1]);
                stack.push(pushElement);
            }
        }

    }
}
