package com.eukolos.effectivejava.chapter6.item34;

public class Main {

    public static void main(String[] args) {
        Planet planet = Planet.JUPITER;

        System.out.println(planet.surfaceWeight(10));
        System.out.println(planet.mass());

        Operation operation = Operation.PLUS;

        System.out.println(operation.apply(10, -20));

    }
}
