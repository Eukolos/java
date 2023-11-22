package com.eukolos.oop.abstraction;

public class Bear extends Animal {
    public static String name = "Bear";

    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.label();
        bear.makeSound();
        bear.eat();
        bear.move();

        System.out.println("Is bear alive? " + LivingCreature.isAlive);
        System.out.println(name);
    }
}
