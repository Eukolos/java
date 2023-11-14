package com.eukolos.effectivejava.chapter3.item10;

import org.w3c.dom.css.Counter;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {
    private static final AtomicInteger counter =
            new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }


    public static void main(String[] args) {
        CounterPoint cp = new CounterPoint(1, 2);

        System.out.println("CounterPoint: " + numberCreated());
    }
}
