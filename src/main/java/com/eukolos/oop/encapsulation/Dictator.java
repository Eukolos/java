package com.eukolos.oop.encapsulation;

public class Dictator {
    private String name;
    private String surname;
    private int age;
    private Long IdentityNumber;

    private Dictator() {
        throw new AssertionError("No Dictator without imperialistic ambitions!");
    }
}
