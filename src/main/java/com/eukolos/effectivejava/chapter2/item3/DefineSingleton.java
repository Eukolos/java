package com.eukolos.effectivejava.chapter2.item3;

public class DefineSingleton {

    public static DefineSingleton ds = new DefineSingleton();

    private DefineSingleton() {
    }


    public static DefineSingleton getInstance()
    {
        return ds;
    }

}