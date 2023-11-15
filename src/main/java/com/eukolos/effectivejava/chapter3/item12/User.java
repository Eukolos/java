package com.eukolos.effectivejava.chapter3.item12;

import lombok.ToString;
// @ToString annotation from lombok but not recommended because when using this annotation can be a problem hibernate relations
public class User {
    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return name + " " + surname + " " + age;
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


}
