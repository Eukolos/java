package com.eukolos.oop.encapsulation.encapsulated;

class Deneme {
    private String name;
    private String surname;

    Deneme(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected String getName() {
        return name;
    }
}
