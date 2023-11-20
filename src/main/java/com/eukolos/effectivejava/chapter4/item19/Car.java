package com.eukolos.effectivejava.chapter4.item19;

public class Car extends Vehicle{
    // super(); // method came from super overrided in this class
    @Override
    public void engineStart() {
        System.out.println("Car engine started.");
    }

    public static void main(String[] args) {
        new Car();
    }
}
