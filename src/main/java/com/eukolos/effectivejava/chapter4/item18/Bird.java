package com.eukolos.effectivejava.chapter4.item18;

public class Bird extends Animal {

    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static void main(String[] args) {
        System.out.println(new Bird("Kuş", "Kanatlı").name);
    }
}
