package com.eukolos.effectivejava.chapter2.item6;

public class Main {

    private final String name = "Eukolos";
    private final String surname = "Eukolos";

    private final String name2 = new String("Eukolos");
    private final String surname2 = new String("Eukolos");
    private final Integer anInt = 5;

    private final String hashCodes = name.hashCode() + " " + surname.hashCode() + " " + name2.hashCode() + " " + surname2.hashCode();

    public Main() {
        System.out.println(hashCodes);
        anInt.toString();
        String.valueOf(anInt); // right way
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.name == main.surname);
        System.out.println(main.name2 == main.surname2);
        System.out.println(main.name.equals(main.surname));
        System.out.println(main.name2.equals(main.surname2));
    }




}
