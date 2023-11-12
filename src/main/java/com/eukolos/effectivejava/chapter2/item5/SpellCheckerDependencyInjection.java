package com.eukolos.effectivejava.chapter2.item5;

public class SpellCheckerDependencyInjection {

    private final Dictionary dictionary;


    public SpellCheckerDependencyInjection(Dictionary dictionary) {
        // TODO Auto-generated constructor stub
        this.dictionary = dictionary;
    }

    public boolean isValid()
    {
        return true;
    }

    public static String upuzunBayağıUzunBirMetodYazıyorumŞuAnda()
    {
        return "";
    }

}