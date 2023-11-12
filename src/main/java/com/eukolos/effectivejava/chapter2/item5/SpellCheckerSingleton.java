package com.eukolos.effectivejava.chapter2.item5;

public class SpellCheckerSingleton {

    private final static Dictionary dictionary = new Dictionary("English");
    public static SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

    private SpellCheckerSingleton() {
        // TODO Auto-generated constructor stub
    }

    public boolean isValid()
    {
        return true;
    }

}