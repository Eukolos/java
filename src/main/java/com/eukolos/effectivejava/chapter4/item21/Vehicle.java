package com.eukolos.effectivejava.chapter4.item21;

public interface Vehicle {

    default void engineStart() {
        System.out.println("Engine started");
    }
}
