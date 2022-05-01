package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements to push  into the stack
        int s = sc.nextInt(); // number of elements to pop
        int x = sc.nextInt(); // check whether is present in the stack

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //n на брой пъти добавяме
        for (int count = 1; count <= n; count++) {
            stack.push(sc.nextInt());
        }

        for (int count = 1; count <= s; count++) {
            stack.pop();
        }

        //x число, за което проверяваме дали е в стека
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }
    }
}
