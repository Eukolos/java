package com.eukolos.effectivejava.item7;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i < 20; i++) {
            stack.push(String.valueOf(i));
            System.out.println(stack.elements);
        }

    }
}
