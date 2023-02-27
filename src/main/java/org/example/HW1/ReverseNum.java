package org.example.HW1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < number; i++)
            stack.push(scanner.nextInt());
        System.out.println(stack);
        while (stack.size()>0)
            System.out.print("->" + stack.pop());
    }
}
