package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        boolean areBalanced = false;

        for (int i = 0; i < input.length() / 2; i++) {
            char currentParentheses = input.charAt(i);
            if(currentParentheses == '(' || currentParentheses == '{' || currentParentheses == '['){
                stack.push(String.valueOf(currentParentheses));
            }else{
                System.out.println("NO");
                break;
            }
        }

        for (int i = input.length() / 2 ; i < input.length() ; i++) {
            char currentPar = input.charAt(i);
            if(String.valueOf(currentPar).equals(")") && stack.pop().equals("(")){
                areBalanced = true;
            }else if(String.valueOf(currentPar).equals("}") && stack.pop().equals("{")){
                areBalanced = true;
            }else if(String.valueOf(currentPar).equals("]") && stack.pop().equals("[")){
                areBalanced = true;
            }else{
                areBalanced = false;
                break;
            }
        }

        if(!areBalanced){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
