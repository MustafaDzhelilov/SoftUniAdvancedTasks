package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements to push  into the stack
        int s = sc.nextInt(); // number of elements to pop
        int x = sc.nextInt(); // check whether is present in the stack

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        //n на брой пъти добавяме
        for (int count = 1; count <= n; count++) {
            queue.offer(sc.nextInt());
        }

        for (int count = 1; count <= s; count++) {
            queue.poll();
        }

        //x число, за което проверяваме дали е в стека
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println(0);
            }
        }
    }
}
