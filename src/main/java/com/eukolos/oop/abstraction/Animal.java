package com.eukolos.oop.abstraction;

public abstract  class  Animal {


    String name;

    // abstract methods
    void move() {
        System.out.println("Animal moves");
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    // concrete method
    void  label()  {
        System.out.println("Animal's data:");
    }
}
