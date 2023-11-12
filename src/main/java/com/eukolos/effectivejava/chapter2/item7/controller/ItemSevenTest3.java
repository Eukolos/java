package com.eukolos.effectivejava.chapter2.item7.controller;

import com.eukolos.effectivejava.chapter2.item7.Stack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemSevenTest3 {

    @GetMapping("/hello3")
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 1; i < 10000000; i++)
        {
            stack.push(i);
        }

        for (int i = 1; i < 10000000; i++)
        {
            stack.popWell();
        }

        System.out.println("hello");

    }

}
