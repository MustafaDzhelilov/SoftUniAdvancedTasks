package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();

        String line  = sc.nextLine();

        String current = "";

        while (!line.equals("Home")){
            if(line.equals("back")){
                if(!browser.isEmpty()){
                    current = browser.pop();
                }else{
                    System.out.println("no previous URLs");
                    line = sc.nextLine();
                    continue;
                }
            }else{
                if(!current.equals("")){
                    browser.push(current);
                }
                current = line;
            }
            System.out.println(current);
            line = sc.nextLine();
        }


    }
}
